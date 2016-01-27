package com.keq.gis.persistence;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.keq.gis.model.Eess;
import com.keq.gis.model.Gasolinera;
import com.keq.gis.model.ListaEESSPrecio;

@Repository
public class GasolineraDaoJpa implements GasolineraDaoItf {
	
	@PersistenceContext(type = PersistenceContextType.EXTENDED)
	private EntityManager entityManager;
	
	@Transactional
	public void persistirGasolineraMinisterio(ListaEESSPrecio listaEESSPrecio) {
		try {
			System.out.println(listaEESSPrecio);
			entityManager.persist(listaEESSPrecio);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	@Transactional
	public void persistirListadoGasolinerasMinisterio(Eess eess) {
		List<ListaEESSPrecio> listadoGasolineras = eess.getListaEESSPrecio();
		Date date =null;
		try {
			DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			date = formatter.parse(eess.getFecha());
			
			for (ListaEESSPrecio listaEESSPrecio : listadoGasolineras) {
				listaEESSPrecio.setFecha(date);
				entityManager.persist(listaEESSPrecio);
				entityManager.flush();
			}

			
		} catch (ParseException parseEx) {
			System.out.print("problema al convertir la fecha" + parseEx);
		}finally{
			entityManager.clear();
		}
		
	}
	@Transactional
	public void actualizarDB() {
		try{
			System.out.print("clase gasolineraDaoJpa metodo actualizar");
			entityManager.createNativeQuery("SELECT count(*) FROM public.actualizar_datos_gasolineras()").getSingleResult();
		}catch(Exception e ){
			System.out.print("clase gasolineraDaoJpa metodo actualizar exception");
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Gasolinera> cargarTodasGasolinerasDB() {
		try{
			return entityManager.createQuery("SELECT g FROM gasolineras g").getResultList();
		}catch(Exception e ){
			System.out.println("excepcion query bd");
			e.printStackTrace();
		}
		return null;
	}
	
	
	public Gasolinera buscarGasolineraPorClave(String clave) {
		try{
			return entityManager.find(Gasolinera.class, clave);
		}catch(Exception e ){
			System.out.println("excepcion buscando gasolinera por clave");
			e.printStackTrace();
		}
		return null;
	}

	
	//getters and setters
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}




}

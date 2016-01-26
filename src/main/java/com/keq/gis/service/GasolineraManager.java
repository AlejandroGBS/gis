package com.keq.gis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import com.keq.gis.model.Eess;
import com.keq.gis.model.Gasolinera;
import com.keq.gis.persistence.GasolineraDaoItf;

@Service
public class GasolineraManager implements GasolineraManagerIfz {

	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private GasolineraDaoItf gasolineraDaoItf;


	public Eess obtenerListadoGasolinerasMinisterioRest() {
		System.out.print("entra al metodo");
		// Add the Jackson message converter
		restTemplate.getMessageConverters().add(
				new MappingJackson2HttpMessageConverter());
		ResponseEntity<Eess> gasolinerasMInisterioREST = restTemplate
				.getForEntity(
						"https://sedeaplicaciones.minetur.gob.es/ServiciosRESTCarburantes/PreciosCarburantes/EstacionesTerrestres/",
						Eess.class);
		System.out.println("Response Status : "	+ gasolinerasMInisterioREST.getStatusCode());
		System.out.print(gasolinerasMInisterioREST);
		HttpHeaders headers = gasolinerasMInisterioREST.getHeaders();
		System.out.println("headers in response are : " + headers);
		Eess eess = gasolinerasMInisterioREST
				.getBody();
		return eess;
	}

	public void persistirEess(Eess eess) {
		gasolineraDaoItf.persistirListadoGasolinerasMinisterio(eess);
		
	}
	
	public void actualizarDB() {
		gasolineraDaoItf.actualizarDB();		
	}
	
	public List<Gasolinera> cargarTodasGasolinerasDB() {
		
		for (Gasolinera gasolinera1 : gasolineraDaoItf.cargarTodasGasolinerasDB()) {
			System.out.println(gasolinera1);
		}
		return gasolineraDaoItf.cargarTodasGasolinerasDB();
	}	

	@Override
	public Gasolinera buscarGasolineraPorClave(String clave) {
		return gasolineraDaoItf.buscarGasolineraPorClave(clave);
	}

	
	// getters and setters
	public RestOperations getRestTemplate() {
		return restTemplate;
	}

	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public GasolineraDaoItf getGasolineraDaoItf() {
		return gasolineraDaoItf;
	}

	public void setGasolineraDaoItf(GasolineraDaoItf gasolineraDaoItf) {
		this.gasolineraDaoItf = gasolineraDaoItf;
	}











}

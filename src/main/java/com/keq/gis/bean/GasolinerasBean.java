package com.keq.gis.bean;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.keq.gis.model.Gasolinera;
import com.keq.gis.service.GasolineraManagerIfz;

//@ManagedBean
//@ViewScoped
public class GasolinerasBean implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private List<Gasolinera> listaGasolineras = null;

	@Autowired
	private GasolineraManagerIfz gasolineraManagerItf;
		
	public GasolinerasBean(){};
	
	public List<Gasolinera> consultarTodasLasGasolineras(){
		listaGasolineras = gasolineraManagerItf.cargarTodasGasolinerasDB();
		return listaGasolineras;
	}
	
	//getters and setters
	public List<Gasolinera> getListaGasolineras() {
		return listaGasolineras;
	}

	public void setListaGasolineras(List<Gasolinera> listaGasolineras) {
		this.listaGasolineras = listaGasolineras;
	}

	public GasolineraManagerIfz getGasolineraManagerItf() {
		return gasolineraManagerItf;
	}

	public void setGasolineraManagerItf(GasolineraManagerIfz gasolineraManagerItf) {
		this.gasolineraManagerItf = gasolineraManagerItf;
	}
	
	
	

}

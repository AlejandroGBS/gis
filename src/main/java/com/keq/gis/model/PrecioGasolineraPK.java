package com.keq.gis.model;

import java.io.Serializable;
import java.util.Date;

public class PrecioGasolineraPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String gasolinera_clave;
	
	private Date fecha;


	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getGasolinera_clave() {
		return gasolinera_clave;
	}

	public void setGasolinera_clave(String gasolinera_clave) {
		this.gasolinera_clave = gasolinera_clave;
	}
	
	
}

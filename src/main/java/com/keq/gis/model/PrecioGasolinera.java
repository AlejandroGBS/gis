package com.keq.gis.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name="precio_gasolinera_diario")
@IdClass(PrecioGasolineraPK.class)
public class PrecioGasolinera implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(insertable=false, updatable= false)
	private String gasolinera_clave;
	
	private Double gasoilA;
	
	private Double nuevoGasoilA;
	
	private Double gasolina95;
	
	private Double gasolina98;
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	@Id
	private Date fecha;
	
	@ManyToOne
	@JsonBackReference
	private Gasolinera gasolinera;

	
	//getters and setters
	public String getGasolinera_clave() {
		return gasolinera_clave;
	}

	public void setGasolinera_clave(String gasolinera_clave) {
		this.gasolinera_clave = gasolinera_clave;
	}

	public Double getGasoilA() {
		return gasoilA;
	}

	public void setGasoilA(Double gasoilA) {
		this.gasoilA = gasoilA;
	}

	public Double getGasolina95() {
		return gasolina95;
	}

	public void setGasolina95(Double gasolina95) {
		this.gasolina95 = gasolina95;
	}

	public Double getGasolina98() {
		return gasolina98;
	}

	public void setGasolina98(Double gasolina98) {
		this.gasolina98 = gasolina98;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Double getNuevoGasoilA() {
		return nuevoGasoilA;
	}

	public void setNuevoGasoilA(Double nuevoGasoilA) {
		this.nuevoGasoilA = nuevoGasoilA;
	}

	public Gasolinera getGasolinera() {
		return gasolinera;
	}

	public void setGasolinera(Gasolinera gasolinera) {
		this.gasolinera = gasolinera;
	}
	
}

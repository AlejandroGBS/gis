package com.keq.gis.model;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name="gasolineras")
public class Gasolinera implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String clave;
	
	private String provincia;

	private String localidad;
	
	private String municipio;
	
	private String direccion;
	
	private String rotulo;
	
	private String tipoVenta;
	
	private String horario;

	private String latitud;

	private String longitudWGS8429;
	
	@OneToMany(mappedBy="gasolinera",fetch=FetchType.LAZY)
	@JsonManagedReference
	private Set<PrecioGasolinera> preciosDiarios = new LinkedHashSet<PrecioGasolinera>();
	
	//getters and setters
	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRotulo() {
		return rotulo;
	}

	public void setRotulo(String rotulo) {
		this.rotulo = rotulo;
	}

	public String getTipoVenta() {
		return tipoVenta;
	}

	public void setTipoVenta(String tipoVenta) {
		this.tipoVenta = tipoVenta;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitudWGS8429() {
		return longitudWGS8429;
	}

	public void setLongitudWGS8429(String longitudWGS8429) {
		this.longitudWGS8429 = longitudWGS8429;
	}

	public Set<PrecioGasolinera> getPreciosDiarios() {
		return preciosDiarios;
	}

	public void setPreciosDiarios(Set<PrecioGasolinera> preciosDiarios) {
		this.preciosDiarios = preciosDiarios;
	}
	
	public String toString(){
		return "Gasolinera { Clave:" + clave +  " };";
	}

}


package com.keq.gis.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "C.P.",
    "Dirección",
    "Horario",
    "Latitud",
    "Localidad",
    "Longitud (WGS84)",
    "Margen",
    "Municipio",
    "Precio Biodiesel",
    "Precio Bioetanol",
    "Precio Gas Natural Comprimido",
    "Precio Gasoleo A",
    "Precio Gasolina 95 Protección",
    "Precio Gasolina  98",
    "Precio Nuevo Gasoleo A",
    "Provincia",
    "Remisión",
    "Rótulo",
    "Tipo Venta",
    "% Bioalcohol",
    "% Éster metílico"
})
@Entity
@Table(name="listado_diario_ministerio")
public class ListaEESSPrecio implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public ListaEESSPrecio() {		
	}
	
	
	@JsonCreator
	public ListaEESSPrecio(@JsonProperty("Latitud") String Latitud1, @JsonProperty("Longitud (WGS84)") String LongitudWGS84291,
			@JsonProperty("Margen") String Margen1){
		this.clave = LongitudWGS84291 + Latitud1 + Margen1;
		this.Latitud = Latitud1;
		this.LongitudWGS8429 = LongitudWGS84291;
		this.Margen = Margen1;
	}
	
	@Id
	private String clave;
	
	@JsonProperty("C.P.")
    private String CP;
	@JsonProperty("Dirección")
    private String Direccion;
    @JsonProperty("Horario")
    private String Horario;
    @JsonProperty("Latitud")
    private String Latitud;
    @JsonProperty("Localidad")
    private String Localidad;
    @JsonProperty("Longitud (WGS84)")
    private String LongitudWGS8429;
    @JsonProperty("Margen")
    private String Margen;
    @JsonProperty("Municipio")
    private String Municipio;
    @JsonProperty("Precio Biodiesel")
    private String PrecioBiodiesel;
    @JsonProperty("Precio Bioetanol")
    private String PrecioBioetanol;
    @JsonProperty("Precio Gas Natural Comprimido")
    private String PrecioGasNaturalComprimido;
    @JsonProperty("Precio Gasoleo A")
    private String PrecioGasoleoA;
    @JsonProperty("Precio Gasolina 95 Protección")
    private String PrecioGasolina95XProteccion;
    @JsonProperty("Precio Gasolina  98")
    private String PrecioGasolina98;
    @JsonProperty("Precio Nuevo Gasoleo A")
    private String PrecioNuevoGasoleoA;
    @JsonProperty("Provincia")
    private String Provincia;
    @JsonProperty("Remisión")
    private String Remision;
    @JsonProperty("Rótulo")
    private String Rotulo;
    @JsonProperty("Tipo Venta")
    private String TipoVenta;
    @JsonProperty("% Bioalcohol")
    private String Bioalcohol;
    @JsonProperty("% Éster metílico")
    private String EterMetilico;
    @JsonIgnore
    @Transient
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @Temporal(TemporalType.DATE)
    private Date fecha;


	@JsonProperty("C.P.")
    public String getCP() {
		return CP;
	}
    @JsonProperty("C.P.")
	public void setCP(String cP) {
		CP = cP;
	}
    @JsonProperty("Dirección")
	public String getDireccion() {
		return Direccion;
	}
    @JsonProperty("Dirección")
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
    @JsonProperty("Horario")
	public String getHorario() {
		return Horario;
	}
    @JsonProperty("Horario")
	public void setHorario(String horario) {
		Horario = horario;
	}
    @JsonProperty("Latitud")
	public String getLatitud() {
		return Latitud;
	}
    @JsonProperty("Latitud")
	public void setLatitud(String latitud) {
		Latitud = latitud;
	}
    @JsonProperty("Localidad")
	public String getLocalidad() {
		return Localidad;
	}
    @JsonProperty("Localidad")
	public void setLocalidad(String localidad) {
		Localidad = localidad;
	}
    @JsonProperty("Longitud (WGS84)")
	public String getLongitudWGS8429() {
		return LongitudWGS8429;
	}
    @JsonProperty("Longitud (WGS84)")
	public void setLongitudWGS8429(String longitudWGS8429) {
		LongitudWGS8429 = longitudWGS8429;
	}
    @JsonProperty("Margen")
	public String getMargen() {
		return Margen;
	}
    @JsonProperty("Margen")
	public void setMargen(String margen) {
		Margen = margen;
	}
    @JsonProperty("Municipio")
	public String getMunicipio() {
		return Municipio;
	}
    @JsonProperty("Municipio")
	public void setMunicipio(String municipio) {
		Municipio = municipio;
	}
    @JsonProperty("Precio Biodiesel")
	public String getPrecioBiodiesel() {
		return PrecioBiodiesel;
	}
    @JsonProperty("Precio Biodiesel")
	public void setPrecioBiodiesel(String precioBiodiesel) {
		PrecioBiodiesel = precioBiodiesel;
	}
    @JsonProperty("Precio Bioetanol")
	public String getPrecioBioetanol() {
		return PrecioBioetanol;
	}
    @JsonProperty("Precio Bioetanol")
	public void setPrecioBioetanol(String precioBioetanol) {
		PrecioBioetanol = precioBioetanol;
	}
    @JsonProperty("Precio Gas Natural Comprimido")
	public String getPrecioGasNaturalComprimido() {
		return PrecioGasNaturalComprimido;
	}
    @JsonProperty("Precio Gas Natural Comprimido")
	public void setPrecioGasNaturalComprimido(String precioGasNaturalComprimido) {
		PrecioGasNaturalComprimido = precioGasNaturalComprimido;
	}
    @JsonProperty("Precio Gasoleo A")
	public String getPrecioGasoleoA() {
		return PrecioGasoleoA;
	}
    @JsonProperty("Precio Gasoleo A")
	public void setPrecioGasoleoA(String precioGasoleoA) {
		PrecioGasoleoA = precioGasoleoA;
	}
    @JsonProperty("Precio Gasolina 95 Protección")
	public String getPrecioGasolina95XProteccion() {
		return PrecioGasolina95XProteccion;
	}
    @JsonProperty("Precio Gasolina 95 Protección")
	public void setPrecioGasolina95XProteccion(String precioGasolina95XProteccion) {
		PrecioGasolina95XProteccion = precioGasolina95XProteccion;
	}
    @JsonProperty("Precio Gasolina  98")
	public String getPrecioGasolina98() {
		return PrecioGasolina98;
	}
    @JsonProperty("Precio Gasolina  98")
	public void setPrecioGasolina98(String precioGasolina98) {
		PrecioGasolina98 = precioGasolina98;
	}
    @JsonProperty("Precio Nuevo Gasoleo A")
	public String getPrecioNuevoGasoleoA() {
		return PrecioNuevoGasoleoA;
	}
    @JsonProperty("Precio Nuevo Gasoleo A")
	public void setPrecioNuevoGasoleoA(String precioNuevoGasoleoA) {
		PrecioNuevoGasoleoA = precioNuevoGasoleoA;
	}
    @JsonProperty("Provincia")
	public String getProvincia() {
		return Provincia;
	}
    @JsonProperty("Provincia")
	public void setProvincia(String provincia) {
		Provincia = provincia;
	}
	@JsonProperty("Remisión")
	public String getRemision() {
		return Remision;
	}
	@JsonProperty("Remisión")
	public void setRemision(String remision) {
		Remision = remision;
	}
	@JsonProperty("Rótulo")
	public String getRotulo() {
		return Rotulo;
	}
	@JsonProperty("Rótulo")
	public void setRotulo(String rotulo) {
		Rotulo = rotulo;
	}
	@JsonProperty("Tipo Venta")
	public String getTipoVenta() {
		return TipoVenta;
	}
	@JsonProperty("Tipo Venta")
	public void setTipoVenta(String tipoVenta) {
		TipoVenta = tipoVenta;
	}
	@JsonProperty("% Bioalcohol")
	public String getBioalcohol() {
		return Bioalcohol;
	}
	@JsonProperty("% Bioalcohol")
	public void setBioalcohol(String bioalcohol) {
		Bioalcohol = bioalcohol;
	}
	@JsonProperty("% Éster metílico")
	public String getEterMetilico() {
		return EterMetilico;
	}
	@JsonProperty("% Éster metílico")
	public void setEterMetilico(String eterMetilico) {
		EterMetilico = eterMetilico;
	}


    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
    
    public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String toString(){
		return " GasolineraMinisterio { Rotulo: " +Rotulo + ", Latitud: " +Latitud + " Longitud: " + LongitudWGS8429 + " }; ";
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
}


package com.keq.gis.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Fecha",
    "ListaEESSPrecio",
    "Nota"
})
public class Eess {

    @JsonProperty("Fecha")
    private String Fecha;
    @JsonProperty("ListaEESSPrecio")
    private List<com.keq.gis.model.ListaEESSPrecio> ListaEESSPrecio = new ArrayList<com.keq.gis.model.ListaEESSPrecio>();
    @JsonProperty("Nota")
    private String Nota;
    @JsonIgnore
    @Transient
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Fecha
     */
    @JsonProperty("Fecha")
    public String getFecha() {
        return Fecha;
    }

    /**
     * 
     * @param Fecha
     *     The Fecha
     */
    @JsonProperty("Fecha")
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    /**
     * 
     * @return
     *     The ListaEESSPrecio
     */
    @JsonProperty("ListaEESSPrecio")
    public List<com.keq.gis.model.ListaEESSPrecio> getListaEESSPrecio() {
        return ListaEESSPrecio;
    }

    /**
     * 
     * @param ListaEESSPrecio
     *     The ListaEESSPrecio
     */
    @JsonProperty("ListaEESSPrecio")
    public void setListaEESSPrecio(List<com.keq.gis.model.ListaEESSPrecio> ListaEESSPrecio) {
        this.ListaEESSPrecio = ListaEESSPrecio;
    }

    /**
     * 
     * @return
     *     The Nota
     */
    @JsonProperty("Nota")
    public String getNota() {
        return Nota;
    }

    /**
     * 
     * @param Nota
     *     The Nota
     */
    @JsonProperty("Nota")
    public void setNota(String Nota) {
        this.Nota = Nota;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

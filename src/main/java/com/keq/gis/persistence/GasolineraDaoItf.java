package com.keq.gis.persistence;

import java.util.List;

import com.keq.gis.model.Eess;
import com.keq.gis.model.Gasolinera;
import com.keq.gis.model.ListaEESSPrecio;

public interface GasolineraDaoItf {
	public void persistirGasolineraMinisterio(ListaEESSPrecio listaEESSPrecio);
	public void persistirListadoGasolinerasMinisterio(Eess eess);
	public void actualizarDB();
	public List<Gasolinera> cargarTodasGasolinerasDB();
	public Gasolinera buscarGasolineraPorClave(String clave);
	
}

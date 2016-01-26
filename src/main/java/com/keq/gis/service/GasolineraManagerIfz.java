package com.keq.gis.service;

import java.util.List;

import com.keq.gis.model.Eess;
import com.keq.gis.model.Gasolinera;

public interface GasolineraManagerIfz {
	
	public Eess obtenerListadoGasolinerasMinisterioRest();
	public void persistirEess(Eess eess);
	public void actualizarDB();
	public List<Gasolinera> cargarTodasGasolinerasDB();
	public Gasolinera buscarGasolineraPorClave(String clave);

}


package com.keq.gis.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.keq.gis.service.GasolineraManagerIfz;

@Controller
@RequestMapping(value = "/test")
public class ControllerTest {

	@Autowired
	private GasolineraManagerIfz gasolineraManagerIfz;

	@RequestMapping(value = "/test.htm", method = RequestMethod.GET)
	public String mostrarTestPage(Map<String, Object> model) {
		String var = "test";
		try {		
			
			model.put("listadoDeGasolineras", gasolineraManagerIfz
					.obtenerListadoGasolinerasMinisterioRest().getListaEESSPrecio());
			model.put("texto", var);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "test";
	}	
	

	// getters and setters
	public GasolineraManagerIfz getGasolineraManagerIfz() {
		return gasolineraManagerIfz;
	}

	public void setGasolineraManagerIfz(
			GasolineraManagerIfz gasolineraManagerIfz) {
		this.gasolineraManagerIfz = gasolineraManagerIfz;
	}
}

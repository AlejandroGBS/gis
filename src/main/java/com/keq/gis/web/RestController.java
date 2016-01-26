package com.keq.gis.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.keq.gis.model.Gasolinera;
import com.keq.gis.service.GasolineraManagerIfz;

@Controller
@RequestMapping(value = "/rest")
public class RestController {

	@Autowired
	private GasolineraManagerIfz gasolineraManagerIfz;

	@RequestMapping(value="/rest.htm")
	public String mostrarRestPage(Map<String, Object> model) {
		String var = "url path /rest/";
		try {
			model.put("texto", var);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "rest";
	}
	
	@RequestMapping(value="/gasolinera/{clave}",method= RequestMethod.GET)
	public @ResponseBody Gasolinera getGasolineraJson(@PathVariable String clave){
		
		return gasolineraManagerIfz.buscarGasolineraPorClave(clave);
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

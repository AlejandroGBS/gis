package com.keq.gis.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.keq.gis.service.GasolineraManagerIfz;

public class ScheduledJob extends QuartzJobBean {

	private GasolineraManagerIfz gasolineraManagerItf;
	
	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		gasolineraManagerItf.persistirEess(gasolineraManagerItf.obtenerListadoGasolinerasMinisterioRest());
		gasolineraManagerItf.actualizarDB();
	}

	//getter and setters
	public GasolineraManagerIfz getGasolineraManagerItf() {
		return gasolineraManagerItf;
	}

	public void setGasolineraManagerItf(GasolineraManagerIfz gasolineraManagerItf) {
		this.gasolineraManagerItf = gasolineraManagerItf;
	}

}

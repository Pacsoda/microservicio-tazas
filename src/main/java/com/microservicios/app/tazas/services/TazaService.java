package com.microservicios.app.tazas.services;

import java.util.List;

import com.microservicios.commons.services.CommonService;
import com.microservicios.commons.tazas.models.entity.Taza;

public interface TazaService extends CommonService<Taza>{

	public List<Taza> findByTipoTaza(String term);
	
}

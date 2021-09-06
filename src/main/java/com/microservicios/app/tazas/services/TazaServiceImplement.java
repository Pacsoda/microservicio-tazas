package com.microservicios.app.tazas.services;

import java.util.List;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microservicios.app.tazas.models.repository.TazaRepository;
import com.microservicios.commons.services.CommonServiceImplement;
import com.microservicios.commons.tazas.models.entity.Taza;

@Service
public class TazaServiceImplement extends CommonServiceImplement<Taza, TazaRepository> implements TazaService {

	@Override
	@Transactional(readOnly = true)
	public List<Taza> findByTipoTaza(String term) {
		return repository.findByTipoTaza(term);
	}

	

}

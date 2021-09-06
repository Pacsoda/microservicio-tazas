package com.microservicios.app.tazas.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.microservicios.commons.tazas.models.entity.Taza;

public interface TazaRepository extends CrudRepository<Taza, Long> {

	@Query("select t from Taza t where t.tipoTaza like %?1%")
	public List<Taza> findByTipoTaza(String term);
}

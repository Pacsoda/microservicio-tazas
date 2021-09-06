package com.microservicios.app.tazas.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservicios.app.tazas.services.TazaService;
import com.microservicios.commons.controllers.CommonController;
import com.microservicios.commons.tazas.models.entity.Taza;

@RestController
public class TazaController extends CommonController<Taza, TazaService> {
	
	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody Taza taza, @PathVariable Long id){
		Optional<Taza> op = service.findById(id);
		if(op.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		Taza tazadb = op.get();
		tazadb.setTipoTaza(taza.getTipoTaza());
		tazadb.setColor(taza.getColor());
		tazadb.setDimensiones(taza.getDimensiones());
		tazadb.setCapacidad(taza.getCapacidad());
		tazadb.setModelo(taza.getModelo());
		tazadb.setMaterial(taza.getMaterial());
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(tazadb));
	}
	
	@GetMapping("/filtrar/{term}")
	public ResponseEntity<?> filtrar(@PathVariable String term){
		return ResponseEntity.ok(service.findByTipoTaza(term));
		
	}
	
}

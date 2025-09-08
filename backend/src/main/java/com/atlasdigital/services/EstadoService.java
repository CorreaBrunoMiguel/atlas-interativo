package com.atlasdigital.services;

import com.atlasdigital.models.Estado;
import com.atlasdigital.repositories.EstadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 08/09/2025
 **/
@Service
public class EstadoService {
	private final EstadoRepository estadoRepository;
	
	public EstadoService (EstadoRepository estadoRepository) {
		this.estadoRepository = estadoRepository;
	}
	
	public List<Estado> listarTodos() {
		return estadoRepository.findAll();
	}
	
	public Estado buscarPorUf(String uf) {
		return estadoRepository.findByUf(uf).orElse(null);
	}
}

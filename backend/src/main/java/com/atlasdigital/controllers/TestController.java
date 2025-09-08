package com.atlasdigital.controllers;

import com.atlasdigital.models.Estado;
import com.atlasdigital.repositories.EstadoRepository;
import com.atlasdigital.services.EstadoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 08/09/2025
 **/

@RestController
@RequestMapping("/test")
public class TestController {
	
	private final EstadoService estadoService;
	
	public TestController (EstadoService estadoService) {
		this.estadoService = estadoService;
	}
	
	@GetMapping("/estados")
	public List<Estado> listarEstados() {
		return estadoService.listarTodos();
	}
	
}

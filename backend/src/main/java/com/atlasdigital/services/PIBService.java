package com.atlasdigital.services;

import com.atlasdigital.models.PIB;
import com.atlasdigital.repositories.PIBRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 08/09/2025
 **/

@Service
public class PIBService {
	private final PIBRepository pibRepository;
	
	public PIBService (PIBRepository pibRepository) {
		this.pibRepository = pibRepository;
	}
	
	public List<PIB> listarTodas() {
		return pibRepository.findAll();
	}
}

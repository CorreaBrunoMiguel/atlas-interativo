package com.atlasdigital.services;

import com.atlasdigital.models.Populacao;
import com.atlasdigital.repositories.PopulacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 08/09/2025
 **/
@Service
public class PopulacaoService {
	
	private final PopulacaoRepository populacaoRepository;
	
	public PopulacaoService (PopulacaoRepository populacaoRepository) {
		this.populacaoRepository = populacaoRepository;
	}
	
	public List<Populacao> listarTodas() {
		return populacaoRepository.findAll();
	}
}

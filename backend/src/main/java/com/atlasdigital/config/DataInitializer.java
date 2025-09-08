package com.atlasdigital.config;

import com.atlasdigital.models.Estado;
import com.atlasdigital.models.PIB;
import com.atlasdigital.models.Populacao;
import com.atlasdigital.repositories.EstadoRepository;
import com.atlasdigital.repositories.PIBRepository;
import com.atlasdigital.repositories.PopulacaoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 08/09/2025
 **/

@Configuration
public class DataInitializer {
 
 @Bean
 CommandLineRunner initDatabase(
         EstadoRepository estadoRepository,
         PopulacaoRepository populacaoRepository,
         PIBRepository pibRepository) {
  return args -> {
   
   // --- Exemplo Estado ---
   Estado sc = new Estado();
   sc.setUf("SC");
   sc.setNome("Santa Catarina");
   sc.setRegiao("Sul");
   estadoRepository.save(sc);
   
   Estado pr = new Estado();
   pr.setUf("PR");
   pr.setNome("Parana");
   pr.setRegiao("Sul");
   estadoRepository.save(pr);
   
   // --- Exemplo Populaçao ---
   Populacao popSC = new Populacao();
   popSC.setEstado(sc);
   popSC.setTotal(8187029L);
   populacaoRepository.save(popSC);
   
   Populacao popPR = new Populacao();
   popPR.setEstado(pr);
   popPR.setTotal(11824665L);
   populacaoRepository.save(popPR);
   
   // --- Exemplo PIB ---
   PIB pibSC = new PIB();
   pibSC.setEstado(sc);
   pibSC.setPerCapita(504.6);
   pibRepository.save(pibSC);
   
   PIB pibPR = new PIB();
   pibPR.setEstado(pr);
   pibPR.setPerCapita(655.65);
   pibRepository.save(pibPR);
   
   System.out.println("Seed Inicial carregado com sucesso!");
  };
 }
}

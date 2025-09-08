package com.atlasdigital.repositories;

import com.atlasdigital.models.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 08/09/2025
 **/

public interface EstadoRepository extends JpaRepository<Estado, String> {
	
	Optional<Estado> findByUf(String uf);
}

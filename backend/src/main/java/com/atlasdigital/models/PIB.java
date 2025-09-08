package com.atlasdigital.models;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.IDENTITY;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 08/09/2025
 **/

@Entity
@Table(name="pib")
public class PIB {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;
	
	private Double perCapita;
	
	@ManyToOne
	private Estado estado;
	
	public Long getId() {return id;}
	
	public Double getPerCapita() {return perCapita;}
	public void setPerCapita(Double perCapita) {this.perCapita = perCapita;}
	
	public Estado getEstado() {return estado;}
	public void setEstado(Estado estado) {this.estado = estado;}
}

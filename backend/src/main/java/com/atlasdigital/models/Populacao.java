package com.atlasdigital.models;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.IDENTITY;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 08/09/2025
 **/

@Entity
@Table(name = "populacao")
public class Populacao {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;
	
	private Long total;
	
	@ManyToOne
	private Estado estado;
	
	public Long getId() {return id;}
	
	public Long getTotal() {return total;}
	public void setTotal(Long id) {this.total = id;}
	
	public Estado getEstado() {return estado;}
	public void setEstado(Estado estado) {this.estado = estado;}
}

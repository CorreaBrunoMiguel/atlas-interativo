package com.atlasdigital.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 08/09/2025
 **/

@Entity
@Table(name = "estados")
public class Estado {
	
	@Id
	private String uf;
	private String nome;
	private String regiao;
	
	public String getUf() {return uf;}
	public void setUf(String uf) {this.uf = uf;}
	
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	
	public String getRegiao() {return regiao;}
	public void setRegiao(String regiao) {this.regiao = regiao;}
}

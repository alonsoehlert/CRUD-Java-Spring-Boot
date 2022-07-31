package org.br.senai.sc.ecommerce.seguranca.dominio;

public enum Role {

	ADMIN("ADMIN");

	private String nome;
	
	private Role(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
}

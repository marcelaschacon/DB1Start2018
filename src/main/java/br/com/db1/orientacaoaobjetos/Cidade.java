package br.com.db1.orientacaoaobjetos;

import br.com.db1.type.Uf;

public class Cidade {
	private String nome;
	
	private Uf uf;

	public Uf getUf() {
		return uf;
	}

	public void setUf(Uf uf) {
		this.uf = uf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}

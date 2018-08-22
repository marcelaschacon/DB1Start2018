package br.com.db1.orientacaoaobjetos;

import br.com.db1.type.TipoTelefone;

public class Telefone {
	private Integer ddd, numero;
	
	private TipoTelefone tipo;
	
	public Integer getDdd() {
		return ddd;
	}



	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}



	public Integer getNumero() {
		return numero;
	}



	public void setNumero(Integer numero) {
		this.numero = numero;
	}



	public TipoTelefone getTipo() {
		return tipo;
	}



	public void setTipo(TipoTelefone tipo) {
		this.tipo = tipo;
	}



	public String formataTelefone(){
		return "(" + ddd + ")" + numero;
			
	}

}

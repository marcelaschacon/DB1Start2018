package br.com.db1.orientacaoaobjetos;

import br.com.db1.type.TipoLogradouro;
import br.com.db1.type.Uf;

public class Endereco {
	private TipoLogradouro tipoLogradouro; 
	private String logradouro, numero, bairro;
	private Integer cep;
	

	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}




	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}




	public String getLogradouro() {
		return logradouro;
	}




	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}




	public String getNumero() {
		return numero;
	}




	public void setNumero(String numero) {
		this.numero = numero;
	}




	public String getBairro() {
		return bairro;
	}




	public void setBairro(String bairro) {
		this.bairro = bairro;
	}




	public Integer getCep() {
		return cep;
	}




	public void setCep(Integer cep) {
		this.cep = cep;
	}




	public String formataCep(){
		String newCep = Integer.toString(cep);
		return newCep.substring(0, 4) + "." + newCep.substring(4);


	}
}

package br.com.db1.orientacaoaobjetos;

public class PessoaJuridica extends Pessoa {
	private String cnpj;
	
	public PessoaJuridica() {
		// TODO Auto-generated constructor stub
	}
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public Boolean validadorCnpj(){
		return Boolean.TRUE;	
	}

}
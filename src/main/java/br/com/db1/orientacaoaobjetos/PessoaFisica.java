package br.com.db1.orientacaoaobjetos;

public class PessoaFisica extends Pessoa {
	private String cpf;
	
	public PessoaFisica() {
		// TODO Auto-generated constructor stub
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Boolean validadorCpf(){
		return Boolean.TRUE;	
	}

}

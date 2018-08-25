package br.com.db1.exenumlogradouro;

public enum TipoLogradouro {
	
	RUA("Rua", "R"),
	FAZENDA("Fazenda", "FZ"),
	PRACA("Praça", "PC"),
	AVENIDA("Avenida", "AV");
	
String descricaoLogradouro, siglaLogradouro;

	TipoLogradouro(String descricao, String sigla){
		descricaoLogradouro = descricao;
		siglaLogradouro = sigla;
	}
	public String getDescricaoLogradouro(){
		return descricaoLogradouro;
	}
	public String getSiglaLogradouro() {
		return siglaLogradouro;
	}
	
}

package br.com.db1.type;

import java.util.ArrayList;
import java.util.List;

public enum EstadosDoBrasilEnum {
	
	RORAIMA("Roraima", "Norte"), PARANA("Paraná", "Sul"), SANTA_CATARINA("Santa Catarina", "Sul"), RIO_GRANDE_DO_SUL("Rio Grande Do Sul", "Sul"),
 AMAZONAS("Amazonas", "Norte"), ACRE("Acre", "Norte"), RONDONIA("Rondonia", "Norte"), PARA("Pará", "Norte"), AMAPA("Amapá", "Norte"), MARANHAO("Maranhão", "Nordeste"),
 CEARA("Ceará", "Nordeste"), PIAUI("Piauí", "Nordeste"), RIO_GRANDE_DO_NORTE("Rio Grande Do Norte", "Norte"), PARAIBA("Paraíba", "Nordeste"), PERNAMBUCO("Pernambuco", "Nordeste"), 
 ALAGOAS("Alagoas", "Nordeste"), SERGIPE("Sergipe", "Nordeste"), BAHIA("Bahia", "Nordeste"), TOCANTINS("Tocantins", "Norte"), MATO_GROSSO("Mato Grosso", "Centro-Oeste"), 
 MATO_GROSSO_DO_SUL("Mato Grosso Do Sul", "Centro-Oeste"), GOIAS("Goiás", "Centro-Oeste"), MINAS_GERAIS("Minas Gerais", "Sudeste"), SAO_PAULO("São Paulo", "Sudeste"), 
 RIO_DE_JANEIRO("Rio De Janeiro", "Sudeste"), ESPIRITO_SANTO("Espirito Santo", "Sudeste"), DISTRITO_FEDERAL("Distrito Federal", "Centro-Oeste");

private String estados;
private String regiao;

	EstadosDoBrasilEnum(String estados, String regiao){
		this.estados = estados;
		this.regiao = regiao;
	}
	public String estados(){
		return estados;
	}
	public String regiao(){
		return regiao;
	}	
	
}


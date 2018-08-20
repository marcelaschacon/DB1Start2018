package br.com.db1.type;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExemploEnumTest {

	@Test
	public void descricaoLogradouroTest(){
		assertEquals("Rua", TipoLogradouro.RUA.getDescricaoLogradouro());
		assertEquals("Fazenda", TipoLogradouro.FAZENDA.getDescricaoLogradouro());
		assertEquals("Praça", TipoLogradouro.PRACA.getDescricaoLogradouro());
		assertEquals("Avenida", TipoLogradouro.AVENIDA.getDescricaoLogradouro());
	}
	public void siglaLogradouroTest(){
		assertEquals("R", TipoLogradouro.RUA.getSiglaLogradouro());
		assertEquals("FZ", TipoLogradouro.FAZENDA.getSiglaLogradouro());
		assertEquals("PC", TipoLogradouro.PRACA.getSiglaLogradouro());
		assertEquals("AV", TipoLogradouro.AVENIDA.getSiglaLogradouro());
	}
}

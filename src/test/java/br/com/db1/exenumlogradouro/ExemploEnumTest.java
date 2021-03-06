package br.com.db1.exenumlogradouro;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.db1.exenumlogradouro.TipoLogradouro;

public class ExemploEnumTest {

	@Test
	public void descricaoLogradouroTest(){
		assertEquals("Rua", TipoLogradouro.RUA.getDescricaoLogradouro());
		assertEquals("Fazenda", TipoLogradouro.FAZENDA.getDescricaoLogradouro());
		assertEquals("Pra�a", TipoLogradouro.PRACA.getDescricaoLogradouro());
		assertEquals("Avenida", TipoLogradouro.AVENIDA.getDescricaoLogradouro());
	}
	public void siglaLogradouroTest(){
		assertEquals("R", TipoLogradouro.RUA.getSiglaLogradouro());
		assertEquals("FZ", TipoLogradouro.FAZENDA.getSiglaLogradouro());
		assertEquals("PC", TipoLogradouro.PRACA.getSiglaLogradouro());
		assertEquals("AV", TipoLogradouro.AVENIDA.getSiglaLogradouro());
	}
}

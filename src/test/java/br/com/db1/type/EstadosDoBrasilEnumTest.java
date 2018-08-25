package br.com.db1.type;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.mapping.Array;
import org.junit.Test;

import static org.junit.Assert.*;
import br.com.db1.type.EstadosDoBrasilEnum;

public class EstadosDoBrasilEnumTest {
	@Test
	public void testadoraEnumEstados(){
		assertEquals("Paraná", EstadosDoBrasilEnum.PARANA.estados());
	}
	@Test
	public void testadoraEnumRegiao(){
		assertEquals("Sul", EstadosDoBrasilEnum.PARANA.regiao());
	}
	@Test
	public void estadosRegiaoSulTest(){
		assertTrue(EstadosDoBrasilEnum.estadosRegiaoSul().contains(EstadosDoBrasilEnum.PARANA.estados()));
		assertTrue(EstadosDoBrasilEnum.estadosRegiaoSul().contains(EstadosDoBrasilEnum.SANTA_CATARINA.estados()));
		assertFalse(EstadosDoBrasilEnum.estadosRegiaoSul().contains(EstadosDoBrasilEnum.SAO_PAULO.estados()));
	}
	@Test
	public void estadosRegiaoSudesteTest(){
		assertTrue(EstadosDoBrasilEnum.estadosRegiaoSudeste().contains(EstadosDoBrasilEnum.SAO_PAULO.estados()));
		assertTrue(EstadosDoBrasilEnum.estadosRegiaoSudeste().contains(EstadosDoBrasilEnum.ESPIRITO_SANTO.estados()));
		assertFalse(EstadosDoBrasilEnum.estadosRegiaoSudeste().contains(EstadosDoBrasilEnum.BAHIA.estados()));
	}
	@Test
	public void estadosRegiaoCentroOesteTest(){
		assertTrue(EstadosDoBrasilEnum.estadosRegiaoCentroOeste().contains(EstadosDoBrasilEnum.MATO_GROSSO.estados()));
		assertFalse(EstadosDoBrasilEnum.estadosRegiaoCentroOeste().contains(EstadosDoBrasilEnum.BAHIA.estados()));
		assertTrue(EstadosDoBrasilEnum.estadosRegiaoCentroOeste().contains(EstadosDoBrasilEnum.GOIAS.estados()));
	}
	@Test
	public void estadosRegiaoNorteTest(){
		assertTrue(EstadosDoBrasilEnum.estadosRegiaoNorte().contains(EstadosDoBrasilEnum.AMAPA.estados()));
		assertTrue(EstadosDoBrasilEnum.estadosRegiaoNorte().contains(EstadosDoBrasilEnum.AMAZONAS.estados()));
		assertFalse(EstadosDoBrasilEnum.estadosRegiaoNorte().contains(EstadosDoBrasilEnum.BAHIA.estados()));
	}
	@Test
	public void estadosRegiaoNordesteTest(){
		assertTrue(EstadosDoBrasilEnum.estadosRegiaoNordeste().contains(EstadosDoBrasilEnum.BAHIA.estados()));
		assertTrue(EstadosDoBrasilEnum.estadosRegiaoNordeste().contains(EstadosDoBrasilEnum.MARANHAO.estados()));
		assertFalse(EstadosDoBrasilEnum.estadosRegiaoNordeste().contains(EstadosDoBrasilEnum.SAO_PAULO.estados()));
	}

}

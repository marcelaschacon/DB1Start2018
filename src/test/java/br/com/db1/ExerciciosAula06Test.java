package br.com.db1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;


public class ExerciciosAula06Test {
	ExerciciosAula06 classeTeste = new ExerciciosAula06();
	
	@Test
	public void CoresGostoTest(){
		List<String> cores = new ArrayList<String>();
		cores.add("Verde");
		cores.add("Vermelho");
		cores.add("Azul");
		assertEquals(cores, classeTeste.CoresGosto());
	}
	
	@Test
	public void QuantidadeItensTest(){
		assertEquals(2, classeTeste.QuantidadeItens(), 0);
	}
	@Test
	public void NomeParentesTest(){
		List<String> nomes = new ArrayList<String>();
		nomes.add("Murilo");
		nomes.add("Ana Luisa");
		nomes.add("Bruno");
		nomes.add("Giulia");
		assertEquals(nomes, classeTeste.NomeParentes());
	}
	@Test
	public void CidadesEstadoOndeNasciTest(){
		List<String> cidades = new ArrayList<String>();
		cidades.add("Maringa");
		cidades.add("Curitiba");
		assertEquals(cidades, classeTeste.CidadesEstadoOndeNasci());
	}
	@Test
	public void CoresOrdenadasTest(){
		List<String> cores = new ArrayList<String>();
		cores.add("Azul");
		cores.add("Verde");
		cores.add("Vermelho");
		assertEquals(cores, classeTeste.CoresOrdenadas());
	}
	@Test
	public void EliminarCorPreferidaTest(){
		List<String> cores = new ArrayList<String>();
		cores.add("Verde");
		cores.add("Azul");
		assertEquals(cores, classeTeste.EliminaCorPreferida());
	}
	@Test
	public void OrdemParentesDecrescenteTest(){
		List<String> nomes = new ArrayList<String>();
		nomes.add("Murilo");
		nomes.add("Marcelo");
		nomes.add("Giulia");
		nomes.add("Bruno");
		nomes.add("Ana Luisa");
		nomes.add("Adriana");
		assertEquals(nomes, classeTeste.OrdemParentesDecrescente());
	}
	@Test
	public void ExibaImparesExibaParesTest(){
		classeTeste.ExibaImparesExibaPares();
		assertEquals(10, classeTeste.pares.size());
		assertEquals(10, classeTeste.impares.size());
		
	}
	@Test
	public void NomesDistintosOrdenadosTest(){
		assertEquals(11, classeTeste.NomesDistintosOrdenados(), 0);
	}
}
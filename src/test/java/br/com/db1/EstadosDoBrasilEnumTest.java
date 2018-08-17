package br.com.db1;

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
		System.out.println(EstadosDoBrasilEnum.PARANA.estados());
	}
	@Test
	public void testadoraEnumRegiao(){
		assertEquals("Sul", EstadosDoBrasilEnum.PARANA.regiao());
		System.out.println(EstadosDoBrasilEnum.PARANA.regiao());
	}
	

}

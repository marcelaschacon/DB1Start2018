package br.com.db1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ExerciciosAula06 {
	public List<Integer> pares = new ArrayList<Integer>();
	public List<Integer> impares = new ArrayList<Integer>();
	
	public static void main(String[] args){
	
		
			
		}
	public List<String> Cores(){
		List<String> cores = new ArrayList<String>();
		cores.add("Verde");
		cores.add("Vermelho");
		cores.add("Azul");
		return cores;
	}
	public List<String> CoresGosto(){
		List<String> coresFavoritas = new ArrayList<String>();
		coresFavoritas.add("Verde");
		coresFavoritas.add("Vermelho");
		coresFavoritas.add("Azul");
		System.out.println("Cores favoritas: " + coresFavoritas);
		return coresFavoritas;
	}
	public Integer QuantidadeItens(){
		List<String> itens = new ArrayList<String>();
		itens.add("1");
		itens.add("2");
		return itens.size();
	}
	public List<String> NomeParentes(){
		List<String> nomes = new ArrayList<String>();
		nomes.add("Marcelo");
		nomes.add("Adriana");
		nomes.add("Murilo");
		nomes.add("Ana Luisa");
		nomes.add("Bruno");
		nomes.add("Giulia");
		System.out.println("Parentes: " + nomes);
		nomes.remove(0);
		nomes.remove(0);
		System.out.println("Orfão: " + nomes);
		return nomes;
		
	}
	public List<String> CidadesEstadoOndeNasci(){
		List<String> cidades = new ArrayList<String>();
		cidades.add("Maringa");
		cidades.add("Umuarama");
		cidades.add("Curitiba");
		System.out.println("Cidades: " + cidades);
		cidades.remove(1);
		System.out.println("Sem a segunda: " + cidades);
		return cidades;
		
	}
	public List<String> CoresOrdenadas(){
		ExerciciosAula06 exer = new ExerciciosAula06();
		List<String> OrdemAlfabeticaCores = new ArrayList<String>();
		OrdemAlfabeticaCores = exer.Cores();
		Collections.sort(OrdemAlfabeticaCores);
		System.out.println("Cores Alfabeticas" + OrdemAlfabeticaCores);
		return OrdemAlfabeticaCores;
		
	}
	public List<String> EliminaCorPreferida(){
		ExerciciosAula06 exer = new ExerciciosAula06();
		List<String> coresSemPreferida = new ArrayList<String>();
		coresSemPreferida = exer.Cores();
		coresSemPreferida.remove("Vermelho");
		System.out.println("Sem a preferida: " + coresSemPreferida);
		return coresSemPreferida;
		
		
	}
	public List<String> OrdemParentesDecrescente(){
		List<String> nomes = new ArrayList<String>();
		nomes.add("Marcelo");
		nomes.add("Adriana");
		nomes.add("Murilo");
		nomes.add("Ana Luisa");
		nomes.add("Bruno");
		nomes.add("Giulia");
		Collections.sort(nomes);
		Collections.reverse(nomes);
		System.out.println("Parentes Decrescente: " + nomes);
		return nomes;
	}
	public void ExibaImparesExibaPares(){
		for (Integer i = 1; i <= 20; i++){
			if(i % 2 ==0){
				pares.add(i);
			}else
			impares.add(i);
		}
		System.out.println(pares);
		System.out.println(impares);
		 
	}
	public Integer NomesDistintosOrdenados(){
		HashSet<String> names = new HashSet<String>();
		names.add("ANA");
		names.add("ANA LAURA");
		names.add("JOSÉ");
		names.add("WAGNER");
		names.add("RODOLFO");
		names.add("ROBERVAL");
		names.add("RODOLPHO");
		names.add("WAGNER");
		names.add("JOSÉ");
		names.add("JOALDO");
		names.add("CLECIO");
		names.add("JOSÉ");
		names.add("MARIA");
		names.add("MARCOS");
		List<String> namesNew = new ArrayList<String>(names);
		Collections.sort(namesNew);
		System.out.println("Nomes Ordenados: " + namesNew);
		return namesNew.size();
	}
	
		
	}
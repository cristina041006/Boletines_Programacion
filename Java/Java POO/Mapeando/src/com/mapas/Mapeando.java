package com.mapas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Mapeando {
	
	public static void main(String[] args) {
		Collection<Persona> per = new ArrayList<>();
		per.add(new Persona ("Ppepitp", "Juares", Genero.MASCULINO));
		per.add(new Persona ("josefa", "Juares", Genero.FEMENINO));
		per.add(new Persona ("alvaro", "Juares", Genero.DESCONOCIDO));
		per.add(new Persona ("rafa", "Juares", Genero.NEUTRO));
		per.add(new Persona ("luci", "Juares", Genero.MASCULINO));
		per.add(new Persona ("hola", "Juares", Genero.FEMENINO));
		per.add(new Persona ("Ppepitp", "Juares", Genero.NEUTRO));
		
		System.out.println(mapearPersonasPorGenero(per));
		
		Collection<Integer> num = new ArrayList<Integer>();
		num.addAll(generarNumerosAleatorios(100));
		
		
		System.out.println(contarNumeros(num));
	
		
		
	}
	
	
	
	/**
	 * Recibe una colección de personas y las agrupa por género
	 * @param personas
	 * @return Mapa con la colección de personas clasificadas por género
	 */
	public static Map mapearPersonasPorGenero(Collection<Persona> personas) {
		Map<Genero, List<Persona>> mapa = new HashMap<>();
		
		for (Persona p : personas) {
			if (!mapa.containsKey(p.getGenero())) {
				mapa.put(p.getGenero(), new ArrayList<>());
				mapa.get(p.getGenero()).add(p);
			}else {
				mapa.get(p.getGenero()).add(p);
			}
		}
		return mapa;
	}
	
	
	/**
	 * Recibe una colección de números y cuenta cuantas ocurrencias hay de cada uno de ellos
	 * creando un mapa en el que aparece cada número junto a su frecuencia de aparición
	 * @param numeros
	 * @return Tabla de frecuencias de los números facilitados
	 */
	public static Map<Integer, Integer> contarNumeros(Collection<Integer> numeros){
		
		Map<Integer, Integer> mapa = new HashMap<>();
		
		for (Integer i: numeros) {
			if (!mapa.containsKey(i)) {
				mapa.put(i, 1);
			}else {
				mapa.put(i, mapa.get(i)+1);
			}
		}
		
		return mapa;
	}
	
	
	/**
	 * Genera una lista de números aleatorios entre 0 y 20 del tamaño indicado
	 * @param size tamaño de la lista
	 * @return lista de size números aleatorios
	 */
	public static Collection<Integer> generarNumerosAleatorios(int size){
		List<Integer> numeros = new ArrayList<>() {{
			for(int i=0; i<size; i++) {
				add(new Random().nextInt(0, 20));
			}
		}};
		
		return numeros;
	}
}

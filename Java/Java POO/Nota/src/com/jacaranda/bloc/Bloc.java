package com.jacaranda.bloc;

import java.util.Arrays;
import java.util.Objects;

import com.jacaranda.notas.Nota;
import com.jacaranda.notas.NotaAlarma;

public class Bloc {

	private static final int NUMERO_NOTAS_MAXIMA = 20;
	private int numNotas;
	private String nombre;
	private Nota[] notas;
	private NotaAlarma[] notasAlarma;
	
	
	public Bloc (String nombre) {
		this.nombre=nombre;
		this.notas = new Nota[NUMERO_NOTAS_MAXIMA];
	}
	
	public String getNota (int numero) {
		StringBuilder sb = new StringBuilder();
		for(Nota n: notas) {
			if (n.getCodigo()==numero) {
				sb.append(n.getTexto());
			}
		return sb.toString();
	}
	
	public void addNota (Nota nota) {
		int posicion = posicionNota();
		notas[posicion]=nota;
	}
	
	public void updateNota(int numero, String texto) {
		for(Nota n: notas) {
			if (n.getCodigo()==numero) {
				n.setTexto(texto);
				
			}
		}
	}
	
	public void activar(int numero) {
		for(NotaAlarma n: notasAlarma) {
			if (n.getCodigo()==numero) {
				n.activar();
				
			}
		}
	}
	
	public void desactivar(int numero) {
		for(NotaAlarma n: notasAlarma) {
			if (n.getCodigo()==numero) {
				n.desactivar();
				
			}
		}
	}

	public static int getNumeroNotasMaxima() {
		return NUMERO_NOTAS_MAXIMA;
	}

	public int getNumNotas() {
		return numNotas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		boolean esIgual = this == obj;
		if (!esIgual && obj != null && getClass() == obj.getClass()) {
			Bloc other = (Bloc) obj;
			esIgual=Objects.equals(nombre, other.nombre);
		}
			
		
		return esIgual;
	}

	@Override
	public String toString() {
		return "Bloc: " + Arrays.toString(notas);
	}
	
	public int posicionNota() {
		int posicion=-1;
		for (int i=0; i<notas.length && posicion==-1; i++) {
			if(this.notas[i]!=null) {
				posicion=i;
			}
		}
		
		return posicion; 
	}
	
	
	
	

}

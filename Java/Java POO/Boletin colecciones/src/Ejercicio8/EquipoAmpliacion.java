package Ejercicio8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import ejercicio2.cr.Equipo;

public class EquipoAmpliacion {

	private String nombre;
	private List<AlumnoAmpliacion> jugadores;
	
	public EquipoAmpliacion(String nombre) {
		super();
		this.nombre=nombre;
		jugadores= new ArrayList<AlumnoAmpliacion>();
	}
	
	public boolean addAlumno(AlumnoAmpliacion alum) throws Exception {
		boolean aniadido=false;
		boolean esta=false;
		for (int i=0; i<jugadores.size() && !esta; i++) {
			if (alum.equals(jugadores.get(i))) {
				esta=true;
				throw new Exception("El jugador ya existe");
				
			}
		}
			
		if (!esta) {
			jugadores.add(alum);
			aniadido=true;
		}
		
		return aniadido;
	}
	
	public boolean borrarAlumno (AlumnoAmpliacion alum) throws Exception {
		boolean borrado=false;
		for (int i=0; i<jugadores.size() && !borrado; i++) {
			if (alum.equals(jugadores.get(i))) {
				borrado=true;
				jugadores.remove(alum);
				
				
			}
		}
		
		if (!borrado) {
			throw new Exception("El jugador no existe");
		}
		
		return borrado;
	}
	
	
	public boolean pertenece (AlumnoAmpliacion alum) {
		boolean pertenece=false;
		for (int i=0; i<jugadores.size() && !pertenece; i++) {
			if (alum.equals(jugadores.get(i))) {
				pertenece=true;
				
			}
		}
		
		if(!pertenece) {
			pertenece=(Boolean) null;
		}
		
		return pertenece;
		
	}
	
	public String mostrar () {
		return jugadores.toString();
	}
	
	public EquipoAmpliacion union (EquipoAmpliacion equi2) {
		EquipoAmpliacion equi = new EquipoAmpliacion("Aux");
		
		for (int i=0; i<equi2.jugadores.size(); i++) {
			equi.jugadores.add(equi2.jugadores.get(i));
		}
		for (int i=0; i<jugadores.size(); i++) {
			equi.jugadores.add(jugadores.get(i));
		}
		
		return equi;
	}
	
	
	public String mostrarMasculino() {
		List<AlumnoAmpliacion> aux = new ArrayList<AlumnoAmpliacion>();
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<jugadores.size(); i++) {
			if (jugadores.get(i).getEdad()>=18 && jugadores.get(i).getSexo()=='H') {
					aux.add(jugadores.get(i));
			}
		}
		
		Collections.sort(aux);
		
		for (int i=0; i<aux.size(); i++) {
			sb.append(aux.get(i));
		}
		
		return sb.toString();
		
		
	}
	
	public boolean esSoloFemenino () {
		boolean loes=true;
		
		for (int i =0; i<jugadores.size() && loes; i++) {
			if (jugadores.get(i).getSexo()=='H') {
				loes=false;
			}
		}
		
		return loes;
		
	}
	
	public int cuantosMayorDeEdad () {
		int cuantos = 0;
		
		for (AlumnoAmpliacion a: jugadores) {
			if (a.getEdad()>=18) {
				cuantos++;
			}
		}
		
		return cuantos;
		
	}
	
	public int mayorDeLosMayores() {
		List<AlumnoAmpliacion> aux = new ArrayList<AlumnoAmpliacion>();
		int edad =0;
		for (AlumnoAmpliacion a: jugadores) {
			if (a.getEdad()>=18) {
				aux.add(a);
			}
		}
		
		for (AlumnoAmpliacion j: aux) {
			if (j.getEdad()>edad) {
				edad = j.getEdad();
			}
		}
		
		return edad;
		
	}
	
	
	public boolean jugadoraMayorEdad () {
		boolean hay = false;
		for (int i =0; i<jugadores.size() && !hay; i++) {
			if (jugadores.get(i).getSexo()=='M' && jugadores.get(i).getEdad()>=18) {
				hay = true;
			}
		}
		
		
		return hay;
		
	}
	
	public Set jugadoresMasculinosMenoresDni () {
		Set<String> dni = new HashSet<String>();
		for (AlumnoAmpliacion a : jugadores) {
			if (a.getSexo()=='H' && a.getEdad()<18) {
				dni.add(a.getDni());
			}
		}
		
		return dni;
		
		
	}
	
	public int cuantasCuidades () {
		Set<String> ciudades = new HashSet<String>();
		
		for (AlumnoAmpliacion a : jugadores) {
			ciudades.add(a.getCiudad());
		}
		
		return ciudades.size();
		
	}
	
	
	
	
	public EquipoAmpliacion interseccion (EquipoAmpliacion equi2) {
		EquipoAmpliacion equi = new EquipoAmpliacion("Aux");
		
		for (int i=0; i<equi2.jugadores.size(); i++) {
			if (jugadores.contains(equi2.jugadores.get(i))) {
				equi.jugadores.add(equi2.jugadores.get(i));
			}
		}
		
		return equi;
	}

}

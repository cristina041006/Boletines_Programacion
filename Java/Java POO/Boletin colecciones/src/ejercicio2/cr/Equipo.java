package ejercicio2.cr;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
	
	private String nombre;
	private List<Alumno> jugadores;
	
	public Equipo(String nombre) {
		super();
		this.nombre=nombre;
		jugadores= new ArrayList<Alumno>();
	}
	
	public boolean addAlumno(Alumno alum) throws Exception {
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
	
	public boolean borrarAlumno (Alumno alum) throws Exception {
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
	
	
	public Boolean pertenece (Alumno alum) {
		boolean pertenece=false;
		for (int i=0; i<jugadores.size() && !pertenece; i++) {
			if (alum.equals(jugadores.get(i))) {
				pertenece=true;
				
			}
		}
		
		return !pertenece? null: pertenece;
		
	}
	
	public String mostrar () {
		return jugadores.toString();
	}
	
	public Equipo union (Equipo equi2) {
		Equipo equi = new Equipo("Aux");
		
		for (int i=0; i<equi2.jugadores.size(); i++) {
			equi.jugadores.add(equi2.jugadores.get(i));
		}
		for (int i=0; i<jugadores.size(); i++) {
			equi.jugadores.add(jugadores.get(i));
		}
		
		return equi;
	}
	
	
	
	public Equipo interseccion (Equipo equi2) {
		Equipo equi = new Equipo("Aux");
		
		for (int i=0; i<equi2.jugadores.size(); i++) {
			if (jugadores.contains(equi2.jugadores.get(i))) {
				equi.jugadores.add(equi2.jugadores.get(i));
			}
		}
		
		return equi;
		
		
	}
	
	

}

package ejercicio2.cr;

import java.util.Objects;

public class Alumno {
	private String nombre;
	private String dni;
	
	
	public Alumno (String nombre, String dni) {
		super();
		this.nombre=nombre;
		this.dni=dni;
	}


	@Override
	public boolean equals(Object obj) {
		boolean esIgual = this == obj;
		if (!esIgual && obj != null && getClass() == obj.getClass()) {
			Alumno other = (Alumno) obj;
			esIgual=Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre);
		}
		
		return esIgual;
	}


	@Override
	public String toString() {
		return "Alumno " + nombre + " con dni=" + dni;
	}
	
	

}

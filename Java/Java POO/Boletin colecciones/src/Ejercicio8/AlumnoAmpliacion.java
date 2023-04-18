package Ejercicio8;

import java.util.Objects;

public class AlumnoAmpliacion implements Comparable<AlumnoAmpliacion>{
	
	private String nombre;
	private String dni;
	private int edad;
	private char sexo;
	private String ciudad;
	
	
	public AlumnoAmpliacion (String nombre, String dni, int edad, char sexo, String ciudad) {
		super();
		this.nombre=nombre;
		this.dni=dni;
		this.edad=edad;
		this.sexo=sexo;
		this.ciudad=ciudad;
	}


	@Override
	public boolean equals(Object obj) {
		boolean esIgual = this == obj;
		if (!esIgual && obj != null && getClass() == obj.getClass()) {
			AlumnoAmpliacion other = (AlumnoAmpliacion) obj;
			esIgual=Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre);
		}
		
		return esIgual;
	}


	@Override
	public String toString() {
		return "Alumno " + nombre + " con dni=" + dni;
	}
	
	


	public char getSexo() {
		return sexo;
	}


	public int getEdad() {
		return edad;
	}


	@Override
	public int compareTo(AlumnoAmpliacion o) {
		return this.edad-o.edad;
	}


	public String getCiudad() {
		return ciudad;
	}


	public String getDni() {
		return dni;
	}
	
	

}

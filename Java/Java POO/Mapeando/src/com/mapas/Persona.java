package com.mapas;

public class Persona {
	private String nombre;
	private String apellidos;
	private Genero genero;
	
	
	public Persona(String nombre, String apellidos, Genero genero) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.genero = genero;
	}


	@Override
	public String toString() {
		return nombre +" "+ apellidos ;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public Genero getGenero() {
		return genero;
	}


	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
	
}

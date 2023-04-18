package ejercicio5.cr;

import java.time.LocalDateTime;

public class Mensaje implements Comparable<Mensaje>{
	
	private String texto;
	private LocalDateTime fecha;
	private Persona persona;
	private static int id=0;
	
	public Mensaje (String texto, LocalDateTime fecha, Persona remitente) {
		this.texto=texto;
		this.fecha=fecha;
		this.persona=remitente;
		this.id++;
	}

	@Override
	public String toString() {
		return "Mensaje " + id + ": De: " + persona.getNombre() + " Texto: " + texto + " Fecha y hora: " + fecha;
	}

	@Override
	public int compareTo(Mensaje o) {
		return this.persona.getNombre().compareTo(o.persona.getNombre());
	}

	public static int getId() {
		return id;
	}
	
	public boolean estaPalabra (String palabra) {
		boolean esta = false;
		int tamanio = palabra.length();
		for (int i=0; i<texto.length(); i++) {
			if (texto.substring(i, tamanio).equals(palabra)) {
				esta=true;
			}
		}
		
		return esta;
	}
	
	
	
}

package ejercicio6.cr;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Palabra implements Comparable<Palabra>{
	
	private String nombre;
	
	public Palabra (String nombre  ) {
		super();
		this.nombre=nombre;
	}

	@Override
	public boolean equals(Object obj) {
		boolean esIgual = this == obj;
		
		if (!esIgual && obj != null && getClass() == obj.getClass()) {
			Palabra other = (Palabra) obj;	
			esIgual =  Objects.equals(nombre, other.nombre);
		}
		
		return esIgual;
	}

	@Override
	public int compareTo(Palabra o) {
		return this.nombre.compareTo(o.nombre);
	}

	public String getNombre() {
		return nombre;
	}
	
	
	
	

}

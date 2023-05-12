package main.java.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class DatosLeidos {
	
	private String titulo;
	private String calle;
	private int numero;
	private Clase clase;
	private int id;
	private int id_calle;
	
	
	
	public DatosLeidos(String titulo, String calle, int numero, Clase clase, int id, int id_calle) {
		super();
		this.titulo = titulo;
		this.calle = calle;
		this.numero = numero;
		this.clase = clase;
		this.id = id;
		this.id_calle = id_calle;
	}



	


	@Override
	public int hashCode() {
		return Objects.hash(calle, clase, id, id_calle, numero, titulo);
	}






	@Override
	public boolean equals(Object obj) {
		return this==obj || obj != null && obj instanceof DatosLeidos d && d.hashCode()==this.hashCode();

	}

	public String toString() {
		return String.format(
				"Caseta con titulo %s calle %s numero %s de clase tipo"
				+ " %s id %s e id de calle %s"
				, this.titulo, this.calle, this.numero, this.clase, this.id, this.id_calle);
	}
	
	
	public List<DatosLeidos> mostrasCasetasDeUnaCalle(String calle, List<DatosLeidos> datos) {
		List<DatosLeidos> casetas = new ArrayList<>();
		
		for (DatosLeidos d: datos) {
			if (d.getCalle().equals(calle)) {
				casetas.add(d);
			}
		}
		
		return casetas;
		
	}
	
	public List<DatosLeidos> mostrasCasetaTipo (Clase tipo, List<DatosLeidos> datos) {
		List<DatosLeidos> casetas = new ArrayList<>();
		
		for(DatosLeidos d: datos ) {
			if (d.getClase().equals(tipo)) {
				casetas.add(d);
			}
		}
		
		return casetas;
		
	}
	

	public Map<String, Integer> mostrarCantidadDeCaseta (Clase tipo, List<DatosLeidos> datos) {
		Map<String, Integer> cantidad = new HashMap<>();
		
		for(DatosLeidos d: datos) {
			if(!cantidad.containsKey(d.calle)) {
				if(d.getClase().equals(tipo)) {
					cantidad.put(d.getCalle(), 1);
				}
				
			}else {
				if(d.clase.equals(tipo)) {
					cantidad.put(d.getCalle(), cantidad.get(d.getCalle()+1));
				}
			}
			
		}
		
		return cantidad;
	}
	
	
	public void eliminarCaseta (String calle, int numero) {
		//TODO
	}




	public String getTitulo() {
		return titulo;
	}






	public String getCalle() {
		return calle;
	}






	public int getNumero() {
		return numero;
	}






	public Clase getClase() {
		return clase;
	}






	public int getId() {
		return id;
	}






	public int getId_calle() {
		return id_calle;
	}
	

	
	
}

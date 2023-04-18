package ejercicio5.cr;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Persona {
	
	private String nombre;
	private LocalDate fechaNacimiento;
	private List<Mensaje> buzon;
	
	public Persona (String nombre, LocalDate fechaNacimiento) {
		super();
		this.nombre=nombre;
		this.fechaNacimiento=fechaNacimiento;
		buzon = new ArrayList<Mensaje>();
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public boolean esMayorEdad() {
		boolean esMayor=false;
		if (LocalDateTime.now().getYear()-this.fechaNacimiento.getYear()>=18) {
			esMayor=true;
		}
		
		return esMayor;
	}
	
	public abstract boolean mandarMensaje(Persona p, String texto) throws Exception; 
	
	public void recivirMensaje (Mensaje m) {
		buzon.add(m);
	}
	
	public void enviarMensaje(Mensaje m, Persona p) {
		p.recivirMensaje(m);
	}
	
	public String leerMensaje() throws Exception {
		StringBuilder bd = new StringBuilder();
		
		if (buzon.size()==0) {
			throw new Exception("No hay mensajes");
		}else {
			bd.append(buzon);
		}
		
		return bd.toString(); 
	}
	
	public String mostrarOrdenados() {
		Collections.sort(buzon);
		
		return buzon.toString();
	}
	
	
	public void borrarBuzon(int numero) throws Exception {
		boolean esta = false;
		for (int i=0; i<buzon.size() && !esta; i++) {
			if (buzon.get(i).getId()==numero) {
				buzon.remove(buzon.get(i));
			}
		}
		
		if (!esta) {
			throw new Exception("No existe");
		}
	}
	
	
	public String buscarFrase (String frase) {
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<buzon.size(); i++) {
			if (buzon.get(i).estaPalabra(frase)) {
				sb.append(buzon.get(i) + "\n");
			}
		}
		
		return sb.toString();
		
	}
	
	
	

}

package ejercicio5.cr;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Alumno extends Persona {

	
	public Alumno(String nombre, LocalDate fechaNacimiento) {
		super(nombre, fechaNacimiento);
		
		
	}

	@Override
	public boolean mandarMensaje(Persona p, String texto) throws Exception {
		boolean enviado=false;
		if (!esMayorEdad() && p instanceof Profesor) {
			enviado=true;
			super.enviarMensaje(new Mensaje(texto, LocalDateTime.now(), this), p);
		}else if (esMayorEdad()) {
			enviado=true;
			super.enviarMensaje(new Mensaje(texto, LocalDateTime.now(), this), p);
		}
		
		if (!enviado) {
			throw new Exception ("No se puede enviar");
		}
		
		return enviado;
	}




}

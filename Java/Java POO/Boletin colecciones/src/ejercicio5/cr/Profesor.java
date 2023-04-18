package ejercicio5.cr;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {

	
	public Profesor(String nombre, LocalDate fechaNacimiento) {
		super(nombre, fechaNacimiento);
		
	}

	@Override
	public boolean mandarMensaje(Persona p, String texto) {
		super.enviarMensaje(new Mensaje(texto, LocalDateTime.now(), this), p);
		return true;
	}

	

}

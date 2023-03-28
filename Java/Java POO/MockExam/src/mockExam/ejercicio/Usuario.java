package mockExam.ejercicio;

import java.util.Objects;

public class Usuario {
	
	private String login;
	private String pass;

	public Usuario() {
		super();
	}
	
	public Usuario(String login, String pass) {
		this();
		this.login=login;
		this.pass=pass;
	}

	public String getLogin() {
		return login;
	}

	public boolean setPass(String passAtiguo, String passNuevo) {
		boolean cambiado= false;
		if (checkPass(passAtiguo) && passNuevo!=null && !passNuevo.isEmpty()) {
			this.pass=passNuevo;
			cambiado=true;
		}
		
		return cambiado; 
	}
	
	public boolean checkPass(String pass) {
		boolean pasa=false;
		if (pass!=null && !pass.isEmpty() && this.pass.equals(pass)) {
			pasa=true;
		}
		return pasa;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(login, pass);
	}

	@Override
	public boolean equals(Object obj) {
		boolean esIgual = this == obj;		
		if (!esIgual && obj != null && obj instanceof Usuario) {
			Usuario other = (Usuario) obj;
			esIgual=Objects.equals(login, other.login);
		}
		return esIgual;
			
	}
	
	
	
	

}

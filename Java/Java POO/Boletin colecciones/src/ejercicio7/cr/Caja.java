package ejercicio7.cr;

import java.util.HashSet;
import java.util.Set;

public class Caja {
	
	
	private boolean abierta;
	Set<Cliente> cli;
	
	public Caja() {
		super();
		abierta=false;
		cli = new HashSet<Cliente>();
	}
	
	public void abrir() {
		abierta=true;
	}
	
	public void cerrar() {
		abierta = false;
	}

	public boolean isAbierta() {
		return abierta;
	}
	
	public int cuantosClientes () {
		return cli.size();
	}
	
	public void aniadirCli (Cliente clie) {
		cli.add(clie);
	}
	
	public void quitarCliente(Cliente clie) {
		cli.remove(clie);
	}
	 

}

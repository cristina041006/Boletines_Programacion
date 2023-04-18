package ejercicio7.cr;

public class Almacen {
	
	private Caja[] caja;
	
	public Almacen() {
		super();
		caja = new Caja[20];
	}
	
	public void abrirCaja (int numero) throws Exception {
		
		for (int i=0; i<caja.length; i++) {
			if (i==numero) {
				if (caja[i].isAbierta()==false) {
					caja[i].abrir();
				}else {
					throw new Exception("La caja ya esta abierta");
				}
			}
		}
		
	}
	
	public void cerrarCaja (int numero) throws Exception {
			
		for (int i=0; i<caja.length; i++) {
			if (i==numero) {
				if (caja[i].isAbierta()==true) {
					caja[i].cerrar();
				}else {
					throw new Exception("La caja ya esta cerrada");
				}
			}
		}
		
	}
	
	
	public String aniadirCliente (Cliente cli) {
		int mayor = 1000;
		Caja cajaMenor = null;
		int contador=0;
		for (int i=0; i<caja.length; i++) {
			if (caja[i].cuantosClientes()<mayor) {
				mayor = caja[i].cuantosClientes();
				cajaMenor=caja[i];
				contador=i;
			}
		}
		
		cajaMenor.aniadirCli(cli);
		cli.setCaja(contador);
		
		return "El cliente" + cli.getIdentificador() + " debe ir a la caja" + contador; 
		
	}
	
	
	public String atenderCliente(Cliente cli) {
		caja[cli.getCaja()].quitarCliente(cli);
		
		return "Se ha atenido al cliente numero" + cli.getIdentificador();
	}

}

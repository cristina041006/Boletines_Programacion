package ejercicio7.cr;

public class Cliente {
	
	private static int identificador =1;
	private int caja;
	
	public Cliente () {
		super();
		this.identificador++;
	}

	public int getCaja() {
		return caja;
	}

	public void setCaja(int caja) {
		this.caja = caja;
	}

	public static int getIdentificador() {
		return identificador;
	}
	
	
	
	

}

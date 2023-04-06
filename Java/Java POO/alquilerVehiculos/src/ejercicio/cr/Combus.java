package ejercicio.cr;

public enum Combus {
	
	DIESEL(3.5),
	GASOLINA(2);
	
	private double precio;
	
	private Combus(double combustible) {
		this.precio=combustible;
	}
	
	public double getPrecio() {
		return this.precio;
	}

}

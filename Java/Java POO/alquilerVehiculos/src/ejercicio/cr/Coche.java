package ejercicio.cr;

public class Coche extends Vehiculo {

	protected Combus combustible;

	public Coche(String matricula, Gama gama, Combus combustible) throws Exception {
		super(matricula, gama);
		if(combustible!=null) {
			this.combustible=combustible;
		}else {
			throw new Exception("CocheException");
		}
	}

	@Override
	public double calcularPrecio() {
		return this.gama.getPrecio()+this.combustible.getPrecio();
	}

}

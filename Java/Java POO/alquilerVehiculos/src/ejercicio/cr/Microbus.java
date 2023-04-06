package ejercicio.cr;

public class Microbus extends Vehiculo {

	private final static int			 NUM_PLAZAS_MINIMAS=9;
	private final static int 				  PRECIO_PLAZA=5;
	protected int numeroPlazas;
	

	public Microbus(String matricula, Gama gama) throws Exception {
		super(matricula, gama);
		this.numeroPlazas=NUM_PLAZAS_MINIMAS;
	}
	public Microbus(String matricula, Gama gama, int numeroPlazas) throws Exception {
		super(matricula, gama);
		if(numeroPlazas>=NUM_PLAZAS_MINIMAS) {
			this.numeroPlazas=numeroPlazas;
		}else {
			this.numeroPlazas=NUM_PLAZAS_MINIMAS;
		}
	}

	@Override
	public double calcularPrecio() {
		return this.gama.getPrecio()+(PRECIO_PLAZA*numeroPlazas);
	}

}

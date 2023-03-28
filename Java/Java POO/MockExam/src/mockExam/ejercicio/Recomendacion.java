package mockExam.ejercicio;

public class Recomendacion extends Publicacion {
	
	private int numeroEstrellas;
	
	
	public Recomendacion(String reco, Usuario usuario, int numero) throws PublicacionException {
		super(reco, usuario);
		if(numero>5 && numero<1) {
			throw new PublicacionException("El numero de estrellas no es correcta");
		}
		this.numeroEstrellas=numero;

	}
		

	@Override
	protected void setTexto(String texto) throws PublicacionException {
		if(texto.length()<100 && texto.length()>200) {
			throw new PublicacionException("La longitud no es correcta");
		}
		super.texto=texto;
		
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "\n" + super.toString() + "\n" + "Numero de estrellas: " + this.numeroEstrellas;
	}

	public int getNumeroEstrellas() {
		return numeroEstrellas;
	}

	
	
	

}

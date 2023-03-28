package mockExam.ejercicio;

public class Post extends Publicacion {
	
	private int numeroLecturas;
	private String tema;
	
	
	public Post (String texto, Usuario usuario, String tema) throws PublicacionException {
		super(texto, usuario);
		super.usuario=usuario;
		this.tema=tema;
	}

	@Override
	protected void setTexto(String texto) throws PublicacionException {
		if (texto.isBlank() || texto==null) {
			throw new PublicacionException("El mensaje no puede estar vacio");
		}
		super.texto=texto;
		
	}
	

	@Override
	public String toString() {
		return "Post numeroLecturas" + numeroLecturas + ", tema " + tema;
	}

	public int getNumeroLecturas() {
		return numeroLecturas;
	}

	public String getTema() {
		return tema;
	}

	@Override
	public boolean valorar(String valoracion) {
		this.numeroLecturas++;
		return super.valorar(valoracion);
	}
	
	

}

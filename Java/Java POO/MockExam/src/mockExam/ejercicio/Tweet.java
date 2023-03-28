package mockExam.ejercicio;

public class Tweet extends Publicacion {
	
	
	public Tweet(String tweet, Usuario usuario) throws PublicacionException {
		super(tweet, usuario);
	}

	@Override
	protected void setTexto(String texto) throws PublicacionException {
		if (texto.length()>50) {
			throw new PublicacionException("El mensaje no puede ser mayor que 50");
		}
		super.texto=texto;
		
	}

	@Override
	public String toString() {
		return "Tweet \n Publicacion" 
				+ texto + ", realizada por " + super.getLoginUsuario() + " valoracion " + super.getValoracion() + " fecha de publicacion " + super.getFechaCreacion();
	}

	@Override
	public boolean valorar(String valoracion) {
		super.valorar(valoracion);
		return super.valorar(valoracion);//lo pones dos veces asi que se suma (o lo copias de publicacion min 1:2)
	}
	
	

}

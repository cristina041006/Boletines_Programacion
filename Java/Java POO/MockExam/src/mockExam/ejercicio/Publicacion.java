package mockExam.ejercicio;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Publicacion implements Comparable<Publicacion>, Valorable{
	
	protected String texto;
	private LocalDateTime fechaCreacion;
	protected int valoracion;
	private int codigo;
	private static int codigoSiguiente;
	protected Usuario usuario;
	
	public Publicacion() {
		super();
	}
	
	public Publicacion(String cadena, Usuario usuario) throws PublicacionException {
		this();
		setTexto(cadena);
		this.usuario=usuario;
		this.codigo=this.codigoSiguiente++;
		this.fechaCreacion=LocalDateTime.now();
	}
	
	protected String getTexto() {
		return this.texto;
	}
	
	protected abstract void setTexto(String texto) throws PublicacionException;

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public int getValoracion() {
		return valoracion;
	}
	
	public boolean valorar(String valoracion) {
		boolean valorado=false;
		try {
			Valoraciones v = Valoraciones.valueOf(valoracion.toUpperCase());
			valoracion+=v.getValoracion();
			valorado=true;
		}catch(Exception e) {
			
		}
		return valorado;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public String getLoginUsuario() {
		return usuario.getLogin();
	}
	
	@Override
	public int compareTo(Publicacion publi) {
		return this.valoracion==publi.valoracion?  this.fechaCreacion.compareTo(publi.fechaCreacion): this.valoracion-publi.valoracion;  
	}
	
	public boolean isAnterior(Publicacion publi) {
		return this.fechaCreacion.isBefore(publi.fechaCreacion);
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, fechaCreacion, texto, valoracion);
	}

	@Override
	public boolean equals(Object obj) {
		boolean esIgual = this == obj;
	
		if (!esIgual && obj != null && getClass() != obj.getClass()) {
			Publicacion other = (Publicacion) obj;
			esIgual=codigo == other.codigo && Objects.equals(fechaCreacion, other.fechaCreacion)
				&& Objects.equals(texto, other.texto) && valoracion == other.valoracion;
		}
		return esIgual;
	}

	@Override
	public String toString() {
		return String.format("Publicación: %s"
							+ "\nRealizada por: %s"
							+ "\nValoracion: %s"
							+ "\nFecha de publicacion: %s"
				, this.texto, getLoginUsuario(), this.valoracion, this.fechaCreacion);
	}
	
	

}

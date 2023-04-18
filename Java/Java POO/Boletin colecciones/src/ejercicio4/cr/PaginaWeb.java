package ejercicio4.cr;

import java.time.LocalDateTime;
import java.util.Objects;

public class PaginaWeb {
	
	private String url;
	private LocalDateTime fecha;
	
	public PaginaWeb (String url, LocalDateTime fecha) {
		super();
		this.url=url;
		this.fecha=fecha;
	}

	public String getUrl() {
		return url;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	@Override
	public String toString() {
		return  url + " " + fecha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fecha, url);
	}

	@Override
	public boolean equals(Object obj) {
		boolean esIgual = this == obj;
		
		if (!esIgual && obj != null && getClass() == obj.getClass()) {
			PaginaWeb other = (PaginaWeb) obj;
			esIgual = Objects.equals(fecha, other.fecha) && Objects.equals(url, other.url);
		}
		
	
		return esIgual;
	}
	
	public boolean esPositerior(PaginaWeb p) {
		return p!=null && this.fecha.isAfter(p.fecha);
	}
	
	
	
	

}

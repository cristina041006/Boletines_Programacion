package ejercicio4.cr;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Historial {
	
	private List<PaginaWeb> visita;
	
	
	public Historial() {
		super();
		visita = new ArrayList<PaginaWeb>();
	}
	
	
	public void addPagina(String nombre) throws Exception {
		PaginaWeb pagina =new PaginaWeb(nombre, LocalDateTime.now());
		
		if (visita.isEmpty() || !visita.isEmpty() && pagina.esPositerior(this.visita.get(visita.size()-1))) {
			visita.add(pagina);
			
		}else {
			throw new Exception("La pagina no se puede añadir");
		}
		
		
	}
	
	public String mostrar() {
		StringBuilder sb = new StringBuilder();
		
		for (PaginaWeb p : this.visita) {
			sb.append(p);
		}
		
		return sb.toString();
	}
	
	public String mostrarHistorialUnDia(LocalDateTime dia) {
		StringBuilder sc = new StringBuilder();
		for(int i=0; i<visita.size(); i++) {
			if(visita.get(i).getFecha().equals(dia)) {
				sc.append(visita.get(i));
			}
		}
		
		return sc.toString();
		
	}
	
	public void borrarHistorial() {
		visita.clear();
	}
	
	public void borrarVisitaPagina(String pagina) throws Exception {
		boolean borrada =false;
		for (int i =0; i<visita.size() && !borrada; i++) {
			if (visita.get(i).getUrl().equals(pagina)) {
				visita.remove(visita.get(i));
				borrada=true;
			}
		}
		
		if (!borrada) {
			throw new Exception("La pagina no fue encontrada");
		}
		
	}

}

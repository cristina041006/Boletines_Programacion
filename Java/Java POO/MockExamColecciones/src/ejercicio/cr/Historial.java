package ejercicio.cr;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Historial {
	
	private Map<LocalDate, Combinacion> sorteos;
	
	public Historial () {
		sorteos = new HashMap<>();
	}
	
	public boolean addSorteo(LocalDate fecha, Combinacion combi) throws HistorialException {
		boolean si = false;
		if (sorteos.put(fecha, combi)==null) {
			throw new HistorialException("No se ha podido aniadir");
		}else {
			sorteos.put(fecha, combi);
			si =true;
		}
		return si;
	}
	
	public boolean addSorteo(int dia, int mes, int años , Combinacion combi) throws HistorialException {
		LocalDate fechaAux = LocalDate.of(años, mes, dia);
		return addSorteo(fechaAux, combi);
	}
	
	public boolean actualizarSorteo (LocalDate fecha, Combinacion combiNueva) throws HistorialException {
		boolean si = false;
		if (sorteos.replace(fecha, combiNueva)==null) {
			throw new HistorialException("No se ha podido actualizar");
		}else {
			sorteos.replace(fecha, combiNueva);
			si =true;
		}
		return si; 
	}
	
	public boolean actualizarSorteo (int dia, int mes, int años  , Combinacion combi) throws HistorialException {
		LocalDate fechaAux = LocalDate.of(años, mes, dia);
		return actualizarSorteo(fechaAux, combi);
	}
	
	public boolean borrarSorteo (LocalDate fecha) throws HistorialException {
		
		boolean si = false;
		if (sorteos.remove(fecha)==null) {
			throw new HistorialException("No se ha podido borrar");
		}else {
			sorteos.remove(fecha);
			si =true;
		}
		return si; 
	}
	
	public List<String> listarSorteosDesdeFecha(LocalDate fecha) {
		List<String> lista = new ArrayList<>();
		
		for (LocalDate k: sorteos.keySet()) {
			if (k.isAfter(fecha)) {
				lista.add(sorteos.get(k).toString());
			}
		}
		
		return lista;
	}
	
	public List<String> mostrarHistorico() {
		List<String> lista = new ArrayList<>();
		
		for (LocalDate k: sorteos.keySet()) {
			lista.add(sorteos.get(k).toString());
		}
		
		return lista;
	}
	
	public Map<String, Integer> comprobarAciertos(LocalDate fecha, Combinacion combi) throws HistorialException {
		int numeros = sorteos.get(fecha).comprobarCombinacion(combi);
		Map <String, Integer> historial = new HashMap<>();
		
		if (sorteos.containsKey(fecha)) {
			historial.put("Boleto con fecha"+ fecha + "y combinacion" + sorteos.get(fecha).toString() + ", Boleto a comprobar: " + combi.toString() + " Numero de aciertos: ", numeros);
		}else {
			throw new HistorialException("Rl boleto no existe");
		}
		
		
		return new HashMap<>(); //llamar a comprobar aciertos y almacenarlos en un mapa
	}
	
	
	

}

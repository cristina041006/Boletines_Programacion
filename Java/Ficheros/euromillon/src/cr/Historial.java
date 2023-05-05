package cr;

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
	
	public void addSorteo(LocalDate fecha, Combinacion combinacion) throws CombinacionException {
		if(fecha!=null && combinacion!=null) {
			sorteos.put(fecha, combinacion);	
		}else {
			throw new CombinacionException();
		}
	}
	
	public void addSorteo(int dia, int mes, int años , Combinacion combi) throws HistorialException, CombinacionException {
		LocalDate fechaAux = LocalDate.of(años, mes, dia);
		addSorteo(fechaAux, combi);
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
	
	
	public Map<Integer, Integer> agruparPorRepeticionNumeros() {
		List<Integer> numeros = new ArrayList<>();
		
		for(LocalDate k : sorteos.keySet()) {
			numeros.addAll(sorteos.get(k).getNumeros());
		}
		
		Map<Integer, Integer> repetidos =new HashMap<>();
		for (Integer i: numeros) {
			if(!repetidos.containsKey(i)) {
				repetidos.put(i, 1);
			}repetidos.put(i, repetidos.get(i)+1);
			
		}
		
		return repetidos;
	}
	
	public Integer mayorDeLaRepeticion() {
		Integer numero=1;
		Map<Integer, Integer> mayores = agruparPorRepeticionNumeros();
		for(Integer n : mayores.keySet()) {
			if(mayores.get(n)>numero) {
				numero=mayores.get(n);
			}
		}
		
		return numero;
	}
	
	
	public String numerosMasRepetidos() {
		StringBuilder mensaje = new StringBuilder();;
		Map<Integer, Integer> numerosMayores = agruparPorRepeticionNumeros();
		Integer mayor = mayorDeLaRepeticion();
		for(Integer n : numerosMayores.keySet()) {
			if(numerosMayores.get(n).equals(mayor)) {
				mensaje.append(n+"   ");
			}
		}
		return "Los numeros con mayor repeticion son: \n"+mensaje.toString()+"\ncon un total de: "+mayor+" repeticiones";
	}
	
	public Integer menorRepeticion() {
		Integer numero=mayorDeLaRepeticion();
		Map<Integer, Integer> menor = agruparPorRepeticionNumeros();
		for(Integer n : menor.keySet()) {
			if(menor.get(n)<numero) {
				numero=menor.get(n);
			}
			
		}
		
		
		return numero;
	}
	
	public String numerosMenosRepetidos() {
		StringBuilder mensaje = new StringBuilder();;
		Map<Integer, Integer> numerosMenores = agruparPorRepeticionNumeros();
		Integer menor = menorRepeticion();
		for(Integer n : numerosMenores.keySet()) {
			if(numerosMenores.get(n).equals(menor)) {
				mensaje.append(n+"   ");
			}
		}
		return "Los numeros con menor repeticion son: \n"+mensaje.toString()+"\ncon un total de: "+menor+" repeticiones";
	}
	

	
	public Map<Integer, Integer> agruparPorRepeticionEstrellas() {
		List<Integer> numeros = new ArrayList<>();
		
		for(LocalDate k : sorteos.keySet()) {
			numeros.addAll(sorteos.get(k).getEstrellas());
		}
		
		Map<Integer, Integer> repetidos =new HashMap<>();
		for (Integer i: numeros) {
			if(!repetidos.containsKey(i)) {
				repetidos.put(i, 1);
			}repetidos.put(i, repetidos.get(i)+1);
			
		}
		
		return repetidos;
	}
	
	
	public Integer mayorRepeticionEstrellas() {
		Integer numero=-1;
		Map<Integer, Integer> tmp = agruparPorRepeticionEstrellas();
		for(Integer n : tmp.keySet()) {
			if(tmp.get(n)>numero) {
				numero=tmp.get(n);
			}
		}
		
		return numero;
	}
	public String estrellasMasRepetidos() {
		StringBuilder mensaje = new StringBuilder();
		Map<Integer, Integer> numerosMayores = agruparPorRepeticionEstrellas();
		Integer mayor = mayorRepeticionEstrellas();
		for(Integer n : numerosMayores.keySet()) {
			if(numerosMayores.get(n).equals(mayor)) {
				mensaje.append(n+"   ");
			}
		}
		return "Los numeros con mayor repeticion son: \n"+mensaje.toString()+"\ncon un total de: "+mayor+" repeticiones";
	}
	
	public Integer menorRepeticionEstrellas() {
		Integer numero=mayorRepeticionEstrellas();
		Map<Integer, Integer> tmp = agruparPorRepeticionEstrellas();
		for(Integer n : tmp.keySet()) {
			if(tmp.get(n)<numero) {
				numero=tmp.get(n);
			}
		}
		
		return numero;
	}
	
	
	public String estrellasMenosRepetidos() {
		StringBuilder mensaje = new StringBuilder();;
		Map<Integer, Integer> numerosMenores = agruparPorRepeticionEstrellas();
		Integer menor = menorRepeticionEstrellas();
		for(Integer n : numerosMenores.keySet()) {
			if(numerosMenores.get(n).equals(menor)) {
				mensaje.append(n+"   ");
			}
		}
		return "Los numeros con menor repeticion son: \n"+mensaje.toString()+"\ncon un total de: "+menor+" repeticiones";
	}
	
	public int maximoAciertosPosibles(Combinacion otra) {
		int aciertos =-1;
		List<Combinacion> auxiliar =new ArrayList<>();
		for(LocalDate k : sorteos.keySet()) {
			auxiliar.add(sorteos.get(k));
		}
		
		for (Combinacion c: auxiliar) {
			if(c.comprobarCombinacion(otra)>aciertos) {
				aciertos=c.comprobarCombinacion(otra);
			}
		}
		
		return aciertos;
	}
	
	public String mayorSecuenciaDeNumerosConsecutivos(){
		int mayorRepeticion = 0;
		String mensaje = null;
		for(LocalDate k : sorteos.keySet()) {
			if(sorteos.get(k).numeroDeNumerosConsecutivos()>mayorRepeticion) {
				mayorRepeticion=sorteos.get(k).numeroDeNumerosConsecutivos();
				mensaje=sorteos.get(k).getNumeros()+" => "+mayorRepeticion;
			}
			
				
		}
		return mensaje.substring(1,19)+mensaje.substring(20);
		
	}
	
	
	

}

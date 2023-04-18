package ejercicio6.cr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
//listarPalabras
public class Diccionario {
	
	private Map<String, List<String>> pala;
	
	public Diccionario() {
		super();
		pala=new HashMap<String, List<String>>();
	}
	
	public void addPalabra(String nombre, String texto) {
		Palabra p1 = new Palabra(nombre);
		pala.put(p1.getNombre(), new ArrayList<String>());
		pala.get(p1.getNombre()).add(texto);
	}
	
	public String buscarPalabra(String p) {
		StringBuilder sb = new StringBuilder();
		sb.append(pala.get(p));
		
		
		return sb.toString();
	}
	
	public boolean borrarPalabra(String p) throws Exception {
		
		boolean estaBorrado=false;
			if (pala.remove(p) != null) {
				pala.remove(p);
				estaBorrado=true;
			}else {
				throw new Exception("No existe esta palabra");
			}
		
		return estaBorrado;
	}
	
	/*
	public Collection<Palabra> listarPalabrasQueEmpiecenPor(String cadena) {
		Iterator<Palabra> it = diccionario.iterator();
		List<Palabra> listaTemporal = new ArrayList<>();
		while(it.hasNext()) {
			Palabra tmp=it.next();
			if(tmp.getPalabra().toLowerCase().startsWith(cadena.toLowerCase())) {
				listaTemporal.add(tmp);
			}			
		}
		Iterator<Palabra> it2 = listaTemporal.iterator();
		Collections.sort(listaTemporal, new ComparaPalabra());
		
		return listaTemporal;
	}
	*/

}

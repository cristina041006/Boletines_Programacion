package PlataformaOnline.jacaranda.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import PlataformaOnline.jacaranda.com.comparator.SerieComparatorTema;
import PlataformaOnline.jacaranda.com.comparator.TemporadaComparatorNumeroCap;

public class Catalogo {

	private HashMap<String, Serie> mapSeries;
	
	/**
	 * Crea el objeto que nos servirá para tener las series
	 */
	public Catalogo() {
		mapSeries=new HashMap<String, Serie>();
	}
	
	
	/** Añade una serie a la lista de series. Si existe una serie con el mismo nombre lanza una excpetion
	 * 
	 * @param serie
	 * @throws SerieException
	 */
	public void annadirSerie(String nombreSerie, int anno, Tema tema) throws SerieException {
		if (mapSeries.containsKey(nombreSerie)) {
			throw new SerieException("Ya existe esa serie");
		}
		Serie serie = new Serie(nombreSerie, anno, tema);
		mapSeries.put(serie.getNombreSerie(), serie);
	}
	
	
	/** Añade una temporada a la Serie cuyo nombre se le pasa por argumento, si no existe
	 * la Serie lanza una exception
	 * @param serie
	 * @throws SerieException
	 */
	public void annadirTemporada(String nombreSerie, String temporada) throws SerieException {
		if (!mapSeries.containsKey(nombreSerie)) {
			throw new SerieException("No existe esa serie");
		}
		Serie serie = mapSeries.get(nombreSerie);
		serie.annadirTemporada(temporada);
	}
	
	
	/** Añade un capítulo a la temporada de la Serie cuyo nombre se le pasa por argumento, si no existe
	 * la Serie o la temporada lanza una exception
	 * @param serie
	 * @throws SerieException
	 */
	public void annadirCapituloTemporada(String nombreSerie, String temporada, String capitulo) throws SerieException {
		if (!mapSeries.containsKey(nombreSerie)) {
			throw new SerieException("No existe esa serie");
		}
		Serie serie = mapSeries.get(nombreSerie);
		if(!serie.listadoTemporadasPorNumeroDeCapitulos().contains(temporada)) {
			throw new SerieException("No existe la temporada ");
		}
		serie.annadirCapituloTemporada(temporada, capitulo);

	}
	
	
	/** Valorar una temporada de la Serie cuyo nombre se le pasa por argumento, si no existe
	 * la Serie o la temporada lanza una exception
	 * @param serie
	 * @throws SerieException
	 */
	public void valorarTemporada(String nombreSerie, String temporada, int valoracion) throws SerieException {
		if (!mapSeries.containsKey(nombreSerie)) {
			throw new SerieException("No existe esa serie");
		}
		Serie serie = mapSeries.get(nombreSerie);
		serie.valorarTemporada(temporada, valoracion);
	}
	
	/**
	 * Devuelve el número de temporadas que tiene la serie que se pasa por parámetro
	 * Si no existe la serie saltará la excepción.
	 * @param nombreSerie
	 * @return
	 * @throws SerieException
	 */

	public int numeroDeTemporadasDeUnaSerie(String nombreSerie) throws SerieException{
		int numero =0;
		if (!mapSeries.containsKey(nombreSerie)) {
			throw new SerieException("La serie no existe");
		}
		numero = mapSeries.get(nombreSerie).listadoTemporadasPorNotaMedia().length();
		
		return numero;
	}
	
	
	
	/** Modifica el tema de una serie. Si no se encuentra la serie o ya tenía ese tema saltará la excepción. 
	 * 
	 * @param nombreSerie
	 * @param nuevoTema
	 * @throws SerieException
	 */
	public void modificarTema( String nombreSerie, Tema nuevoTema) throws SerieException {
		if(!mapSeries.containsKey(nombreSerie)) {
			throw new SerieException("La serie no existe");
		}
		if (mapSeries.get(nombreSerie).getTema().equals(nuevoTema)) {
			throw new SerieException("El tema es el mismo");
		}
		
		mapSeries.get(nombreSerie).setTema(nuevoTema);
		
		
		
	}
	
	/**
	 * Devolverá un listado ordenado de forma creciente por el año de la serie. 
	 * Para cada serie se mostrará su nombre, año y número de temporadas. 
	 * Si no hay ninguna serie de ese tema saltará la excepción.
	 * @param tema
	 * @return
	 * @throws SerieException
	 */
	public  String listadoOrdenadoSeriesDeUnTema( Tema tema)  throws SerieException {
		StringBuilder sb = new StringBuilder();
		List<Serie> s = new ArrayList<>();
		
		for (String s2: mapSeries.keySet()) {
			s.add(mapSeries.get(s2));
		}
		
		s.sort(new SerieComparatorTema());
		
		for (Serie t: s) {
			sb.append(t).append(System.lineSeparator());
		}
		
		return sb.toString();
	}


	@Override
	public String toString() {
		return "Catalogo [mapSeries=" + mapSeries + "]";
	}
	
	
}

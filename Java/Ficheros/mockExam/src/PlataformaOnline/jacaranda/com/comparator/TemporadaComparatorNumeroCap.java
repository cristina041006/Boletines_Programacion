package PlataformaOnline.jacaranda.com.comparator;

import java.util.Comparator;

import PlataformaOnline.jacaranda.com.Temporada;

public class TemporadaComparatorNumeroCap implements Comparator<Temporada> {

	@Override
	public int compare(Temporada o1, Temporada o2) {
		int result = 0;
		if(o1==null) {
			result=-1;
		}else if (o2==null) {
			result=-1;
		}else {
			result = o1.numeroCapitulos()-o2.numeroCapitulos();
		}
		return result;
	}

}

package PlataformaOnline.jacaranda.com.comparator;

import java.util.Comparator;

import PlataformaOnline.jacaranda.com.Serie;

public class SerieComparatorTema implements Comparator<Serie>{

	

	@Override
	public int compare(Serie o1, Serie o2) {
		int result = 0;
		if(o1==null) {
			result=-1;
		}else if (o2==null) {
			result=-1;
		}else {
			result = o1.getTema().compareTo(o2.getTema());
		}
		return 0;
	}

}

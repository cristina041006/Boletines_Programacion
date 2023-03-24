package ejercicio.cr.comparadores;

import java.util.Comparator;

import ejercicio.cr.Vehiculo;

public class compararTipoCombustible implements Comparator<Vehiculo> {


	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		int resultado =0;
		if(o1!=o2) {
			if(o1==null) {
				resultado=-1;
			}else if(o2==null) {
				resultado=1;
			}else {
				resultado = o1.getTipo().compareTo(o2.getTipo())==0? o1.getCombu().compareTo(o2.getCombu()): o1.getTipo().compareTo(o2.getTipo()); 
			}
		}
		return resultado;
	}

}

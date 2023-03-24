package ejercicio.cr;

import java.util.Objects;

public class Carta {
	
	private int number;
	private Palo palo;
	
	public Carta(Palo palo, int number) {
		super();
		this.number=number;
		this.palo=palo;
	}
	
	public double getValor() {
		double[] valor = {1, 2, 3, 4, 5, 6, 7, 0.5, 0.5, 0.5};
		return valor[number-1];
	}


	public boolean equals2(Object obj) {
		boolean esIgual = this == obj;
		
		if (!esIgual && obj != null && getClass() == obj.getClass()) {
			Carta other = (Carta) obj;
			esIgual =   number == other.number && palo == other.palo;
		}
		
		return esIgual;
	}

	@Override
	public String toString() {
		return "" + number + " de " + palo + "";
	}
	
	

}

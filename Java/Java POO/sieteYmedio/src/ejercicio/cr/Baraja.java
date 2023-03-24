package ejercicio.cr;

import java.util.Arrays;

public class Baraja {
	private int siguiente;
	private int numCartas;
	private Carta[] baraja = new Carta[40];
	private Carta[] carta;
	
	
	public Baraja() {
		super();
		int contador =0;
		for (Palo p: Palo.values()) {
			for (int i = 1; i<13 ; i++) {
				if (i!=8 && i !=9) {
					baraja[contador] = new Carta(p, i);
					contador++;
				}
			}
		}
		
	}
	@Override
	public String toString() {
		return "Baraja ="  
				+ Arrays.toString(baraja) + "";
	}
	
	
	public void barajar () {
		int contador=30;
		
		for (int i=0; i<contador; i++) {
			int numeroAleatorio1=(int)(Math.random()*40+0);
			int numeroAleatorio2=(int)(Math.random()*40+0);
			
			Carta cambio1= baraja [numeroAleatorio1];
			Carta cambio2 = baraja[numeroAleatorio2];
			
			baraja [numeroAleatorio1]=cambio2;
			baraja[numeroAleatorio2]=cambio1;
		}
	}
	
	public Carta dameCarta() {
		return baraja[siguiente++%40];
				
	}
	
	public String ganador(double puntuaje, double puntuajeBnaca) {
		StringBuilder sb = new StringBuilder();
		if (puntuaje>7.5 && puntuajeBnaca<=7.5) {
			sb.append("Gana la banca");
		}else if (puntuaje<=7.5 && puntuajeBnaca>7.5) {
			sb.append("Gana el jugador");
		}else if (puntuaje<=7.5 && puntuajeBnaca<=7.5) {
			if (puntuaje>puntuajeBnaca){
				sb.append("Gana el jugador");
			}else {
				sb.append("Gana la banca");
			}
		}
		
		return sb.toString();
		
		
	}
}

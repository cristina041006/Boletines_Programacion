package ejercicio.cr;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static final String  MENU = "1. Jugar \n"
										+ "2. Barajar \n"
										+ "3. Salir";
	
	public static final String  MENUJUEGO = "1. Pido carta \n"
			+ "2. Me planto";

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println(MENU);
		System.out.println("Dime una opcion");
		String opcion = sc.nextLine();
		
		while (!opcion.equalsIgnoreCase("3")) {
			double puntuajeJugador=0;
			double puntuajeBanca=0;
			Carta c;
			Baraja b = new Baraja();
			switch (opcion) {
			case "1":
				System.out.println("Turno del jugador");
				System.out.println(MENUJUEGO);
				System.out.println("Elige tu opcion");
				String juego =sc.nextLine(); 
				while(!juego.equals("2")) {
					c=b.dameCarta();
					System.out.println(c);
					puntuajeJugador+=c.getValor();
					System.out.println("Tinenes "+ puntuajeJugador+ " puntos");
					System.out.println(MENUJUEGO);
					System.out.println("Elige tu opcion");
					juego =sc.nextLine(); 
				}
				System.out.println("Turno de la banca");
				System.out.println("-----------------------------------");
				System.out.println(MENUJUEGO);
				System.out.println("Elige tu opcion");
				String juegoBnaca =sc.nextLine(); 
				while(!juegoBnaca.equals("2")) {
					c=b.dameCarta();
					System.out.println(c);
					puntuajeBanca+=c.getValor();
					System.out.println("Tinenes "+ puntuajeBanca+ " puntos");
					System.out.println(MENUJUEGO);
					System.out.println("Elige tu opcion");
					juego =sc.nextLine(); 
				}
				b.ganador(puntuajeJugador, puntuajeBanca);
				break;
			case "2":
				b.barajar();
				break;

			default:
				break;
			}
			
			System.out.println(MENU);
			System.out.println("Dime una opcion");
			opcion = sc.nextLine();
			
		}
		
	}

}

package Ejercicio1.cr;

import java.util.Scanner;

public class Menu {
	public static final String MENU= "\n 1. Mover línea: (A-arriba, B-ABajo, I-Izquierda, D-Derecha) \n 2. Mostrar linea \n 3.Salir"; 

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Dime la cordenada X del primer punto");
		double x= Double.valueOf(sc.nextLine());
		System.out.println("Dime la cordenada Y del primer punto");
		double y= Double.valueOf(sc.nextLine());
		
		Punto p =new Punto(x,y);
		
		System.out.println("Dime la cordenada X del segundo punto");
		double x2= Double.valueOf(sc.nextLine());
		System.out.println("Dime la cordenada Y del segundp punto");
		double y2= Double.valueOf(sc.nextLine());
		
		Punto p2=new Punto(x2,y2);
		
		Linea l =new Linea(p, p2);
		
		System.out.println(MENU);
		System.out.println("Dime una opcion: ");
		String opcion=sc.nextLine();
		
		while(!opcion.equalsIgnoreCase("3")) {
			switch (opcion) {
			case "1":
				System.out.println("Dime el movimiento");
				if (sc.nextLine().equalsIgnoreCase("A")) {
					System.out.println("Dime la distancia: ");
					double distancia =Double.valueOf(sc.nextLine());
					System.out.println(l.moverArriba(distancia));
				}else if (sc.nextLine().equalsIgnoreCase("B")) {
					System.out.println("Dime la distancia: ");
					double distancia =Double.valueOf(sc.nextLine());
					System.out.println(l.moverAbajo(distancia));
				}else if (sc.nextLine().equalsIgnoreCase("D")) {
					System.out.println("Dime la distancia: ");
					double distancia =Double.valueOf(sc.nextLine());
					System.out.println(l.moverDerecha(distancia));
				}else if (sc.nextLine().equalsIgnoreCase("I")) {
					System.out.println("Dime la distancia: ");
					double distancia =Double.valueOf(sc.nextLine());
					System.out.println(l.moverIzquierda(distancia));
				}
				
				break;
			case "2":
				System.out.println(l);
				break;
			default: 
				System.out.println("Opcion equivocada");
				break;
			}
			
			System.out.println(MENU);
			System.out.println("Dime una opcion: ");
			opcion=sc.nextLine();
		}
		
		System.out.println("Saliste del programa");


	}

}

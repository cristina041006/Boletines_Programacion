package Ejercicio3.cr;

import java.util.Scanner;

public class Menu {
	
	public static final String MENU= "/n 1. Llenar jarra /n 2. Vaciar Jarra /n 3. Volcar jarra A en B /n 4. Volcar jarra B en A /n 5. Ver estados de las Jarras /n 6. Salir";

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//System.out.println("Que capacidad tendra tu jarra?: ");
		//double cap = Double.valueOf(sc.nextLine());
		
		Jarra jarraA = new Jarra();
		jarraA.setCapacidad(7);
		jarraA.llenarJarra();
		
		//System.out.println("Que capacidad tendra tu otra jarra?: ");
		//double cap2 = Double.valueOf(sc.nextLine());
		
		Jarra jarraB = new Jarra();
		jarraB.setCapacidad(4);
		jarraB.llenarJarra();
		
		System.out.println(MENU);
		System.out.println("Elige una opcion: ");
		String opcion= sc.nextLine();
		
		while (!opcion.equals("6")) {
			switch (opcion) {
			case "1":
				System.out.println("Que jarra desea llenar A o B");
				if (sc.nextLine().equalsIgnoreCase("A")) {
					jarraA.llenarJarra();
				}else if (sc.nextLine().equalsIgnoreCase("B")) {
					jarraB.llenarJarra();
				}
				
				break;
			case "2":
				System.out.println("Que jarra desea vaciar A o B");
				if (sc.nextLine().equalsIgnoreCase("A")) {
					jarraA.vaciarJarra();
				}else if (sc.nextLine().equalsIgnoreCase("B")) {
					jarraB.vaciarJarra();
				}
				break;
			case "3":
				jarraA.volcarJarra(jarraB);
				break;
			case "4": 
				jarraB.volcarJarra(jarraA);
				break;
			case "5":
				System.out.println(jarraA);
				System.out.println(jarraB);
			default:
				break;
			}
			
			System.out.println(MENU);
			System.out.println("Elige una opcion: ");
			opcion= sc.nextLine();
		}

	}

}

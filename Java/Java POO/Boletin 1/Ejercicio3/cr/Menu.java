package Ejercicio3.cr;

import java.util.Scanner;


public class Menu {

	public static final String MENU= "\n 1. Servir cafe solo \n 2. Servir leche \n 3. Servir cafe con leche"
			+ "\n 4. Consultar el estado de la maquina" + "\n 4. Apagar maquina y salir"; 
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println(MENU);
		System.out.println("Elige una opcion");
		String opcion=sc.nextLine();
		
		Maquina maq= new Maquina();
		
		while (!opcion.equalsIgnoreCase("5")){
			switch (opcion) {
			case "1":
				System.out.println("Que dinero quieres depositar: ");
				double dinero=Double.valueOf(sc.nextLine());
				System.out.println(maq.servirProducto("Cafe", dinero));
				break;
			case "2":
				System.out.println("Que dinero quieres depositar: ");
				double dinero2=Double.valueOf(sc.nextLine());
				System.out.println(maq.servirProducto("Leche", dinero2));
				break;
			case "3":
				System.out.println("Que dinero quieres depositar: ");
				double dinero3=Double.valueOf(sc.nextLine());
				System.out.println(maq.servirProducto("Cafe con leche", dinero3));
				break;
			case "4":
				System.out.println(maq);
	
				break;

			default:
				System.out.println("Opcion incorrecta");
				break;
			}
			System.out.println(MENU);
			System.out.println("Elige una opcion");
			opcion=sc.nextLine();
		}
		
		System.out.println("Salio del programa");
		

	}

}

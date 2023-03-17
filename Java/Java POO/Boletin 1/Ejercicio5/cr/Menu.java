package Ejercicio5.cr;

import java.util.Scanner;

import Ejercicio4.cr.Complejo;

public class Menu {

	public static final String MENU= "\n 1. Sumar complejos \n 2. Restar complejos \n 3.Salir"; 
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println(MENU);
		System.out.println("Eliga una opcion");
		String opcion=sc.nextLine();
		
		while(!opcion.equalsIgnoreCase("3")) {
			switch (opcion) {
			case "1":
				System.out.println("Dime la parte real de un complejo");
				double real1= Double.valueOf(sc.nextLine());
				System.out.println("Dime la parte imaginaria de un complejo");
				double img1= Double.valueOf(sc.nextLine());
				
				Complejo cj1=new Complejo(real1, img1);
				
				System.out.println("Dime la parte real de otro complejo");
				double real2= Double.valueOf(sc.nextLine());
				System.out.println("Dime la parte imaginaria de otro complejo");
				double img2= Double.valueOf(sc.nextLine());
				
				Complejo cj2=new Complejo(real2, img2);
				
				Complejo cj3 =cj1.sumar(cj2);
				
				System.out.println("La suma es " +cj3);
				
				break;
			case "2":
				
				System.out.println("Dime la parte real de un complejo");
				double real3= Double.valueOf(sc.nextLine());
				System.out.println("Dime la parte imaginaria de un complejo");
				double img3= Double.valueOf(sc.nextLine());
				
				Complejo cj4=new Complejo(real3, img3);
				
				System.out.println("Dime la parte real de otro complejo");
				double real4= Double.valueOf(sc.nextLine());
				System.out.println("Dime la parte imaginaria de otro complejo");
				double img4= Double.valueOf(sc.nextLine());
				
				Complejo cj5=new Complejo(real4, img4);
				
				Complejo cj6 =cj4.restar(cj5);
				
				System.out.println("La resta es " +cj6);
				
				break;

			default:
				break;
			}
			
			System.out.println(MENU);
			System.out.println("Eliga una opcion");
			opcion=sc.nextLine();
		}
		System.out.println("Saliste del programa");

	}

}

package Ejercicio1.cr;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Dime la longitud del rectangulo: ");
		double longitud= Double.valueOf(sc.nextLine());
		
		System.out.println("Dime el ancho del rectangulo: ");
		double ancho = Double.valueOf(sc.nextLine());
		
		Rectangulo rec =new Rectangulo(longitud, ancho);
		System.out.println(rec);

	}
	
	

}

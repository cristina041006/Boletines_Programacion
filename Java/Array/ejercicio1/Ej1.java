package ejercicio1;

import java.util.Scanner;

public class Ej1 {
	
	public static int LONGITUD_MAXIMA =10;

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int numero=0;
		
		int[] numeros = new int[LONGITUD_MAXIMA];
		
		for (int i=0; i<LONGITUD_MAXIMA; i++) {
			System.out.println("Dime un numero entero");
			numero = Integer.valueOf(sc.nextLine());
			numeros[i] = numero;
		}
		
		for (int i=numeros.length-1; i>=0; i--) {
			System.out.println(numeros[i]);
		}
		
	}

}

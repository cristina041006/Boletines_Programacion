package ejercicio2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int numero=0;
		
		int[] numeros = new int[10];
		
		for (int i=0; i<10; i++) {
			System.out.println("Introduce el numero en la posicion ("+ i+ "/10):");
			numero = Integer.valueOf(sc.nextLine());
			numeros[i] = numero;
		}
		
		for (int i=0; i<numeros.length-1; i++) {
			numeros[i-1] = numeros[i];
		}
		
		System.out.println(numeros);
		
		/*desplazarse hacia la derecha, me da fuera de rango*/

	}

}

package ejercicio5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Cuantas cartas reparto?");
		int numeroCartas = Integer.valueOf(sc.nextLine());
		int contador=0;
		
		String[] cartas1 = new String[numeroCartas];
		String[] cartas2 = new String[numeroCartas];
		String[] palos ={"oros", "copas", "espadas", "bastos"};
		
		int[] arrayAux1 = new int [numeroCartas];
		int[] araryAux2 = new int [numeroCartas];
		
		while (contador<numeroCartas) {
			int numeroAleatorio= (int)(Math.random()*12+1);
			int paloAleatorio= (int)(Math.random()*3+0);
			
			if (buscarElemento(arrayAux1, numeroAleatorio) == false) {
				cartas1[contador] = String.valueOf(numeroAleatorio)+ " de " + palos[paloAleatorio] ;
				arrayAux1[contador] = numeroAleatorio;
			} 
			
			
			
			
			int numeroAleatorio2= (int)(Math.random()*12+1);
			int paloAleatorio2= (int)(Math.random()*3+0);
			
			cartas2[contador] = String.valueOf(numeroAleatorio2)+ " de " +  palos[paloAleatorio2] ;
			
			contador++;
		}
		
		
		System.out.println("Cartas del jugador 1: ");
		System.out.println(Arrays.toString(cartas1));
		System.out.println("Cartas del jugador 2: ");
		System.out.println(Arrays.toString(cartas2));
		

	}
	
	public static boolean buscarElemento (int[] cartas1, int elemento) {
		int i=0;
		boolean posicion =false;
		
		while (i<cartas1.length && posicion == false) {
			posicion= elemento == cartas1[i]? true: false;
			i++;
		}
		
		return posicion;
	}

}

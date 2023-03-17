package ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {

	public static final String DIGITOS ="0123456789";
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Desea introducir mas numeros? s/n");
		String aux =sc.nextLine();
		
		int sumaTotal=0;
		int contador=0;
		
		int[] estetica = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] numerosAux = new int[DIGITOS.length()];
		
		do {
			System.out.println("Dime un numero de 1 al 1000");
			aux=sc.nextLine();
			sumaTotal = Integer.valueOf(aux);
			contador++;
			char ultimoDigito = aux.charAt(aux.length()-1); 
			
			
			numerosAux[DIGITOS.indexOf(ultimoDigito)]+=1;

			
			System.out.println("Desea introducir mas numeros? s/n");
			aux =sc.nextLine();
		}while (!aux.equalsIgnoreCase("N"));
		
		System.out.println(sumaTotal/contador);
		System.out.println(Arrays.toString(estetica));
		System.out.println(Arrays.toString(numerosAux));
		
		int numeroMayor=0;
		String posicion="";
		String posicion2="";
		
		for (int i=0; i<numerosAux.length; i++) {
			if (numerosAux[i]==numeroMayor) {
				numeroMayor=numerosAux[i];
				posicion+= i+ ",";
			}if (numerosAux[i]>numeroMayor) {
				numeroMayor=numerosAux[i];
				posicion= "";
				
				posicion+=i;
			}if (numerosAux[i]==0){
				posicion2+= i+ ", ";
			}
			
		}
		
		System.out.println("Los numeros que mas se repitiron fueron " +posicion);
		System.out.println("Los numeros que no se termino ningun numero fueron " +posicion2);
		
		
		
	}
	
	
	
	

}

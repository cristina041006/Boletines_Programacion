package ejercicio.cr;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		Integer[] numeros = new Integer[6];
		numeros[0]=3;
		numeros[1]=7;
		numeros[2]=8;
		numeros[3]=32;
		numeros[4]=9;
		numeros[5]=1;
		
		System.out.println(Arrays.toString(numeros));
		
		System.out.println(Arrays.toString(reverse(numeros)));
		

	}
	
	public static <T> T[] reverse (T[] arrayOriginal) {
		
		T[] arrayReverse = (T[]) new Object[arrayOriginal.length];
		
		//T[] ejemplo = original.clone
		int contador=0;
		
		for (int i=arrayOriginal.length-1; i>0; i--) {
			arrayReverse[contador]=arrayOriginal[i];
			contador++;
		}
		
		if(contador==arrayOriginal.length-1) {
			arrayReverse[contador]=arrayOriginal[0];
		}
		
		return arrayReverse;
		
	}
	
	

}

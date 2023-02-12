package b3.cr;

public class Ejercicio7 {

	public static void main(String[] args) {
		System.out.println(encontrarPalabra("shbaoxlna","hola"));

	}
	
	public static boolean encontrarPalabra(String cadena, String palabra) {
		boolean mensaje=false;
		
		StringBuilder estaCadena =new StringBuilder();
		
		for (int i=0; i<cadena.length()-1; i++) {
			for (int a=0; a<palabra.length(); a++) {
				if ((cadena.charAt(i)==palabra.charAt(a))) {
					estaCadena.append(cadena.charAt(i));
				}
			}
		}
		
		if (estaCadena.equals(palabra)) {
			mensaje=true;
		}
		
			
		return mensaje;
	}
	
	/* 
	 * Asegurar que la letra no este ya en estaCadena y que este ordenada 
	 */

}

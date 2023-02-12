package b3.cr;

public class Ejercicio3 {

	public static void main(String[] args) {
		System.out.println(cuantasVeces("yo soy yo misma", "yo"));
		
	}
	
	public static int cuantasVeces(String cadena, String palabra) {
		int veces=0;
		
		
		
		for (int i=0; i<cadena.length()-1; i++) {
			int posicion=cadena.indexOf(palabra);
			if ((cadena.substring(posicion, (posicion+palabra.length())).equals(palabra))) {
				veces+=1;
			}
		}
		
		
		
		
		
		
		return veces;
	}
/*
 * recorrer la cadena
 */
}

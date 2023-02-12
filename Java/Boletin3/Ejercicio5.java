package b3.cr;

public class Ejercicio5 {

	public static void main(String[] args) {
		System.out.println(esPalindromo("somos o no somos"));

	}
	
	
	public static boolean esPalindromo (String cadena) {
		boolean mensaje=false;
		
		String nuevaCadena="";
		String aux="";
		
		
		for (int i=0; i<cadena.length(); i++) {
			if (cadena.charAt(i)!=' ') {
				nuevaCadena+=cadena.charAt(i);
			}
		}
		
		for (int a=0 ; a<nuevaCadena.length(); a++) {
			if (nuevaCadena.charAt(a)==nuevaCadena.charAt(nuevaCadena.length()-1-a)) {
				aux+=nuevaCadena.charAt(a);
			}
			
		}
		
		if (aux.equals(cadena)) {
			mensaje=true;
		}
		
		
		return mensaje;
		
		
	}
	
/* que rl true no solo sea en el final*/

}

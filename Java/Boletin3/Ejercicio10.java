package b3.cr;

public class Ejercicio10 {

	public static void main(String[] args) {
		System.out.println(cifrarCesar('B', 7));
		System.out.println(cesarCadena("CASADO", 3));
		System.out.println(comprobarCesar("casado", "fdvdgr"));

	}
	
	
	public static char cifrarCesar(char caracter, int nivel_cifrado) {
		final String     ABCEDARIO = "abcdefghijklmnñopqrstuvwxyz";
		char cifrado = ' ';		
		for (int i=0; i<ABCEDARIO.length(); i++) {
			if(Character.toLowerCase(caracter)==ABCEDARIO.charAt(i)) {
				cifrado = ABCEDARIO.charAt((i+nivel_cifrado)%ABCEDARIO.length());
			}
		}
		
		return cifrado;
	}
	
	public static String cesarCadena(String cadena, int nivel_cifrado) {
		String mensaje="";
		for (int i=0; i<cadena.length();i++) {
			mensaje+=cifrarCesar(cadena.charAt(i), nivel_cifrado);
		}
		
		
		return mensaje;
	}
	
	
	public static int comprobarCesar(String cadena, String cesado) {
		final String     ABCEDARIO = "abcdefghijklmnñopqrstuvwxyz";
		boolean mensaje=false;
		
		int nivel=0;
		 
		while(!mensaje && nivel<=ABCEDARIO.length()) {
			nivel++;
			if (cesarCadena(cadena, nivel).equalsIgnoreCase(cesado)) {
				mensaje=true;
			}
			
		}
		
		
		return nivel;
	}
	
}

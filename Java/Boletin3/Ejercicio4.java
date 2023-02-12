package b3.cr;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		System.out.println(empezarCon("hola que tal", "ho"));
		System.out.println(contiene("quieres que sea yo la que abre", "q"));
		System.out.println(terminaCon("quieres irte", "ir"));

	}
	
	public static boolean empezarCon(String cadena, String palabra) {
		boolean mensaje=false;
		int posicion=cadena.indexOf(palabra);
		
		if ((posicion==0) && (cadena.substring(posicion, (posicion+palabra.length())).equals(palabra))) {
			mensaje=true;
		}
		
		return mensaje;
	}
	
	
	
	public static boolean contiene(String cadena, String palabra) {
		boolean mensaje=false;
		int posicion= cadena.indexOf(palabra);
		if (cadena.substring(posicion, (posicion+palabra.length())).equals(palabra)) {
			mensaje=true;
		}
		
		return mensaje;
	}
	
	public static boolean terminaCon(String cadena, String palabra) {
		boolean mensaje =false;
		int position=cadena.indexOf(palabra);
		
		if (cadena.substring(position, cadena.length()).equals(palabra)) {
			mensaje=true;
		}
		
		return mensaje;
	}

}

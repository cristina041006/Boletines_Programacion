package b3.cr;

public class Ejercicio8 {

	public static void main(String[] args) {
		System.out.println(intercambiar("hola soy cristina", "cristina", "juan"));

	}
	
	public static String intercambiar(String cadena, String palabra1, String palabra2) {
		String nuevaCadena ="";
		if (cadena.contains(palabra1)) {
			nuevaCadena=cadena.replace(palabra1, palabra2);
		}
		
		return nuevaCadena;
	}

}

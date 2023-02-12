package b3.cr;

public class Ejercicio6 {

	public static void main(String[] args) {
		System.out.println(esCapicua(33));

	}
	
	public static boolean esCapicua(int numero) {
		boolean mensaje=false;
		
		String numeroC=String.valueOf(numero);
		String aux="";
		
		
		for (int i=0 ; i<numeroC.length()/2; i++) {
			if (numeroC.charAt(i)==numeroC.charAt(numeroC.length()-1-i)) {
				mensaje=true;
			}
		
		}
		
		return mensaje;
	}
	
	public static boolean esCapicua(double numero) {
		return esCapicua(numero);
	}
	
/*ponerlo para decimal y lo mismo que el 5*/

}
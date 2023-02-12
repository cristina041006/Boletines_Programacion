package b3.cr;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println(par_imparFor("adios", "impar"));
		System.out.println(par_imparWh("adios", "impar"));
		System.out.println(par_imparDW("adios", "impar"));

	}
	
	public static String par_imparFor(String cadena, String bandera) {
		String mensaje="";
		
		if (bandera.equals("par")) {
			for (int i=0; i<cadena.length(); i+=2) {
				mensaje+=cadena.charAt(i);
			}
		}else if (bandera.equals("impar")) {
			for (int i=0; i<cadena.length()-1; i++) {
				if (i%2!=0) {
					mensaje+=cadena.charAt((i));
				}
				
			}
		}
		
		return mensaje;
	}
	
	public static String par_imparWh(String cadena, String bandera){
		String mensaje="";
		
		int i=0;
		
		if (bandera.equals("par")) {
			while (i<cadena.length()) {
				mensaje+=cadena.charAt(i);
				i+=2;
			}
		}else if (bandera.equals("impar")) {
			while (i<cadena.length()) {
				if (i%2!=0) {
					mensaje+=cadena.charAt((i));
					i++;
				}
			}
		}
		
		
		return mensaje;
		
		
		
	}
	
	
	public static String par_imparDW(String cadena, String bandera) {
		String mensaje="";
		
		int i=0;
		
		if (bandera.equals("par")) {
			do {
				mensaje+=cadena.charAt(i);
				i+=2;
			}while ( (i<cadena.length()));
			
		}else if (bandera.equals("impar")) {
			do {
				if (i%2!=0) {
					mensaje+=cadena.charAt((i));
					
				}
				i++;
			}while(i<=cadena.length());	
			
		}
		
		return mensaje;
	}
			
	
/*
 * que funcionw el impar
 */

}

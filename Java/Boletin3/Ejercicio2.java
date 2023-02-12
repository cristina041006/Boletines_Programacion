package b3.cr;

public class Ejercicio2 {

	public static void main(String[] args) {
		String numero="156";
		int suma =0;
		while(numero.length()>1) {
			for (int i=0 ; i<numero.length(); i++) {
				System.out.println(numero.charAt(i));
				suma+=numero.charAt(i);
			}
			numero=String.valueOf(suma);
			
		}
		
		if (suma==0 || suma==3 || suma==6 || suma==9) {
			System.out.println("es divisible");
		}else {
			System.out.println("no es divisible");
		}
		
		System.out.println(suma);

	}

	/*
	 * arreglar la suma 
	 */
	
}

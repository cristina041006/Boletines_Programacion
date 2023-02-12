package b3.cr;

public class Ejercicio9 {

	public static void main(String[] args) {
		System.out.println(contar("hola que tal yo soy cristina tengo 8 años. hoy como maca"));

	}
	
	public static String contar(String cadena) {
		int frases=1;
		int palabras=1;
		long parrafos=cadena.lines().count();
		
		for (int i=0; i<cadena.length(); i++) {
			if (cadena.charAt(i)== '.') {
				frases+=1;
			}else if ((cadena.charAt(i)==' ') && (cadena.charAt(i+1)!=' ')) {
				palabras+=1;
			}
		}
		
		String mensaje= String.valueOf(palabras) + String.valueOf(frases) + String.valueOf(parrafos);
		
		return mensaje ;

	}
	
}

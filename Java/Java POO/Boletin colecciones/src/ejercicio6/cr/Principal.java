package ejercicio6.cr;

import java.util.Scanner;

public class Principal {
	
	public static final String MENU ="1.Añadir palabra \n 2. Buscar palabra \n 3. Borrar palabra \n 4. Listar \n 5. Salir";
	
	public static void main(String[] args) {
		System.out.println(MENU);
		System.out.println("Elige una opcion: ");
		Scanner sc = new Scanner (System.in);
		String opcion = sc.nextLine(); 
		
		while (!opcion.equalsIgnoreCase("5")) {
			Diccionario d = new Diccionario();
			switch (opcion) {
			case "1":
				System.out.println("Dime la palabra: ");
				String nombre = sc.nextLine();
				System.out.println("Dime su significado: ");
				String sg = sc.nextLine();
				d.addPalabra(nombre, sg);
				break;
			case "2":
				System.out.println("Dime la palabra: ");
				String palabra = sc.nextLine();
				d.buscarPalabra(palabra);
				break;
			case "3":
				System.out.println("Dime la palabra: ");
				String borrar = sc.nextLine();
				try {
					d.borrarPalabra(borrar);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case "4":
	
				break;

			default:
				break;
			}
			
			System.out.println(MENU);
			System.out.println("Elige una opcion: ");
			opcion = sc.nextLine(); 
		}

	}

}

package ejercicio4.cr;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Principal {
	
	public static final String MENU = "1. Nueva pagina consultada \n 2. Consultar historial completo \n 3. Consultar historial un dia \n 4. Borrar todo el historial \n 5. Borrar visitas a una pagina \n 6. Salir";

	public static void main(String[] args) {
		System.out.println(MENU);
		System.out.println("Elige una opcion");
		Scanner sc = new Scanner (System.in);
		String opcion = sc.nextLine();
		Historial h = new Historial();
		while (!opcion.equalsIgnoreCase("6")) {
			
			
			switch (opcion) {
			case "1":
				System.out.println("Dime el nombre de la pagina: ");
				String nombre= sc.nextLine();
				try {
					h.addPagina(nombre);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case "2":
				System.out.println( h.mostrar());
				break;
			case "3":
				System.out.println("Dime Un dia: ");
				int dia = Integer.valueOf(sc.nextLine());
				System.out.println("Dime Un mes: ");
				int mes = Integer.valueOf(sc.nextLine());
				System.out.println("Dime Un año ");
				int anio = Integer.valueOf(sc.nextLine());
				
				LocalDateTime fecha = LocalDateTime.of(anio, mes, dia, 0, 0);
				fecha.toLocalDate();
				h.mostrarHistorialUnDia(fecha);
				
				break;
			case "4":
				
				h.borrarHistorial();
				
				break;
			case "5":
				System.out.println("Dime el nombre: ");
				String nombrePagina = sc.nextLine();
				try {
					h.borrarVisitaPagina(nombrePagina);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
				
				
			default: 
				System.out.println("No hay opcion disponible");
				break;
			}
			
			System.out.println(MENU);
			System.out.println("Elige una opcion");
			opcion = sc.nextLine();
			
		}
		
		System.out.println("Saliste de las opciones");

	}

}

package main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import main.java.json.JsonManager;
import main.java.model.Clase;
import main.java.model.DatosLeidos;
import main.java.xml.reader.LectorXML;


public class Principal {
	
	public static final String MENU = "1.Mostrar todas las casetas existentes en una calle.\r\n"
			+ "2.Mostrar todas las casetas de tipo familiar\n" + "3. Mostrar todas las casetas de tipo Distrito\n" + "4. Mostrar todas las casetas que no sean ni familiares ni distritos.\n"
			+ "5. Mostrar para cada una de las calles del recinto ferial el número de casetas de tipo familiar que existen.\r\n"
			+ "6. Mostrar para cada una de las calles del recinto ferial el número de casetas de tipo Distrito que existen.\r\n"
			+ "7. Eliminar una caseta\n" + "8. Salir";

	public static void main(String[] args) {
		
		//System.out.println(dato);
		
		//new JsonManager().escribirColecccion(dato, ".\\files\\caseta.json");
		//new JsonManager().carcgarEstudiante(".\\files\\caseta.json");
		
		System.out.println(MENU);
		System.out.println("Elige una opcion");
		Scanner sc = new Scanner(System.in);
		String opcion = sc.nextLine();
		
		while (!opcion.equals("8")) {
			List<DatosLeidos> dato = new LectorXML().cargarDatos(".\\files\\casetasferia.xml");
			
			switch (opcion) {
			case "1":
				System.out.println("Dime la calle");
				String calle = sc.nextLine();
				System.out.println(mostrasCasetasDeUnaCalle(calle, dato));
				break;
			case "2":
				System.out.println(mostrasCasetaTipo(Clase.FAMILIAR, dato)); 
				break;
			case "3":
				System.out.println(mostrasCasetaTipo(Clase.DISTRITO, dato)); 
				break;
			case "4":
				System.out.println(mostrasCasetaTipo(Clase.ENTIDAD, dato)); 
				System.out.println(mostrasCasetaTipo(Clase.MUNICIPAL, dato)); 
				System.out.println(mostrasCasetaTipo(Clase.SERVICIOS, dato)); 
	
				break;
			case "5":
				System.out.println(mostrarCantidadDeCaseta(Clase.FAMILIAR, dato));
				break;
			case "6":
				System.out.println(mostrarCantidadDeCaseta(Clase.DISTRITO, dato));
				break;
			case "7":
	
				break;

			default:
				System.out.println("Opcion incorrecta");
				break;
			}
			
			System.out.println(MENU);
			System.out.println("Elige una opcion");
			opcion = sc.nextLine();
		}
		
		System.out.println("Saliste");

	}
	

	public static List<DatosLeidos> mostrasCasetasDeUnaCalle(String calle, List<DatosLeidos> datos) {
		List<DatosLeidos> casetas = new ArrayList<>();
		
		for (DatosLeidos d: datos) {
			if (d.getCalle().equals(calle)) {
				casetas.add(d);
			}
		}
		
		return casetas;
		
	}
	
	
	public static List<DatosLeidos> mostrasCasetaTipo (Clase tipo, List<DatosLeidos> datos) {
		List<DatosLeidos> casetas = new ArrayList<>();
		
		for(DatosLeidos d: datos ) {
			if (d.getClase().equals(tipo)) {
				casetas.add(d);
			}
		}
		
		return casetas;
		
	}
	

	public static Map<String, Integer> mostrarCantidadDeCaseta (Clase tipo, List<DatosLeidos> datos) {
		Map<String, Integer> cantidad = new HashMap<>();
		
		for(DatosLeidos d: datos) {
			if(!cantidad.containsKey(d.getCalle())) {
				if(d.getClase().equals(tipo)) {
					cantidad.put(d.getCalle(), 1);
				}
				
			}else {
				if(d.getClase().equals(tipo)) {
					cantidad.put(d.getCalle(), cantidad.get(d.getCalle()+1));
				}
			}
			
		}
		
		return cantidad;
	}
	
	
	public void eliminarCaseta (String calle, int numero) {
		//TODO
	}


}

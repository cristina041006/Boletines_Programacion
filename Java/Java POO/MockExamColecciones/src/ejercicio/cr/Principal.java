package ejercicio.cr;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		
		Historial h = new Historial();
		
		try {
			h.addSorteo(LocalDate.of(2023, 5, 2), new Combinacion(1, 4, 7, 34, 8, 10, 9));
		} catch (HistorialException | CombinacionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			h.addSorteo(LocalDate.of(2023, 5, 9), new Combinacion(1, 18, 7, 4, 10, 10, 16));
		} catch (HistorialException | CombinacionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			h.addSorteo(LocalDate.of(2022, 5, 2), new Combinacion(9, 45, 33, 4, 1, 11, 5));
		} catch (HistorialException | CombinacionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println(h.actualizarSorteo(LocalDate.of(2023, 5, 9), new Combinacion(1, 18, 7, 4, 10, 10, 1)));
		} catch (HistorialException | CombinacionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

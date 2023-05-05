package euromillon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

import cr.Combinacion;
import cr.CombinacionException;
import cr.Historial;
import cr.HistorialException;

public class Principal2 {

	public static void main(String[] args) {
		File euro = new File ("c:\\Users\\crist\\pruebaFicheros\\datosEuromillon2");
		
		
		Historial h = new Historial();
		
		
		try {
			FileReader reader = new FileReader(euro);
			BufferedReader buffer = new BufferedReader(reader);
			String linea;
			
			buffer.readLine();
			
			linea = buffer.readLine();
			
			while (linea!=null) {
				
				String[] combinacion = linea.split(",");
				String[] fecha = combinacion[0].split("/");
				
				h.addSorteo(LocalDate.of(Integer.valueOf(fecha[2]), Integer.valueOf(fecha[1]), Integer.valueOf(fecha[0])),
						new Combinacion(Integer.valueOf(combinacion[1]), Integer.valueOf(combinacion[2]), Integer.valueOf(combinacion[3]), Integer.valueOf(combinacion[4]), Integer.valueOf(combinacion[5]),
								Integer.valueOf(combinacion[7]), Integer.valueOf(combinacion[8])));

				linea= buffer.readLine();
			}
			
			System.out.println(h.numerosMasRepetidos());
			System.out.println(h.numerosMenosRepetidos());
			System.out.println(h.estrellasMasRepetidos());
			System.out.println(h.estrellasMenosRepetidos());
			System.out.println("-------------------");
			System.out.println(h.mayorSecuenciaDeNumerosConsecutivos());
			
			
		} catch (IOException | NumberFormatException | CombinacionException e) {
			
			e.printStackTrace();
		}
		

	}

}

package Principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import PlataformaOnline.jacaranda.com.SerieException;
import PlataformaOnline.jacaranda.com.Catalogo;
import PlataformaOnline.jacaranda.com.Tema;

public class Main {

	
	
	public static void main(String[] args) {
		
		Catalogo series = new Catalogo();
		try {
			series.annadirSerie("This is us", 2015, Tema.DRAMA);
			series.annadirSerie("Friends", 1990, Tema.COMEDIA);
			series.annadirSerie("Dallas", 1970, Tema.INTRIGA);
			series.annadirTemporada("This is us", "Empezamos");
			series.annadirTemporada("This is us", "Seguimos");
			series.annadirTemporada("This is us", "Finalizamos");
			//series.annadirCapituloTemporada("This is us", "Empezamos", "La familia");
			//series.annadirCapituloTemporada("This is us", "Empezamos", "El problema");
			//series.annadirCapituloTemporada("This is us", "Empezamos", "Los niños");
			//series.annadirCapituloTemporada("This is us", "Empezamos", "CAsi el final");
			//series.annadirCapituloTemporada("This is us", "Empezamos", "El final");
			
			
		} catch (SerieException e) {
			
			e.printStackTrace();
		}
		
		File ficheroSerie = new File ("c:\\Users\\crist\\MockExam\\FicheroSerie");
		File ficheroTemporada = new File ("c:\\Users\\crist\\MockExam\\FicheroTemporada");
		try {
			ficheroSerie.createNewFile();
			ficheroTemporada.createNewFile();
			
			FileWriter w = new FileWriter(ficheroSerie);
			PrintWriter p = new PrintWriter(w);
			
			p.print(series.listadoOrdenadoSeriesDeUnTema(Tema.CIENCIAFICCION));
			p.print(series.toString());
			
			p.close();
			w.close();
			
			FileReader re = new FileReader(ficheroSerie);
			BufferedReader b = new BufferedReader(re);
			
			String linea ="";
			
			while (linea!=null) {
				linea = b.readLine();
				System.out.println(linea);
			}
			
			
		} catch (IOException | SerieException e) {
			e.printStackTrace();
		}
		
		
		

	}
	
	
	
}

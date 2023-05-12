package main.java.json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import main.java.model.DatosLeidos;



public class JsonManager {

	public List<DatosLeidos> carcgarEstudiante(String path){
		List<DatosLeidos> datos = null;
		
		Gson gson= new GsonBuilder().create();
		
		try {
			System.out.println(new File(path).exists());
			DatosLeidos[] array = 
						gson.fromJson(new FileReader(new File(path)), DatosLeidos[].class);
			
			datos=List.of(array);
			
		} catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		return datos;
	}
	
	
	public void escribirColecccion(List<DatosLeidos> estudiantes, String destino) {
		
		File ficheroDestino = new File(destino);
		try {
			ficheroDestino.createNewFile();
			FileWriter writer = new FileWriter(ficheroDestino);
			
			Gson gson = new GsonBuilder().setPrettyPrinting().enableComplexMapKeySerialization().create();
			
			gson.toJson(estudiantes, writer);
			
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}

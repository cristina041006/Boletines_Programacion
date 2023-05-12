package main.java.xml.reader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import main.java.model.Clase;
import main.java.model.DatosLeidos;

public class LectorXML {
	
	public List<DatosLeidos> cargarDatos(String ruta) {
		List<DatosLeidos > casetas = new ArrayList<>();
		
		File fichero = new File(ruta);
		
		try {
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document documento = builder.parse(fichero);
			documento.getDocumentElement().normalize();
			
			
			System.out.println(documento.getDocumentElement().getNodeName());
			
			NodeList hijos = documento.getElementsByTagName("DatosLeidos");
			
			for (int i=0; i<hijos.getLength(); i++ ) {
				Element hijo = (Element) hijos.item(i);
				
				String titulo = hijo.getElementsByTagName("TITULO").item(0).getTextContent();
				String calle = hijo.getElementsByTagName("CALLE").item(0).getTextContent();
				int numero = Integer.valueOf(hijo.getElementsByTagName("NUMERO").item(0).getTextContent());
				Clase clase = Clase.valueOf(hijo.getElementsByTagName("CLASE").item(0).getTextContent());
				int id = Integer.valueOf(hijo.getElementsByTagName("ID").item(0).getTextContent());
				int id_calle = Integer.valueOf(hijo.getElementsByTagName("ID_CALLE").item(0).getTextContent());
				
				casetas.add(new DatosLeidos(titulo, calle, numero, clase, id, id_calle));
				
			}
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
		
		return casetas;
		
		
	}

}

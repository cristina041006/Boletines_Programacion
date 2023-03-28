package mockExam.ejercicio;

import java.util.Arrays;

public class MmoryStorage {
	
	private final static int NUM_MAXIMO_USUARIO = 15;
	private final static int NUM_MAXIMOS_PUBLICACIONES = 50;
	
	private int numUsuariosActuales;
	private int numPublicacionesActuales;
	
	private Usuario[] numUsuarios;
	private Publicacion[] numPublicaciones;
	

	public MmoryStorage() {
		super();
		numUsuarios= new Usuario[NUM_MAXIMO_USUARIO];
		numPublicaciones = new Publicacion[NUM_MAXIMOS_PUBLICACIONES];
	}
	
	private int posicionUsuario(String loging) {
		
		int posicion=-1;
		for (int i=0; i<numUsuarios.length && posicion==-1; i++) {
			if(this.numUsuarios[i]!=null && this.numUsuarios[i].getLogin().equals(loging)) {
				posicion=i;
			}
		}
		
		return 0; 
	}
	
	public void addUsuario(String login, String pass) {
		if(posicionUsuario(login)==-1) {
			this.numUsuarios[this.numUsuariosActuales++]= new Usuario(login, pass);
		}
		
	}
	
	public void addPublicacion(String texto, String login) throws PublicacionException {
		if(posicionUsuario(login)==-1) {
			Publicacion tweet = new Tweet(texto, this.numUsuarios[posicionUsuario(login)]);
		}
	}
	
	public void addPublicacion(String post, String tema, String usuario ) {
		//toDo
	}
	
	public void addPublicacion(String recomendacion, String usuario, int valoracion) {
		//toDo
	}
	
	public String mostrarListaPublicaciones() {
		Arrays.sort(this.numPublicaciones);
		return listarContenido(this.numPublicaciones);
	}
	
	public String mostrarTweets() {
		Arrays.sort(this.numPublicaciones);
		
		int tweet=0;
		for (Publicacion p: this.numPublicaciones) {
			if (p instanceof Tweet) {
				tweet++;
			}
		}
		Tweet[] tweets = new Tweet[tweet];
		int pos=0;
		for (Publicacion p: this.numPublicaciones) {
			tweets[pos++]= (Tweet) p;
		}
		
		return Arrays.toString(tweets);
	}
	
	public String mostrarPost() {
		return ""; //toDo
	}
	
	public String listarContenido(Publicacion[] pub) {
		return ""; //toDo
	}
	
	
}

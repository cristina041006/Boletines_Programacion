package Ejercicio1.cr;

public class Rectangulo {
	
	private double longitud;
	private double ancho;
	
	public Rectangulo () {
		super();
		this.ancho=1;
		this.longitud=1;
	}
	
	//Los por defecto se ponen en constructores vacios
	//el super llama al padre
	
	public Rectangulo (double longitud, double ancho) {
		this();
		setLongitud(longitud);
		setAncho(ancho);
		
	}
	//Llamas al set porq ya lo tienes validado, para no repetir codigo
	//El this llama a su constructor vacio

	public double perimetro() {
	
		double suma= (this.longitud*2)+(this.ancho*2);
		return suma;
	}
	
	//No necesita parametos de entrada proque vas a utilizar los atributos
	//Los this es para idnicar que la variable es local
	
	public double area() {
		double multiplicacion= this.longitud*this.ancho;
		return multiplicacion;
	}
	
	
	public double getLongitud() {
		return longitud;
	}


	public void setLongitud(double longitud) {
		if (longitud>0 && longitud<20) {
			this.longitud = longitud;
		}
		
	}
	
	//Lo validas


	public double getAncho() {
		return ancho;
	}


	public void setAncho(double ancho) {
		if (ancho>0 && ancho<20) {
			this.ancho = ancho;
		}
		
	}

	@Override
	public String toString() {
		return "El rectangulo tiene una longitud de " + longitud + " un ancho de " + ancho + " un perimetro de " + perimetro() + " y un area de "
				+ area() ;
	}
	
	
	
	

}

package Ejercicio1.cr;

import java.util.Objects;

public class Linea {
	
	Punto puntoA;
	Punto puntoB;
	
	public Linea() {
		super();
		puntoA= new Punto();
		puntoB= new Punto();
	}
	
	public Linea(Punto puntoA, Punto puntoB) {
		this();
		this.puntoA=puntoA;
		this.puntoB=puntoB;
	}
	

	public Punto getPuntoA() {
		return puntoA;
	}

	public void setPuntoA(Punto puntoA) {
		this.puntoA = puntoA;
	}

	public Punto getPuntoB() {
		return puntoB;
	}

	public void setPuntoB(Punto puntoB) {
		this.puntoB = puntoB;
	}

	
	public String toString() {
		return "[( " +puntoA + " )( "+ puntoB + " )]" ;
	}

	
	public boolean equals2(Object obj) {
		boolean sonIguales = this ==obj;
		if(!sonIguales && obj !=null && getClass() == obj.getClass() /* obj instanceof Complejo*/) {
			Linea other = (Linea) obj;
			sonIguales=Objects.equals(puntoA, other.puntoA) && Objects.equals(puntoB, other.puntoB);
		}
		return sonIguales;
		}
	
	public Linea moverDerecha(double distancia) {
		Linea l = new Linea (puntoA.moverDerecha(distancia), puntoB.moverDerecha(distancia));
		return l;
	}
	
	public Linea moverIzquierda(double distancia) {
		Linea l = new Linea (puntoA.moverIzquierda(distancia), puntoB.moverIzquierda(distancia));
		return l;
	}
	
	public Linea moverArriba(double distancia) {
		Linea l = new Linea (puntoA.moverArriba(distancia), puntoB.moverArriba(distancia));
		return l;
	}
	
	public Linea moverAbajo(double distancia) {
		Linea l = new Linea (puntoA.moverAbajo(distancia), puntoB.moverAbajo(distancia));
		return l;
	}
	
	

}

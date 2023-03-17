package Ejercicio4.cr;

import java.util.Objects;

public class Complejo {
	
	public double real;
	public double imag;
	
	public Complejo(){
		super();
		real=1;
		imag=1;
	}
	
	public Complejo(double real, double imag){
		this();
		this.real=real;
		this.imag=imag;
	}
	
	public Complejo sumar(Complejo complejo) {
		double suma = this.real+complejo.real;
		double suma2 = this.imag+complejo.imag;
		Complejo cj3=new Complejo(suma, suma2);
		return cj3;
	}
	
	public Complejo restar(Complejo complejo) {
		double resta = this.real-complejo.real;
		double resta2 = this.imag-complejo.imag;
		Complejo cj3=new Complejo(resta, resta2);
		return cj3;
	}

	public String toString() {
		return "El numero complejo es (" + real + "," + imag + "i)";
	}

	public boolean equals2(Object obj) {
		boolean sonIguales = this ==obj;
		if(!sonIguales && obj !=null && getClass() == obj.getClass() /* obj instanceof Complejo*/) {
			Complejo other = (Complejo) obj;
			sonIguales=this.real==other.real && this.imag==other.imag;
		}
		return sonIguales;
		}
	
	
	
	

}












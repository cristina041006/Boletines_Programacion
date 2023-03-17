package Ejercicio1.cr;

public class Punto {
	
	double x;
	double y;
	
	public Punto () {
		super();
		x=0;
		y=0;
	}
	
	public Punto (double x, double y) {
		this();
		this.x=x;
		this.y=y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public boolean equals2(Object obj) {
		boolean sonIguales = this ==obj;
		if(!sonIguales && obj !=null && getClass() == obj.getClass() /* obj instanceof Complejo*/) {
			Punto other = (Punto) obj;
			sonIguales=this.x==other.x && this.y==other.y;
		}
		return sonIguales;
		}
	
	
	public String toString() {
		return  x + " , " + y;
	}

	public Punto moverDerecha(double distancia) {
		Punto p = new Punto(this.x+=distancia, this.y);
		return p;
	}
	
	public Punto moverIzquierda(double distancia) {
		Punto p = new Punto(this.x-=distancia, this.y);
		return p;
	}
	
	public Punto moverArriba(double distancia) {
		Punto p = new Punto(this.x, this.y+=distancia);
		return p;
	}
	
	public Punto moverAbajo(double distancia) {
		Punto p = new Punto(this.x, this.y-=distancia);
		return p;
	}

}

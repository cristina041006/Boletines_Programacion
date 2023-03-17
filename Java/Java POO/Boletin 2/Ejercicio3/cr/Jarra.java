package Ejercicio3.cr;

public class Jarra {
	private double capacidad;
	private double cantidadAgua;
	private double totalAgua;
	
	public Jarra () {
		super();
		this.capacidad=0;
		this.cantidadAgua=0;
		
		
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public double getCantidadAgua() {
		return cantidadAgua;
	}

	public void setCantidadAgua(double cantidadAgua) {
		this.cantidadAgua = cantidadAgua;
	}

	public double getTotalAgua() {
		return totalAgua;
	}

	public void setTotalAgua(double totalAgua) {
		this.totalAgua = totalAgua;
	}
	
	
	public void llenarJarra() {
		this.cantidadAgua=this.capacidad;
		this.totalAgua+=this.cantidadAgua;
	}
	
	public void vaciarJarra() {
		this.cantidadAgua=0;
	}
	
	public void volcarJarra(Jarra jarra1) {
		if (jarra1.cantidadAgua<jarra1.capacidad && this.cantidadAgua!=0) {
			if (jarra1.cantidadAgua>=this.cantidadAgua) {
				double añadimos = jarra1.capacidad-jarra1.cantidadAgua;
				jarra1.cantidadAgua+=añadimos;
				double restante=this.cantidadAgua-añadimos;
				this.cantidadAgua=restante;
	
			}
	
		}else {
			System.out.println("No puedes volcar");
		}
	}
	
	

}

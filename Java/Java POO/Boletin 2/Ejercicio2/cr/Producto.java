package Ejercicio2.cr;

public class Producto {
	public int id;
	public String descripcion;
	public double precioSI;
	public static double iva;
	
	public Producto() {
		super();
		this.id=1;
		this.descripcion="Sin descripcion";
		this.precioSI=0;
		this.iva=0.2;
	}
	
	public Producto(String descripcion, double precio) {
		this();
		this.descripcion=descripcion;
		this.precioSI=precio;
		this.id++;
		
	}

	@Override
	public String toString() {
		return "El producto tiene una id " + id + ", su descripcion es " + descripcion + ", su precio sin IVA es " + precioSI + " y  su IVA de un " + iva;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioSI() {
		return precioSI;
	}

	public void setPrecioSI(double precioSI) {
		this.precioSI = precioSI;
	}

	public static double getIva() {
		return iva;
	}

	public static void setIva(double iva) {
		Producto.iva = iva;
	}
	
	public double calcularPrecioIva() {
		double precio = this.precioSI+(this.precioSI*this.iva);
		return precio;
	}
	
	
	

}

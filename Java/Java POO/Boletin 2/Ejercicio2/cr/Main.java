package Ejercicio2.cr;

public class Main {

	public static void main(String[] args) {
		Producto p=new Producto("Destornillador", 3);
		
		System.out.println(p);
		
		p.setPrecioSI(2);
		
		System.out.println(p);
		
		System.out.println(p.calcularPrecioIva());

	}

}

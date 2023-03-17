package Ejercicio3.cr;

public class Maquina {
	int depositoCafe;
	int depositoLeche;
	int depositoVasos;
	double monedero;
	
	public static final double PRECIOCAFE= 1;
	public static final double PRECIOLECHE= 0.8;
	public static final double PRECIOCAFECONLECHE= 1.5;
	
	public Maquina () {
		super();
		this.depositoCafe=50;
		this.depositoLeche=50;
		this.depositoVasos=80;
	}
	
	public void rellenar() {
		this.depositoCafe=50;
		this.depositoLeche=50;
		this.depositoVasos=80;
	}
	
	public void vaciarMonedero() {
		this.monedero=0;
	}


	public String toString() {
		return "Maquina tiene" + depositoCafe + " depositos de cafe," + depositoLeche + ", depositos de leche "
				+ depositoVasos + " depositos de vasos y el deposito del monedero es " + monedero + " euros ";
	}
	
	public String servirProducto (String opcion, double dinero) {
		String servido="";
		if (opcion.equalsIgnoreCase("Cafe") && depositoCafe != 0 && depositoVasos != 0) {
			if (dinero>PRECIOCAFE) {
				monedero+=dinero;
				double vuelta = dinero-PRECIOCAFE;
				if (monedero>=vuelta) {
					monedero-=vuelta;
					depositoCafe--;
					depositoVasos--;
					servido= "Recoge tu cambio de "+ vuelta+ "euros";
				}else {
					servido="Error no tenemos vuelta suficiente";
				}
				
			}else if(dinero==PRECIOCAFE) {
				monedero+=dinero;
				depositoCafe--;
				depositoVasos--;
				servido="Producto servido";
			}else {
				servido="Error dinero insuficiente";
			}
			
			
		}else if (opcion.equalsIgnoreCase("Leche") && depositoLeche != 0 && depositoVasos != 0) {
			if (dinero>PRECIOLECHE) {
				monedero+=dinero;
				double vuelta = dinero-PRECIOLECHE;
				if (monedero>vuelta) {
					monedero-=vuelta;
					depositoLeche--;
					depositoVasos--;
					servido= "Recoge tu cambio de "+ vuelta+ "euros";
				}else {
					servido="Error no tenemos vuelta suficiente";
				}
				
			}else if(dinero==PRECIOLECHE) {
				monedero+=dinero;
				depositoLeche--;
				depositoVasos--;
				servido="Producto servido";
			}else {
				servido="Error dinero insuficiente";
			}
		}else if (opcion.equalsIgnoreCase("Cafe con leche") && depositoLeche != 0 && depositoCafe != 0 && depositoVasos != 0) {
			if (dinero>PRECIOCAFECONLECHE) {
				monedero+=dinero;
				double vuelta = dinero-PRECIOCAFECONLECHE;
				if (monedero>vuelta) {
					monedero-=vuelta;
					depositoLeche--;
					depositoCafe--;
					depositoVasos--;
					servido= "Recoge tu cambio de "+ vuelta+ "euros";
				}else {
					servido="Error no tenemos vuelta suficiente";
				}
				
			}else if(dinero==PRECIOCAFECONLECHE) {
				monedero+=dinero;
				depositoLeche--;
				depositoCafe--;
				depositoVasos--;
				servido="Producto servido";
			}else {
				servido="Error dinero insuficiente";
			}
			
		}else {
			servido="Error la opcion es invalida o el deposito esta vacio";
		}
		
		return servido;
		
	}
	
	

}

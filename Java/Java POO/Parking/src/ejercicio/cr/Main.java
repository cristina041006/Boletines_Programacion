package ejercicio.cr;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Parking p = new Parking();
		
		//try {
			p.addCar(new Vehiculo("1234qwer", "Clio", "Renault", Combustible.GASOLINA, LocalDateTime.of(2007, 9, 10, 10, 3), TipoVehiculo.AUTOMOVIL));
		//} catch (Exception e) {
			//System.out.println("Dato erronero");
			//e.printStackTrace();
		//}
		
		//try {
			p.addCar(new Vehiculo("1256qyer", "Ibiza", "Seat", Combustible.ELECTRICO, LocalDateTime.of(2012, 8, 12, 12, 40), TipoVehiculo.AUTOMOVIL));
		//} catch (Exception e) {
			//System.out.println("Dato erronero");
			//e.printStackTrace();
		//}
			
		//try {
			p.addCar(new Vehiculo("1206qyer", "Cactus", "Renault", Combustible.ELECTRICO, LocalDateTime.of(2000, 9, 6, 3, 40), TipoVehiculo.TRANSPORTE_COLECTIVO));
		//} catch (Exception e) {
			//System.out.println("Dato erronero");
			//e.printStackTrace();
		//}	
		
				
		System.out.println(p);
		
		p.ordenarPorMarcaYmodelo();
		
		System.out.println("---------------------------");

		
		System.out.println(p);
		/*
		p.ordenarPorMatricula();
		
		System.out.println("---------------------------");
		
		System.out.println(p);
		
		p.ordenarPorTipoYcombustible();
		
		System.out.println("---------------------------");
		
		System.out.println(p);
		
		
		*/
		
	}

}

package ejercicio.cr;

import java.util.Arrays;

import ejercicio.cr.comparadores.compararMatricula;
import ejercicio.cr.comparadores.compararTipoCombustible;
import ejercicio.cr.comparadores.ordenarMarcaModelo;

public class Parking{
	
	private Vehiculo[] vehiculos;
	
	public Parking () {
		this.vehiculos= new Vehiculo [50];
	}
	
	public boolean addCar(Vehiculo vehiculo) {
		boolean metido=false;
		int contador=0;

		while(metido==false && contador<vehiculos.length) {
			if (vehiculos[contador]==null) {
				vehiculos[contador]=vehiculo;
				metido=true;
				
			}
			contador++;
		}
		
		return metido;
	}
	
	public boolean quitarCoche(Vehiculo vheiculo) {
		boolean metido=false;
		int contador=0;
		
		while (metido==false && contador<vehiculos.length) {
			if (vehiculos[contador].equals(vheiculo)) {
				vehiculos[contador]=null;
				metido=true;
			}
			contador++;
		}
		
		return metido;
		
		
	}
	
	
	@Override
	public String toString() {
		return Arrays.toString(vehiculos);
	}

	public String ordenarPorMarcaYmodelo() {
		Arrays.sort(this.vehiculos, new ordenarMarcaModelo());
		return arrayToString();
		
	}
	
	public String ordenarPorTipoYcombustible() {
		Arrays.sort(vehiculos, new compararTipoCombustible());
		return arrayToString();
	}
	
	public String ordenarPorMatricula() {
		Arrays.sort(vehiculos, new compararMatricula());
		return arrayToString();
	}
	
	
	public String arrayToString() {
		StringBuilder sb = new StringBuilder();
		
		for (Vehiculo v: vehiculos) {
			if(v!=null) {
				sb.append(v).append(System.lineSeparator());
			}
		}
		
		return sb.toString();
	}



}

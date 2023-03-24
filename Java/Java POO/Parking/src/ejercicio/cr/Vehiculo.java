package ejercicio.cr;

import java.time.LocalDateTime;
import java.util.Objects;

public class Vehiculo implements Comparable<Vehiculo>{
	private String marca;
	private String modelo;
	private String matricula;
	private Combustible combu;
	private LocalDateTime fechaEntrada;
	private TipoVehiculo tipo;
	
	public Vehiculo() {
		super();
	}
	
	public Vehiculo (String marca, String modelo, String matricula, Combustible combu, LocalDateTime fecha, TipoVehiculo tipo) /*throws Exception*/ {
		this();
		
		//if(comprobarMatricula(matricula)){
			this.matricula=marca;
		//}else {
			//throw new Exception ("Matricula no valido");
		//}
		this.marca=marca;
		this.modelo=modelo;
		this.combu=combu;
		this.fechaEntrada=fecha;
		this.tipo= tipo;
	}
	
	public boolean comprobarMatricula (String matricula) {
		boolean buena =false;
		int digito=0;
		
		if (matricula.length()==7) {
			for (int i=0; i<matricula.length(); i++) {
				if (Character.isDigit(matricula.charAt(i))) {
					digito++;
				}	
			}
		
		}
		
		if (digito==4) {
			buena=true;	
		}
		
		return buena;
	}

	@Override
	public int compareTo(Vehiculo o) {
		int resultado =0;
		if(this==o) {
			resultado=0;
		}else if (this.fechaEntrada.getYear() < o.fechaEntrada.getYear()) {
			resultado = 1;
		}else {
			resultado = -1;
		}
		return resultado;
	}
	

	@Override
	public boolean equals(Object obj) {
		boolean esIgual= this==obj;
		
		if(!esIgual && obj != null && getClass() == obj.getClass()) {
			Vehiculo other = (Vehiculo) obj;
			esIgual=Objects.equals(matricula, other.matricula);
		}
		return esIgual;
	}
	
	

	@Override
	public String toString() {
		return "Vehiculo " + marca + " " + modelo + ", matricula:" + matricula + ", de" + combu
				+ ", fechaEntrada:" + fechaEntrada + ", tipo" + tipo + "";
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public Combustible getCombu() {
		return combu;
	}

	public TipoVehiculo getTipo() {
		return tipo;
	}
	
	
	
	
	
	

}

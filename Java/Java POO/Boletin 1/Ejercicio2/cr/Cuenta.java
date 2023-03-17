package Ejercicio2.cr;

public class Cuenta {
	
	private double saldo;
	private int numeroIngresos;
	private int numeroRetiros;
	
	public Cuenta () {
		super();
		saldo=0;
		numeroIngresos=0;
		numeroRetiros=0;
	}
	
	
	public Cuenta (double saldo) {
		this();
		this.saldo=saldo;
	}
	
	
	public boolean reintegro(double retirar) {
		
		boolean retirado=false;
		
		if (retirar>0 && retirar<this.saldo) {
			this.saldo=saldo-retirar;
			this.numeroRetiros++;
			retirado=true;
		}
		 
		return retirado;
	}
	
	public boolean ingresar(double ingreso) {
		boolean ingresado=false;
		
		if (ingreso>0) {
			this.saldo=saldo+ingreso;
			this.numeroIngresos++;
			ingresado=true;
		}
		
		
		
		return ingresado; 
		
		
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public int getNumeroIngresos() {
		return numeroIngresos;
	}


	public void setNumeroIngresos(int numeroIngresos) {
		this.numeroIngresos = numeroIngresos;
	}


	public int getNumeroRetiros() {
		return numeroRetiros;
	}


	public void setNumeroRetiros(int numeroRetiros) {
		this.numeroRetiros = numeroRetiros;
	}


	@Override
	public String toString() {
		return "Cuenta [getSaldo()=" + getSaldo() + ", getNumeroIngresos()=" + getNumeroIngresos()
				+ ", getNumeroRetiros()=" + getNumeroRetiros() + "]";
	}
	
	
	
	
/* validar*/	

}

package Ejercicio2.cr;

import java.util.Scanner;

public class Principal {
	
	public static final String MENU= "\n 1. Hacer un reintrego \n 2. Hacer un ingreso \n 3. Consultar saldo y el nuemro de reintregos e ingresos"
			+ "\n 4. Finalizar las operaciones";

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Introduzca el saldo de la cuenta para crear una");
		double saldos=Integer.valueOf(sc.nextLine());
		Cuenta cuenta= new Cuenta(saldos);
		
		System.out.println(MENU);
		System.out.println("Elija su opcion: ");
		String opcion=sc.nextLine();
		
		while (!opcion.equals("4")){
			
			switch (opcion) {
			case "1":
				System.out.println("Cuanto quieres retirar: ");
				double ret=Double.valueOf(sc.nextLine());
				cuenta.reintegro(ret);
				break;
			case "2":
				System.out.println("Cuanto quieres ingresar: ");
				double ingres=Double.valueOf(sc.nextLine());
				cuenta.ingresar(ingres);
				break;
			case "3":
				System.out.println(cuenta);
				break;
				
			default:
				break;
			}
			
			System.out.println(MENU);
			System.out.println("Elija su opcion: ");
			opcion=sc.nextLine();
			
		}
		
		System.out.println("Su saldo es " + cuenta.getSaldo());
	

	}

}

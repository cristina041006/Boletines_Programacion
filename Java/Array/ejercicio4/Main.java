package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		
		System.out.println("Introduce el dia de la fecha: ");
		int dia = Integer.valueOf(sc.nextLine());
		
		System.out.println("Introduce el mes de la fecha: ");
		int mes= Integer.valueOf(sc.nextLine());
		
		System.out.println("Introduce el año de la fecha: ");
		int anio= Integer.valueOf(sc.nextLine());
		
		
		Fecha fecha =new Fecha(dia, mes, anio);
		
		if (comprobacion(fecha)==true) {
			System.out.println(fecha.pasarAformatoLargo());
		}else {
			System.out.println("Fecha incorrecta");
		}
		
		

	}
	
	
	public static int diaDeUnMes (int mes, int anio) {
		int diaBisiesto =28;
		if (bisiesto(anio)==true) {
			diaBisiesto=29;
		}
		
		int[] dias = {31, diaBisiesto, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		return dias[mes-1];
	}
	
	public static boolean bisiesto (int anio) {
		boolean bisiesto =false;
		if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
			bisiesto=true;
		}
		return bisiesto;	
	}
	
	public static boolean comprobacion (Fecha fecha) {
		boolean esCorrecto=false;
		
		if ((fecha.dia<=diaDeUnMes(fecha.mes, fecha.anio) && fecha.dia>=1) && (fecha.mes<=12 && fecha.mes>=1)) {
			esCorrecto=true;
		}
		
		
		return esCorrecto;
	}

}

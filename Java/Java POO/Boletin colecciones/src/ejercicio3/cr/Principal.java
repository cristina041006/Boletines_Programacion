package ejercicio3.cr;

import ejercicio2.cr.Alumno;

public class Principal {

	public static void main(String[] args) {
		
		Equipo e = new Equipo("Betis");
		Alumno a1 = new Alumno("Ramos", "12345678");
		Alumno a2 = new Alumno("Var", "12345678");
		
		try {
			e.addAlumno(a1);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		try {
			e.addAlumno(3);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		System.out.println(e.mostrar());
		
		

	}

}

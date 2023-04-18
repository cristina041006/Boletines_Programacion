package ejercicio2.cr;

public class Principal {

	public static void main(String[] args) {
		
		Equipo sevilla =  new Equipo("Sevilla");
		Alumno a1 = new Alumno("Ramos", "12345678");
		Alumno a2 = new Alumno("Var", "12345678");
		
		try {
			sevilla.addAlumno(a1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(sevilla.mostrar());
		
		try {
			sevilla.addAlumno(a2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(sevilla.mostrar());
		
		try {
			sevilla.borrarAlumno(a2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(sevilla.mostrar());
		
		System.out.println(sevilla.pertenece(a1));
		System.out.println(sevilla.pertenece(a2));

	}

}

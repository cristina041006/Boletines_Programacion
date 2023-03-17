package ejercicio4;

public class Fecha {
	public int dia;
	public int mes;
	public int anio;
	
	public Fecha (int dia, int mes, int anio) {
		super();
		this.dia=dia;
		this.mes=mes;
		this.anio=anio;
	}
	
	public String pasarAformatoLargo () {
		return "La fehca en formato lagor es " + dia+ " de " + mesEnPalabras(mes) + " de " + anio;
	}
	
	private static String mesEnPalabras(int mes) {
		String[] meses = {"Enero", "Febrero", "Mazo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		
		return meses[mes-1];
	}

}

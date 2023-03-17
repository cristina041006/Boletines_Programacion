package Ejercicio4.cr;

public class Main {

	public static void main(String[] args) {
		
		Complejo cj=new Complejo(5, 5);
		Complejo cj2=new Complejo(5, 5);
		
		System.out.println(cj);
		System.out.println(cj);
		Complejo cj3=cj.sumar(cj2);
		System.out.println(cj3);
		System.out.println(cj.equals2(cj2));

	}

}

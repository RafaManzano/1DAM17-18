package Clases;

import Excepciones.excepcionFicha;

public class testFicha implements Cloneable  {

	public static void main(String[] args) {
		Ficha f1 = new Ficha ();
		Ficha f2 = new Ficha ("rojo");
		Ficha f3 = new Ficha ("Verde");
		Ficha f4 = new Ficha ("azul");

		
		System.out.println(f4.getColor());
		System.out.println(f1.getColor());
		
		try {
		f4.setColor("verde");
		}
		catch(excepcionFicha error) {
			System.out.println("El color tiene que ser rojo o azul (todo en minuscula)");
		}
		
		System.out.println(f2.toString());
		System.out.println(f3.hashCode());
		
		Ficha f10 = f2.clone();
		System.out.println(f10.equals(f3));
		System.out.println(f10.equals(f2));
			
	}
}

package Clases;

import Excepciones.excepcionFicha;

public class testJugador {

	public static void main(String[] args) {
		
		Jugador j1 = new Jugador ("Rafa", "azul");
		Jugador j2 = new Jugador ("Oscar", "morao");
		Jugador j3 = new Jugador ();
		Jugador j4 = new Jugador ("Yeray", "rojo");
		
		System.out.println(j1.getNombre());
		System.out.println(j3.getNombre());
		j3.setNombre("NoNull");
		System.out.println(j3.getNombre());
		
		try {
		j2.setFichaColor("amarillo");
		}
		catch(excepcionFicha error) {
			System.out.println("El color tiene que ser azul o rojo (En minuscula todo)");
		}
		
		System.out.println(j2.getFichaColor());
		
		System.out.println(j4.toString());
		
		System.out.println(j2.hashCode());
		System.out.println(j1.hashCode());
		
		Jugador j5 = j4.clone();
		Jugador j6 = j4.deepClone();
		
		System.out.println(j5.equals(j6));
		System.out.println(j2.equals(j6));
		
		
	}

}

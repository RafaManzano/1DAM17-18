package test;

import clase.Jugador;

public class testJugador {
	

	public static void main(String[] args) {
	Jugador j1 = new Jugador ("MariCarmen", 3);
	Jugador j2 = new Jugador ("Rafael", 1);
	Jugador j3 = new Jugador ();
	
	System.out.println(j1.getNombre());
	System.out.println(j3.getNombre());
	
	j3.setNombre("Raimundo");
	j2.setPuntuacion(2);
	
	System.out.println(j3.getNombre());
	
	System.out.println(j2.toString());
	System.out.println(j3.toString());
	
	System.out.println(j1.hashCode());
	System.out.println(j3.hashCode());
	
	
	
	System.out.println(j1.equals(j3));
	
	}
}

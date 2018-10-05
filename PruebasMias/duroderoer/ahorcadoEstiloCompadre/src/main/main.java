package main;

import java.util.*;
import clase.Jugador;
import funcionalidades.funcionalidadesAhorcado;

public class main {

	public static void main(String[] args) {
		String nombre;
		String palabraelegida;
		String pista;
		int turno = 0;
		int numeroErrores = 6;
		char abecedario [] = funcionalidadesAhorcado.generaCaracteres();
		Scanner teclado = new Scanner (System.in);
		Jugador j1 = new Jugador ();
		Jugador j2 = new Jugador ();
		
		//Escribir nombres
		System.out.println("Escribe el nombre del primer jugador");
		nombre = teclado.next();
		j1.setNombre(nombre);
		System.out.println(j1.getNombre());
		
		System.out.println("Escribe el nombre del segundo jugador");
		nombre = teclado.next();
		j2.setNombre(nombre);
		System.out.println(j2.getNombre());
		
		while(j1.getPuntuacion() == 3 || j2.getPuntuacion() == 3) {
			
			do {
		palabraelegida = funcionalidadesAhorcado.pedirString(teclado, "Escribe una palabra con solo caracteres y sin espacios " + j1.getNombre());
		
				if (funcionalidadesAhorcado.comprobarAlfabeto(palabraelegida)) {
					System.out.println("Error, elige una palabra con solo caracteres y sin espacios");
				}
			}
			while (funcionalidadesAhorcado.comprobarAlfabeto(palabraelegida));
			
			pista = funcionalidadesAhorcado.pedirString(teclado, "Escribe una pista " + j1.getNombre());
		}
		
	}


	

}

package Main;

/*
 * Comentario: Es el tres en raya donde se podra jugar contra otro jugador
 * 
 * Entrada: Respuesta de la pregunta si quiere seguir jugando
 * 
 * Salida: Mensajes de comunicacion con el usuario
 * 		   Resultado de las partidas
 * 
 * Requisitos: La respuesta es s o n
 * 
 *	PG
 *	Inicio
 *		Escribir Nombre Jugadores
 *		Repetir
 *			Realizar Partida
 *		Mientras quiera seguir jugando
 *	Fin
 *
 *	PG Realizar Partida
 *	Inicio
 *		Repetir
 *			Si (la casilla esta vacia) 
	 			Tirada J1
	 			Introducir Tirada
	 			Comprobar Ganador
	 			Imprimir Tablero
	 		FinSi
	 		
	 		Si (la casilla esta vacia) 
	 			Tirada J2
	 			Comprobar Casilla
				Introducir Tirada
	 			Comprobar Ganador
	 			Imprimir Tablero
	 		FinSi
	 	Mientras no haya ganado nadie o no haya casillas vacias
	Fin
 *			
 */
import java.util.Scanner;

import Clases.Jugador;
import Funcionalidades3raya.gestor;
public class MainEstiloCompadre {

	public static void main(String[] args) {
		char respuesta = ' ';
		Jugador J1 = new Jugador ();
		Jugador J2 = new Jugador ();
		Scanner teclado = new Scanner (System.in);
		String [][] array = gestor.generarArray();
		
		
		//Escribir Nombre Jugadores
		System.out.println("Escribe el nombre del jugador 1");
		J1.setNombre(teclado.next());
		System.out.println("Muy bien, " + J1.getNombre() + " es un nombre muy bonito");
		System.out.println("Escribe el nombre del jugador 2");
		J2.setNombre(teclado.next());
		System.out.println("Muy bien, " + J2.getNombre() + " es un nombre muy bonito");
		
		do {
			System.out.println("Quieres jugar con estos jugadores? (S/N)");
			respuesta = teclado.next().charAt(0);
		}
		while (respuesta != 's' && respuesta != 'n' && respuesta != 'S' && respuesta != 'N');
		
		while(respuesta == 's' || respuesta == 'S') {
			System.out.println("Muy bien, empezamos la partida");
			System.out.println("Estamos preparando el tablero, Disculpe las molestias");
			gestor.generarArray();
			gestor.imprimirTablero(array);
			System.out.println("Gracias por la espera.");
			
			
			for(int i = 0; i < 2; i++) {
					
						//Tirada J1
						System.out.println("Su turno " + J1.getNombre());
						gestor.IntroducirTiradaJ1(array);
						
						
						/*
						 	do {
							util.IntroducirTiradaJ1(array);
							}
							while(util.ComprobarCasillaOcupada(array) == true);
						*/
						
						//Imprimir Tablero
						gestor.imprimirTablero(array);
					
				
				
						//Tirada J2
						System.out.println("Su turno " + J2.getNombre());
						
						gestor.IntroducirTiradaJ2(array);
						/*
						do {
						util.IntroducirTiradaJ2(array);
						}
						while(util.ComprobarCasillaOcupada(array) == true);
						*/
						
						//Imprimir Tablero
						gestor.imprimirTablero(array);
					
			}
			
			//Despues de los 2 tiradas que no llegan a ganar vienen todas las demas
			// La comprobacion corre a cargo de un 2 que he puesto en ComprobarGanador y despues las distintas
			//opciones de ganar la partida
			
			while(gestor.ComprobarGanador(array) == 2) {
				if (gestor.ComprobarGanador(array) == 2) {
				//Tirada J1
				System.out.println("Su turno " + J1.getNombre());
				gestor.IntroducirTiradaJ1(array);
				
				
				/*
				 	do {
					util.IntroducirTiradaJ1(array);
					}
					while(util.ComprobarCasillaOcupada(array) == true);
				*/
				
				//Imprimir Tablero
				gestor.imprimirTablero(array);
				
				//Comprobar Ganador
				gestor.ComprobarGanador(array);
				}
				
				if (gestor.ComprobarGanador(array) == 2) {
				//Tirada J2
				System.out.println("Su turno " + J2.getNombre());
				
				gestor.IntroducirTiradaJ2(array);
				/*
				do {
				util.IntroducirTiradaJ2(array);
				}
				while(util.ComprobarCasillaOcupada(array) == true);
				*/
				
				//Imprimir Tablero
				gestor.imprimirTablero(array);
				
				//Comprobar Ganador
				gestor.ComprobarGanador(array);
				}
			}
			
			
			if (gestor.ComprobarGanador(array) == 0 ) {
				System.out.println("La partida ha quedado en tablas");
			}
			else if (gestor.ComprobarGanador(array) == 1) {
				System.out.println("El ganador de la partida es " + J1.getNombre());
			}
				else {
					System.out.println("El ganador de la partida es " + J2.getNombre());
				}
				
				
			do {
				System.out.println("Quieres jugar otra partida (S/N)");
				respuesta = teclado.next().charAt(0);
			}
			while (respuesta != 's' && respuesta != 'n' && respuesta != 'S' && respuesta != 'N');
					
					
					
				
			
			
			
		}
		

	}

}


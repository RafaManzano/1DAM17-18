package Funcionalidades3raya;

import java.util.Scanner;

import Clases.Jugador;

public class gestor {
	
	/*
	 * Interfaz
	 * Nombre: GenerarArray
	 * Comentario: Generar el array con corchetes vacios
	 * Cabecera: void GenerarArray ();
	 * PostCondiciones: Solo genera el array con caracteres nulo
	 * 
	 */
	public static String[][] generarArray () {
		String [][] array = new String [3][3];
		
		 for (int i = 0; i < array.length; i++) {
		        for (int j = 0; j < array[i].length; j++) {
		        	array[i][j] = "[ ]";
		        }
		    }
		 return array;
		}
	
	/*
	 * Interfaz
	 * Nombre: imprimirTablero
	 * Comentario: Imprimimos el tablero 
	 * Cabecera: void ImprimirTablero (String [][] array)
	 * Entrada: Un array
	 */
	
	public static void imprimirTablero (String [][] array) {
		System.out.println(array [0][0] + " " + array[0][1] + " " + array[0][2]);
		System.out.println(array [1][0] + " " + array[1][1] + " " + array[1][2]);
		System.out.println(array [2][0] + " " + array[2][1] + " " + array[2][2]);
	}
	
	/*
	 * Interfaz
	 * Nombre: IntroducirTiradaJ1
	 * Comentario: El jugador pone su ficha en el tablero
	 * Cabecera: void IntroducirTirada (String [][] array)
	 * Entrada: El array
	 * 
	 */
	
	public static void IntroducirTiradaJ1 (String [][] array) {
		 int i = 0;
		 int j = 0;
		 Jugador j1 = new Jugador ();
		 Scanner teclado = new Scanner (System.in);
		 System.out.println("Elija su tirada");
		 do {		 
			 System.out.println("Posicion i: ");
			 i = teclado.nextInt();
			 System.out.println("Posicion j: ");
			 j = teclado.nextInt();
			 
		 }
		 while((i < 0 || i > 2) && (j < 0 || i > 2));
		
		 array[i][j] = "[X]";
	}
	
	/*
	 * Interfaz
	 * Nombre: IntroducirTiradaJ2
	 * Comentario: El jugador pone su ficha en el tablero
	 * Cabecera: void IntroducirTirada (String [][] array)
	 * Entrada: El array
	 * 
	 */
	
	public static void IntroducirTiradaJ2 (String [][] array) {
		 int i = 0;
		 int j = 0;
		 Jugador j2 = new Jugador ();
		 Scanner teclado = new Scanner (System.in);
		 System.out.println("Elija su tirada");
		 do {		 
			 System.out.println("Posicion i: ");
			 i = teclado.nextInt();
			 System.out.println("Posicion j: ");
			 j = teclado.nextInt();
			 
		 }
		 while((i < 0 || i > 2) && (j < 0 || i > 2));
		 array[i][j] = "[O]";
		
			
		}
	
	
	/*
	 * Interfaz
	 * Nombre: ComprobarCasillaVacia
	 * Comentario: Comprobar si la casilla esta vacia
	 * Cabecera: boolean ComprobarCasillaVacia (String [][] array)
	 * Entrada: El array
	 * Salida: Un boolean
	 * Postcondiciones: Un boolean asociado al nombre, el boolean sera verdadero o falso 
	 */
	
	public static boolean ComprobarCasillaVacia (String [][] array) {
		boolean resultado = false;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(array [i][j] == "[ ]") {
					resultado = true;
				}
			}
		}
		return resultado;
	}
	
	/*
	 * Interfaz
	 * Nombre: ComprobarGanador
	 * Comentario: Comprobamos si ha ganado la partida
	 * Cabecera: String ComprobarGanador (String [][] array)
	 * Entrada: Un array 
	 * Salida: Un int asociado al nombre, con el ganador de la partida
	 * Postcondiciones: El resultado asociado al nombre con el jugador que ha ganado
	 */
	
	public static int ComprobarGanador (String [][] array) {
		int res = 2; 
		if ((array [0][0] == "[X]" && array [1][0] == "[X]" && array [2][0] == "[X]") || 
		   (array [0][0] == "[X]" && array [0][1] == "[X]" && array [0][2] == "[X]") ||
		   (array [1][0] == "[X]" && array [1][1] == "[X]" && array [1][2] == "[X]") ||
		   (array [2][0] == "[X]" && array [2][1] == "[X]" && array [2][2] == "[X]") ||
		   (array [0][1] == "[X]" && array [1][1] == "[X]" && array [2][1] == "[X]") ||
		   (array [0][2] == "[X]" && array [1][2] == "[X]" && array [2][2] == "[X]") ||
		   (array [0][0] == "[X]" && array [1][1] == "[X]" && array [2][2] == "[X]") ||
		   (array [0][2] == "[X]" && array [1][1] == "[X]" && array [2][0] == "[X]"))  {
		   
		   res = 1;
		}
		
		else if ((array [0][0] == "[O]" && array [1][0] == "[O]" && array [2][0] == "[O]") || 
				   (array [0][0] == "[O]" && array [0][1] == "[O]" && array [0][2] == "[O]") ||
				   (array [1][0] == "[O]" && array [1][1] == "[O]" && array [1][2] == "[O]") ||
				   (array [2][0] == "[O]" && array [2][1] == "[O]" && array [2][2] == "[O]") ||
				   (array [0][1] == "[O]" && array [1][1] == "[O]" && array [2][1] == "[O]") ||
				   (array [0][2] == "[O]" && array [1][2] == "[O]" && array [2][2] == "[O]") ||
				   (array [0][0] == "[O]" && array [1][1] == "[O]" && array [2][2] == "[O]") ||
				   (array [0][2] == "[O]" && array [1][1] == "[O]" && array [2][0] == "[O]"))  {
				   
					res = -1;
			}
		else if (gestor.ComprobarCasillaVacia(array) == false) {
			res = 0;
		}
					  
		return res;
	}
	
	
	/*
	 * Interfaz
	 * Nombre: ComprobarCasillaOcupada
	 * Comentario: Comprobar si la casilla esta ocupada
	 * Cabecera: boolean ComprobarCasillaVacia (String [][] array)
	 * Entrada: El array
	 * Salida: Un boolean
	 * Postcondiciones: Un boolean asociado al nombre, el boolean sera verdadero o falso 
	 */
	
	public static boolean ComprobarCasillaOcupada (String [][] array) {
		int i = 0;
		int j = 0;
		boolean resultado = false;
				if(array [i][j] == "[X]" || array[i][j] == "[O]") {
					resultado = true;
				}
				return resultado;
	}
}



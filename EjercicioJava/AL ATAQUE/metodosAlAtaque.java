 /*
 * Nombre: metodosAlAtaque
 * Breve Comentario: Aqui se realizaran todos los subprogramas
 * 
 * MT 
* 	Necesidades: No hay
* 	Devoluciones: No hay
* 	Nec/Dev: No hay
* 	Requisitos: No hay
* 
* Interfaz
* 	Nombre: PresentarMenu
* 	Comentario: Pinta el menu del juego
* 	Cabecera: void PresentarMenu ()
* 	Precondiciones: No hay
* 	Entrada: No hay
*	Salida: No hay
* 	E/S: No hay
* 	Postcondiciones: No hay
 */
import java.util.*;
public class metodosAlAtaque {
	 public static void PresentarMenu () {
		 System.out.println("Elija una de las siguientes opciones");
		 System.out.println("1. Un Jugador");
		 System.out.println("2. Multijugador");
		 System.out.println("3. Explicacion del juego");
		 System.out.println("0. Salir ");
	 }
	 
/* ArrayTipos
* 	Nombre: CargarArray
* 	Comentario: Cargar de valores de los tipos
* 	Cabecera: String [] CargarArray ()
* 	Precondiciones: No hay
* 	Entrada: No hay
*	Salida: Un tipo (String)
* 	E/S: No hay
* 	Postcondiciones: El tipo (String) asociando al nombre
*/

	public static String [] CargarArray () {
		String [] arraytipo = new String [7];
		arraytipo [0] = "Agua";
		arraytipo [1] = "Fuego";
		arraytipo [2] = "Tierra";
		arraytipo [3] = "Aire";
		arraytipo [4] = "Electrico";
		arraytipo [5] = "Hielo";
		arraytipo [6] = "Oscuridad";
		return arraytipo;
	}
	
/*
 * generarNumeroTi
* 	Nombre: generarNumeroTi
* 	Comentario: Genera un numero aleatorio de los tipos
* 	Cabecera: int generarNumeroTi () ;
* 	Precondiciones: No hay
* 	Entrada: No hay
*	Salida: Un numero para un tipo (int)
* 	E/S: No hay
* 	Postcondiciones: El numero aleatorio asociando al nombre 
*/

	public static int generarNumeroTi () {
		Random random = new Random () ;
		int numero = random.nextInt(7);
		return numero;
	}
	
/*
 * cargadoArrayAleatorioTipos
* 	Nombre: cargadoArrayAleatorioTipos
* 	Comentario: Se usa para elegir un tipo para cada jugador
* 	Cabecera: String cargadoArrayAleatorioTipos();
* 	Precondiciones: No hay
* 	Entrada: No hay
*	Salida: Un string
* 	E/S: No hay
* 	Postcondiciones: Se devuelve el tipo del jugador asociado al nombre
*/

	public static String cargadoArrayAleatorioTipos(){
		
		String[] arrayString = CargarArray();
		int numeroRandom = generarNumeroTi();
		String tipo = arrayString [numeroRandom];
		return tipo;	
	}
	
/*
 * GenerarNombre
 * 	Nombre: GenerarNombre
* 	Comentario: Generar de valores de los tipos
* 	Cabecera: String [] GenerarNombre ();
* 	Precondiciones: No hay
* 	Entrada: No hay
*	Salida: Un tipo (String)
* 	E/S: No hay
* 	Postcondiciones: El tipo (String) asociando al nombre
*/

	public static String [] GenerarNombre () {
		String [] arraynombre = new String [10];
		arraynombre [0] = "Eiliril";
		arraynombre [1] = "Farth";
		arraynombre [2] = "Bowyn";
		arraynombre [3] = "Frendil";
		arraynombre [4] = "Beorion";
		arraynombre [5] = "Laghta";
		arraynombre [6] = "Sinnosgas";
		arraynombre [7] = "Indog";
		arraynombre [8] = "Saethrost";
		arraynombre [9] = "Theomil";
		return arraynombre;
	}
	
	/*
* 
generarNumeroNom
* 	Nombre: generarNumeroNom
* 	Comentario: Genera un numero aleatorio de los nombres
* 	Cabecera: int generarNumeroNom () ;
* 	Precondiciones: No hay
* 	Entrada: No hay
*	Salida: Un numero para un tipo (int)
* 	E/S: No hay
* 	Postcondiciones: El numero aleatorio asociando al nombre 
*/

	public static int generarNumeroNom () {
		Random random = new Random () ;
		int numero = random.nextInt(10);
		return numero;
	}
	
/*cargadoArrayAleatorioNombre
* 	Nombre: cargadoArrayAleatorioNombre
* 	Comentario: Se usa para elegir un tipo para cada jugador
* 	Cabecera: String cargadoArrayAleatorioNombre();
* 	Precondiciones: No hay
* 	Entrada: No hay
*	Salida: Un string
* 	E/S: No hay
* 	Postcondiciones: Se devuelve el tipo del jugador asociado al nombre
*/

	public static String cargadoArrayAleatorioNombre(){
		
		String[] arrayString = GenerarNombre();
		int numeroRandom = generarNumeroNom();
		String tipo = arrayString [numeroRandom];
		return tipo;	
	}
	
/*
 * generarNumeroPT
* 	Nombre: generarNumeroPT
* 	Comentario: Genera un numero aleatorio para usar en las estadisticas
* 	Cabecera: int generarNumeroPT () ;
* 	Precondiciones: No hay
* 	Entrada: No hay
*	Salida: Un numero para un tipo (int)
* 	E/S: No hay
* 	Postcondiciones: El numero aleatorio asociando al nombre 
*/

	public static int generarNumeroPT () {
		Random random = new Random () ;
		int numero = random.nextInt(10)+5;
		return numero;
	}

/*
 * generarNumeroVida
* 	Nombre: generarNumeroVida
* 	Comentario: Genera un numero aleatorio para usar en las estadisticas
* 	Cabecera: int generarNumeroVida () ;
* 	Precondiciones: No hay
* 	Entrada: No hay
*	Salida: Un numero para un tipo (int)
* 	E/S: No hay
* 	Postcondiciones: El numero aleatorio asociando al nombre 
*/

	public static int generarNumeroVida () {
		Random random = new Random () ;
		int numero = random.nextInt(20)+50;
		return numero;
	}
	
/*	
* Interfaz
* 	Nombre: PresentarMenuCombate
* 	Comentario: Pinta el menu del combate
* 	Cabecera: void PresentarMenuCombate ()
* 	Precondiciones: No hay
* 	Entrada: No hay
*	Salida: No hay
* 	E/S: No hay
* 	Postcondiciones: No hay
 */

	 public static void PresentarMenuCombate () {
		 System.out.println("Elija el movimiento");
		 System.out.println("1. Atacar");
		 System.out.println("2. Defender");
		 System.out.println("3. Esquivar");
	 }
	 
	 


}
	

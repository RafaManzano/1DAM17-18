package Gestor;

public class Gestor {

	/*
	 * Interfaz. Modo burbuja
	 * 	Nombre: Burbuja
	 * 	Comentario: Ordenacion ascendente de un array unidimensional de tamaño array.length
	 * 	Cabecera: void burbuja (int [] array)
	 * 	Precondiciones: El array no debe estar vacio
	 * 	Entrada: Un array
	 * 	Salida: El mismo array modificado
	 * 	Postcondiciones: Estan ordenados segun el criterio de ordenacion establecido
	 */
	public static void burbuja (int [] array) {
		int aux = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = array.length - 1; j > i; j--) {
				if (array [j] < array [j - 1]) {
					
					//Intercambio de elementos
					aux = array [j];
					array [j] = array [j - 1];
					array [j - 1] = aux;
				}
					
			}	
		}
	}
	
	/*
	 * Interfaz imprimirArray
	 * 	Nombre: imprimirArray
	 * 	Comentario: Para imprimir el array por completo
	 * 	Cabecera: void imprimirArray (int[] array)
	 * 	Precondiciones: El array no debe ser null
	 * 	Entrada: el array
	 * 	Postcondiciones: pintar todas las posiciones del array
	 */
	public static void imprimirArray(int [] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array [i]);
		}
	}
	
	/*
	 * Interfaz. Modo Seleccion directa
	 * 	Nombre: Seleccion directa
	 * 	Comentario: Ordenacion ascendente de un array unidimensional de tamaño array.length
	 * 	Cabecera: void seleccionDirecta (int [] array)
	 * 	Precondiciones: El array no debe estar vacio
	 * 	Entrada: Un array
	 */
	
	public static void seleccionDirecta (int [] array) {
		int minimo = 0;
		int aux = 0;
		for (int i = 0; i < array.length; i++) {
			minimo = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array [minimo]) {
					minimo = j;
				}
			}
			
			//intercambio para poner en su lugar el mas pequeño
			aux = array [i];
			array [i] = array [minimo];
			array [minimo] = aux;
		}
	}
	
	
	
	/*
	 * Interfaz QuickSort
	 * 	Nombre:	Rapido
	 * 	Comentario: Metodo rapido de ordenacion ascendente para ordenar un array, desde la primera casilla
	 * 		hasta la ultima, siendo puntoParticion la casilla por la casilla por la que se divide el array
	 * 	Cabecera: void rapido (entero lista [], primero, ultimo)
	 * 	Precondiciones: El array  no debe estar vacio
	 * 	Entrada: Un array, indice del primero al ultimo elemento
	*/
	 
	
	public static void rapido (int array [], int primero, int ultimo) {
		int puntoParticion;
		if (primero < ultimo) {
			puntoParticion = Gestor.partir(array, primero, ultimo);
					
			Gestor.rapido(array, primero, puntoParticion - 1);
			Gestor.rapido(array, puntoParticion + 1, ultimo);
		}
	}
	
 /*
	 * Interfaz QuickSort
	 * 	Nombre: partir
	 * 	Comentario: Reordenar el array de manera que se coloquen delante de ese valor todos los elementos
	 * 		del array que son menores o iguales a dicho valor de particion
	 *  Cabecera: int partir (entero array [], indice de la primera, indice de la ultima)
	 *  Precondiciones: El array no debe estar vacio
	 *  Entrada: Un array, el indice de la primera y de la ultima casilla
	 *  Salida: El array cambiado y el punto por donde se ha partido el array
	 *  Postcondiciones: Asociado al nombre del subprograma se devuelve el lugar por el que se divide el array
	 *  
	 */

	public static int partir (int [] array, int ppio, int fin) {
		int valorParticion;
		int aux;
		int i;
		int j;
		
		valorParticion = array [ppio];
		
		for (i = ppio + 1, j = fin; i < j;) { 
			for(;((array[i] <= valorParticion) && (i < j)) ; i++) { 
				
			}
			for (; ((array [j] > valorParticion) && (i < j)); j--) { 
				
			}
			aux = array [i];
			array [i] = array [j];
			array [j] = aux;
		}
		if (valorParticion <= array [i]) {
			i = i - 1;
		}
		array [ppio] = array [i];
		array [i] = valorParticion;
		return i;
		}

}

	
	


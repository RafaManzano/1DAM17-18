package Ejercicio_3;

public class Ejercicio_3 {

	public static void main(String[] args) {
		
		String [] cadenas = {"Fernando", "Pepe", "Alejandro", "Alfredo", "Eufrasio"};
		
		gestoraEjercicio_3.ordenacionQuicksort(cadenas, 0, cadenas.length-1);
		
		System.out.println("Orden alfabetico");
		
		for(int i = 0; i < cadenas.length; i++) {
			System.out.println(cadenas[i]);
		}
		
		System.out.println("");
		
		gestoraEjercicio_3.ordenacionQuicksortInverso(cadenas, 0, cadenas.length-1);
		
		System.out.println("Orden alfabetico inverso");
		
		for(int i = 0; i < cadenas.length; i++) {
			System.out.println(cadenas[i]);
		}
	}

}

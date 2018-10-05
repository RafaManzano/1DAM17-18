package Ejercicio_4;


public class Ejercicio_4 {

	public static void main(String[] args) {

		int [] numeros = {5,6,2,10,1};
		
		gestoraEjercicio_4.ordenacionQuicksort(numeros, 0, numeros.length-1);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros [i]);
		}
		
		System.out.println("El numero 5 esta en la posicion " + gestoraEjercicio_4.buscarBin (numeros, 5));

	}

}

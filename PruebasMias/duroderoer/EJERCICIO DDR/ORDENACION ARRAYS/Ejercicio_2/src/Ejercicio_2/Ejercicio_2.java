package Ejercicio_2;


public class Ejercicio_2 {

	public static void main(String[] args) {
		
	int [] numeros  = {5,6,2,10,1};
		
	gestoraEjercicio_2.ordenacionQuicksort(numeros, 0, numeros.length-1);
	
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
}



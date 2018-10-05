package Ejercicio_2;

public class gestoraEjercicio_2 {
	
	public static void ordenacionQuicksort (int array[], int izq, int der) {
		int i = izq;
		int j = der;
		int pivote = array [(i+j) / 2];
		
		do {
			while (array [i] < pivote) {
				i++;
			}
			
			while (array [j] > pivote) {
				j--;
			}
			
			if (i <= j) {
				int aux = array[i];
				array [i] = array [j];
				array [j] = aux;
				i++;
				j--;
				
			}
		}
		while (i <= j);
		
		if (izq < j) {
			ordenacionQuicksort (array, izq, j);
		}
		
		if (i < der) {
			ordenacionQuicksort(array ,i ,der);
		}
	}
	
}

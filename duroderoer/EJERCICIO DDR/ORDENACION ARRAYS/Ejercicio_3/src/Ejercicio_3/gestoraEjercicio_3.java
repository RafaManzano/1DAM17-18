package Ejercicio_3;

public class gestoraEjercicio_3 {
	
	public static void ordenacionQuicksort (String array[], int izq, int der) {
		int i = izq;
		int j = der;
		int pivote = (i+j) / 2;
		
		do {
			while (array [i].compareToIgnoreCase(array[pivote]) < 0) {
				i++;
			}
			
			while (array [j].compareToIgnoreCase(array[pivote]) > 0) {
				j--;
			}
			
			if(i <= j) {
				String aux = array[i];
				array[i] = array[j];
				array[j] = aux;
				i++;
				j--;
			}
		}
		while (i <= j);
		
		if (izq < j) {
			ordenacionQuicksort(array, izq, j);
		}
		
		if (i < der) {
			ordenacionQuicksort(array, i, der);
		}
	}
	
	public static void ordenacionQuicksortInverso (String array[], int izq, int der) {
		int i = izq;
		int j = der;
		int pivote = (i+j) / 2;
		
		do {
			while (array [i].compareToIgnoreCase(array[pivote]) > 0) {
				i++;
			}
			
			while (array [j].compareToIgnoreCase(array[pivote]) < 0) {
				j--;
			}
			
			if(i <= j) {
				String aux = array[i];
				array[i] = array[j];
				array[j] = aux;
				i++;
				j--;
			}
		}
		while (i <= j);
		
		if (izq < j) {
			ordenacionQuicksortInverso(array, izq, j);
		}
		
		if (i < der) {
			ordenacionQuicksortInverso(array, i, der);
		}
	}
}

package Ejercicio_4;

public class gestoraEjercicio_4 {
	
	public static void ordenacionQuicksort (int array [], int izq, int der) {
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
				int aux = array [i];
				array [i] = array [j];
				array [j] = aux;
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
	
	public static int buscarBin (int array[], int numerobuscado) {
		int izq = 0;
		int der = array.length;
		boolean encontrado = false;
		int pos = -1;
		
		for (int i = 0; !encontrado && i < array.length; i++) {
			int central = array[(izq + der) / 2];
			if (central <= numerobuscado) {
				if (central == numerobuscado) {
					encontrado = true;
					pos = (izq+der) / 2;
				}
				else {
					izq = (izq + der) / 2;
				}
			}
			else {
				der = (izq+der) / 2;
			}
		}
		return pos;
	}
}

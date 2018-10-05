package Ejercicio_1;

public class gestoraEjercicio_1 {

	public static void ordenacionBurbuja (int [] lista) {
		int cuentaintercambios = 0;
		for (boolean ordenado = false; !ordenado;) {
			for (int i = 0; i < lista.length-1; i++) {
				if (lista [i] > lista [i+1]) {
					int aux = lista [i];
					lista [i] = lista [i+1];
					lista [i+1] = aux;
					cuentaintercambios++;
				}
			}
			if (cuentaintercambios == 0 ) {
				ordenado = true;
			}
			cuentaintercambios = 0;
		}
	}
}

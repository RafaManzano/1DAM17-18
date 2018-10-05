package Ejercicio_13;

public class funcionalidades13 {

	public static int generaNumeroAleatorio(int minimo, int maximo) {
		int num = (int)Math.floor(Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
		return num;
	}
}

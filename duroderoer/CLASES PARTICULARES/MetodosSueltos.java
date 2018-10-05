/*
 * MetodosSueltos es para ordenar un poco los metodos y en este archivo
 * meteriamos todos los metodos comunes a todas las clases
 * 
 * 
 */


public class MetodosSueltos {
	
	public static int generaNumeroAleatorio (int minimo, int maximo) {
		int num = (int)Math.floor(Math.random()*((minimo - (maximo + 1))+(maximo + 1)));
		return num;
	}
}


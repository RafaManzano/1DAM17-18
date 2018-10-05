package funcionalidades;

import java.util.Scanner;

public class funcionalidadesAhorcado {

	public static char[] generaCaracteres () {
		char [] caracteres = new char [26];
		for (int i = 0, j = 97; i < caracteres.length; i++, j++) {
			caracteres [i] =(char)j;
		}
		
		return caracteres;
	}
	
	public static String pedirString (Scanner teclado, String mensaje) {
		System.out.println(mensaje);
		return teclado.next();
	}
	
	public static boolean comprobarAlfabeto (String cadena) {
		char caracter = 0;
		boolean hayError = false;
		for (int i = 0; i < cadena.length(); i++) {
			caracter = cadena.charAt(caracter);
			if (!Character.isAlphabetic(caracter)) {
				hayError = true;
			}
		}
		return hayError;
	}

	
	
}

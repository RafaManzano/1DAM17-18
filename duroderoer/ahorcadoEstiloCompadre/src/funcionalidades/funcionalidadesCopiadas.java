package funcionalidades;

import java.util.Scanner;

public class funcionalidadesCopiadas {

	 public static String pedirString(Scanner sn, String mensaje) {

	        System.out.println(mensaje);
	        return sn.next();

	 }
	 
	 public static char[] generaCaracteres() {

	        char[] caracteres = new char[26];
	        for (int i = 0, j = 97; i < caracteres.length; i++, j++) {
	            caracteres[i] = (char) j;
	        }

	        return caracteres;

	 }
	 
	 public static boolean comprobarAlfabeticos(String cadena) {

	        char caracter;

	        for (int i = 0; i < cadena.length(); i++) {
	            caracter = cadena.charAt(i);
	            if (!Character.isAlphabetic(caracter)) {
	                return true;
	            }
	        }

	        return false;

	 }
	 
	 public static boolean fin(int puntos[], int puntuacionSuperar) {

	        for (int i = 0; i < puntos.length; i++) {
	            if (puntos[i] >= puntuacionSuperar) {
	                return true;
	            }
	        }

	        return false;

	 }
	 
	 
	 public static String validar(Scanner sn, String mensaje, String mensajeError) {

	        String palabra;
	        boolean correcto;
	        do {
	            correcto=true;
	            palabra = pedirString(sn, mensaje).toLowerCase();
	            
	            if (comprobarAlfabeticos(palabra) || palabra.length() <= 1) {
	                System.out.println(mensajeError);
	                correcto=false;
	            }

	        } while (!correcto);

	        return palabra;
	 }
	 
	 public static void espacios(int numSaltos) {

	        for (int i = 0; i < numSaltos; i++) {
	            System.out.println("");
	        }
	 }
	 
	 
	 public static String rellenaGuiones(String cadena) {

	        String palabra = "";
	        for (int i = 0; i < cadena.length(); i++) {
	            palabra += "_"; //le pongo el guion
	        }

	        return palabra;
	 }
	 
	 
	 public static void mostrarPalabra(String cadena) {

	        for (int i = 0; i < cadena.length(); i++) {
	            System.out.print(cadena.charAt(i) + " ");
	        }

	        System.out.println("");

	 }
	 
	 
	 public static boolean palabraCorrecta(String palabraOriginal, String palabraUsuario) {

	        return palabraOriginal.equals(palabraUsuario);

	 }
	 
	 
	 public static void mostrarRepetidos(char[] abecedario, boolean insertados[]) {

	        System.out.print("Repetidas: ");
	        for (int i = 0; i < insertados.length; i++) {
	            //Si esta insertado, se muestra el caracter
	            if (insertados[i]) {
	                System.out.print(abecedario[i]);
	            }

	        }
	        System.out.println("");
	 }
	 
	 
	 public static void sumaPuntosOtroJugador(int[] puntos, int puntosSuperar, int pos_excluida) {

	        for (int i = 0; i < puntos.length; i++) {
	            if (i != pos_excluida) {
	                puntos[i]++;
	            }

	        }
	 }
	 
	 
	 public static int numRemplazos(String cadenaOriginal, char caracter) {

	        int remplazos = 0;
	        char caracterCadena;
	        for (int i = 0; i < cadenaOriginal.length(); i++) {
	            caracterCadena = cadenaOriginal.charAt(i);
	            if (caracterCadena == caracter) {
	                remplazos++;
	            }
	        }
	        return remplazos;

	 }
	 
	 
	 
	 public static String remplazar(String cadenaOriginal, String cadenaRemplazar, char caracter) {

	        String cadenaRemplazo = "";
	        char caracterCadena;
	        for (int i = 0; i < cadenaOriginal.length(); i++) {
	            caracterCadena = cadenaOriginal.charAt(i);

	            if (caracterCadena == caracter) {
	                cadenaRemplazo += caracter;
	            } else {
	                cadenaRemplazo += cadenaRemplazar.charAt(i);
	            }
	        }
	        return cadenaRemplazo;

	}
	 
	 
	 
	 
	 public static boolean caracterIntroducido(boolean[] insertados, char caracter) {
	        return insertados[caracter - 'a'];
	    }

	 
	    public static void actualizarInsertados(boolean[] insertados, char caracter) {

	        insertados[caracter - 'a'] = true;

	    }
	 
	 
	    
	    public static int cambiaTurno(int turnoActual, int limite) {

	        if (turnoActual == limite) {
	            return 0;
	        } else {
	            return ++turnoActual; //importante que sea pre-incremento
	        }

	    }
	    
	    
	    public static void mostrarPuntuaciones(String[] jugadores, int[] puntos) {

	        for (int i = 0; i < jugadores.length; i++) {
	            System.out.println(jugadores[i] + ": " + puntos[i] + " puntos");
	        }
	        System.out.println("");
	    }
	    
	    
	    public static void mostrarGanador(int[] puntos, String jugadores[], int puntosSuperar) {

	        int indiceGanador = 0;
	        for (int i = 0; i < puntos.length; i++) {
	            if (puntos[i] >= puntosSuperar) {
	                indiceGanador = i; //obtenemos el indice
	                break;
	            }
	        }

	        System.out.println("El ganador es " + jugadores[indiceGanador]);

	    }
	    
	    
	    public static void actualizarInsertados(boolean insertados[]) {

	        for (int i = 0; i < insertados.length; i++) {
	            insertados[i] = false;
	        }

	    }
}

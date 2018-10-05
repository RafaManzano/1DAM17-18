
import java.util.*;
public class pruebaMain {

	
	public static void main(String[] args) {
		int [][] array = new int [11][15];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				array [i][j] = gestoriaMain.numeroRandom();
				System.out.println("La posicion es " + i + " " + j + " y el valor es " + array [i][j]);
			}
		}
	}

}

package Ejercicio_10;

import java.util.Arrays;

public class Ejercicio_10 {

	public static void main(String[] args) {
		
		int [] num = new int [10];
		Arrays.fill(num, 1);
		
		//int [] num2 = Arrays.copyOf(num, 12); //Copia el contenido solamente
		int [] num2 = Arrays.copyOfRange(num, 2, 9); //Copia el valor y le pone el nuevo length
		
		for (int i = 0; i < num2.length; i++) {
			System.out.println(num2[i]);
		}

	}

}

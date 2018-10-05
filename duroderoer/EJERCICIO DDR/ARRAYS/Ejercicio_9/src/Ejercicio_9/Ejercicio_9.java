package Ejercicio_9;

import java.util.Arrays;
public class Ejercicio_9 {

	public static void main(String[] args) {
		
		int [] num = new int [10];
		Arrays.fill(num, 20);
		
		Arrays.fill(num, 3, num.length, -1);
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			
		}

	}

}

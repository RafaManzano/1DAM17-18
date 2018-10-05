package Ejercicio_12;

import java.util.Arrays;

public class Ejercicio_12 {

	public static void main(String[] args) {
		
		int [] num1 = new int [5];
		
		num1 [0] = 6;
		num1 [1] = 3;
		num1 [2] = 9;
		num1 [3] = 4;
		num1 [4] = 1;
		
		Arrays.sort(num1);
		
		for (int i = 0;i < num1.length;i++ ) {
			System.out.println(num1[i]);
		}

	}

}

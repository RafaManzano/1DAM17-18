package Ejercicio_11;

import java.util.Arrays;

public class Ejercicio_11 {

	public static void main(String[] args) {
		
		int [] num1 = new int [10];
		int [] num2 = new int [10];
		
		Arrays.fill(num1, -1);
		Arrays.fill(num2, 10);
		
		if (Arrays.equals(num1, num2)) {
			System.out.println("Son iguales");
		}
		else {
			System.out.println("No son iguales");
		}

	}

}

/*
 * 
 */


public class NotasAlumnos {
	
	public static void main (String[] args) {
		
		
		int [] array_random = new int [10];
		
		for(int i = 0; i< array_random.length; i++) {
			array_random[i] = (int)Math.round(Math.random()*100);
		}
		
		for (int numeros : array_random) {
			System.out.println(numeros);
		}
		
	}
}


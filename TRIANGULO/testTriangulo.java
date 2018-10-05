/*
 * testRectangulo
 * 
 */


public class testTriangulo {
	
	public static void main (String[] args) {
		Triangulo t0 = new Triangulo();
		Triangulo t1 = new Triangulo(2.5,0.8);
		System.out.println(t1.toString());
		
		Triangulo t2 = new Triangulo (t1);
		System.out.println(t2);
		
		System.out.println(t0.compareTo(t2));
	}
}

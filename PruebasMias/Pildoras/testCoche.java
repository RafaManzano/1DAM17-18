/*
 */


public class testCoche {
	
	public static void main (String[] args) {
		
		Coche Renault = new Coche (); //Instanciar una clase, ejemplar de clase
		
		//System.out.println("Este coche tiene " + Renault.ruedas + " ruedas." );
		
		System.out.println(Renault.getLargo());
		Renault.setColor("verde");
		System.out.println(Renault.getColor());
		
	}
}


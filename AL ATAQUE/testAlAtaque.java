/*
 * testAlAtaque
 * 
 */


public class testAlAtaque {
	
	public static void main (String[] args) {
		Jugador prueba = new Jugador ();
		
		prueba.setAtaque(metodosAlAtaque.generarNumeroPT());
		System.out.println(prueba.getAtaque());
	}
}


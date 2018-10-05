/*
 * 
 * 
 */


public class TestMemoria {
	
	public static void main (String[] args) {
		Memoria m1 = new Memoria (-10,"Das",5.2);
		Memoria m2 = new Memoria (9, "DDR4", 2.0);
		
		System.out.println(m1.getTamanho());
		
		try {
		m1.setTamanho(90);
		}
		catch (ExcepcionMemoria error) {
			System.out.println("El tamaño no puede ser negativo");
		}
		
	}
}


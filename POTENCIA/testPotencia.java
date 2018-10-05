/*
 * testPotencia
 */


public class testPotencia {
	
	public static void main (String[] args) {
		Potencia p0arg = new Potencia ();
		Potencia p2arg = new Potencia ();
		Potencia pcopia = new Potencia ();
		
			
		//Base 
		//r0arg
		System.out.println(p0arg.getBase());
		try {
		p0arg.setBase (9);
		}
		catch (ExcepcionPotencia e) {
			System.out.println("La base no puede ser negativa");
		}
		System.out.println(p0arg.getBase());
		/*
		//r2arg
		System.out.println(p2arg.getBase());
		//p2arg.setBase (-3);
		System.out.println(p2arg.getBase());
		
		//rcopia
		System.out.println(pcopia.getBase());
		//pcopia.setBase (-3);
		System.out.println(pcopia.getBase());
		
		//Altura
		//r0arg
		System.out.println(p0arg.getExponente());
		p0arg.setExponente (5);
		System.out.println(p0arg.getExponente());
		
		//r2arg
		System.out.println(p2arg.getExponente());
		p2arg.setExponente (5);
		System.out.println(p2arg.getExponente());
		
		//rcopia
		System.out.println(pcopia.getExponente());
		pcopia.setExponente (5);
		System.out.println(pcopia.getExponente());
		
		//CalcularPotencia
		//r0arg
		System.out.println(p0arg.CalcularPotencia());
		
		//r2arg
		System.out.println(p2arg.CalcularPotencia());
		
		//rcopia
		System.out.println(pcopia.CalcularPotencia());
		*/
	}	
}


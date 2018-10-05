package clases_porpias;

public class UsoPareja {

	public static void main(String[] args) {

		Pareja<String> una = new Pareja<String> ();
		
		una.setPrimero("MariCarmen");
		
		System.out.println(una.getPrimero());
		
		Persona pers1 = new Persona ("Carmelilla");
		
		Pareja<Persona> dos = new Pareja <Persona> ();
		
		dos.setPrimero(pers1);
		
		System.out.println(dos.getPrimero());
		

	}

}

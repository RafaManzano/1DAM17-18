package escribiendo;

import java.io.FileWriter;
import java.io.IOException;

public class Escribiendo {

	public void escribir() {
		String frase ="Esto es una prueba de escritura y sobreescribe";
		
		try {
			
			FileWriter escritura = new FileWriter("C:/Users/Rafael Manzano/Desktop/texto.txt"); //Para que no sobreescriba poner otro argumento true
			
			for (int i = 0; i < frase.length(); i++) {
				escritura.write(frase.charAt(i));
			}
			
			escritura.close();
		} 
		catch (IOException e) {
			
			System.out.println("No se ha creado el archivo");
		}
	}
	
	
}

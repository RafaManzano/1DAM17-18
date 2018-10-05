package leyendo;

import java.io.FileReader;
import java.io.IOException;

public class Leer_Fichero {

	FileReader entrada = null;
	
	public void lee () {
		try {
			
			 entrada = new FileReader("C:/Users/Rafael Manzano/Desktop/ejemplo.txt");
			
			int c = 0;
			
			while (c != -1) {
				c = entrada.read();
				char  letra = (char)c;
				System.out.print(letra);
			}
			
			//entrada.close();
		}
		catch (IOException e) {
			
			System.out.print("No se ha encontrado el archivo");
		}
		
		finally {
			try {
				
				entrada.close();
				
			} catch (IOException e) {
				
				System.out.println("No se ha cerrado correctamente");
			}
		}
	}
}

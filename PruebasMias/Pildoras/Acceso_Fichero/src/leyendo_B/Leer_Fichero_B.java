package leyendo_B;

import java.io.*;

public class Leer_Fichero_B {

	FileReader entrada = null;
	String linea = "";
	
	public void lee () {
		try {
			
			 entrada = new FileReader("C:/Users/Rafael Manzano/Desktop/ejemplo.txt");
			 
			 BufferedReader mibuffer = new BufferedReader (entrada);
			
			
			
			while (linea != null) {
				
				linea = mibuffer.readLine();
				
				if(linea != null) {
					System.out.println(linea);
				}
				
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

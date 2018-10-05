package leyendo_escribiendo_bytes;

import java.io.*;

public class Lectura_Escritura {

	public static void main(String[] args) {

		boolean final_ar = false;
		int byte_entrada = 0;
		int contador = 0;
		int datos_entrada [] = new int [194257];
		try {
			
			FileInputStream archivo_Lectura = new FileInputStream("C:/Users/Rafael Manzano/Desktop/leyendo_creando/imagen.jpg");
			
			while (!final_ar) {
				byte_entrada = archivo_Lectura.read();
				
				if(byte_entrada != -1) {
					datos_entrada[contador] = byte_entrada;
					
				}
				
				else {
					final_ar = true;
				}
				
				System.out.println(datos_entrada[contador]);
				
				contador++;
			}
			archivo_Lectura.close();
		}
		
		catch(IOException e){
			System.out.println("Error al acceder a la imagen");
		}
		
		System.out.println(contador);

		crea_fichero(datos_entrada);
		
	}
	
	
	static void crea_fichero (int datos_nuevo_fichero[]) {
		try {
			FileOutputStream fichero_nuevo = new FileOutputStream("C:/Users/Rafael Manzano/Desktop/leyendo_creando/imagencopia.jpg");
				
			for (int i = 0; i < datos_nuevo_fichero.length;i++) {
				fichero_nuevo.write(datos_nuevo_fichero[i]);
			}
			
			fichero_nuevo.close();
		}
		catch(IOException e) {
			System.out.println("Error al crear al archivo");
		}
	}
	

}

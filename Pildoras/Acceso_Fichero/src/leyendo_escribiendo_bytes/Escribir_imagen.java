package leyendo_escribiendo_bytes;

import java.io.FileOutputStream;
import java.io.IOException;

public class Escribir_imagen {

	public void crea_fichero (int datos_nuevo_fichero[]) {
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

package Metodos;

import java.io.*;

public class Metodo1 {

	public static void ejercicio1 () {
		File file;
		String [] contenido;
		
		try {
			file = new File ("C:\\Users\\rmanzano\\Desktop\\Busca minas V1");
			contenido = file.list();
			for (int i = 0; i < contenido.length; i++ ) {
				System.out.println(contenido[i]);
			}
			
		}
		catch (Exception nombre) {
			
		}
	}
	
	public static void ejercicio2 (String rutazo) {
		
	}
		
	}


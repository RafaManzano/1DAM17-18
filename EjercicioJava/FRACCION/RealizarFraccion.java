/*
 * Nombre: RealizarFraccion
 * Comentario: Realizaremos distintas operaciones con las fracciones
 * Analisis:
 * 	Entrada: -num1 //numerador1
 * 			 -num2 //numerador2
 * 			 -den1 
 * 			 -den2 
 * 			 -opcion
 * 
 * 	Salida: - Mostrar Menu
 * 			- Resultado de la suma //Mostrar por pantalla la fraccion resultante
 * 			- Resultado de la resta //Mostrar por pantalla la fraccion resultante
 * 			- Resultado de la multiplicacion //Mostrar por pantalla la fraccion resultante
 * 			- Resultado de la division //Mostrar por pantalla la fraccion resultante
 * 	Requisitos: No hay
 * ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * Estudio del bucle:
 * 	Nombre: MientrasSeaOpcionSeaEntre1y4
 * 	VCB: Centinela
 * 	Inicializacion VCB: Lectura anticipada, antes de la primera iteraccion
 * 	Actualizacion VCB: Lectura final, al final del bucle
 * 	Condicion de salida: opcion >= 1 Y opcion <= 4
 * ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * PG
 * 	Inicio
 * 		 PresentarMenu  y validar opcion
 * 		Mientras opcion sea distinta de 0
	 * 		Leer fracciones
	 * 		Segun (opcion)
	 * 			Caso 1
	 * 				SumarFraccion * 
	 *   		Caso 2
	 * 				RestarFraccion *
	 *   		Caso 3
	 * 				MultiplicacionFraccion *
	 *   		Caso 4
	 * 				DivisionFraccion *
	 * 		FinSegun
	 * 		PresentarMenu y validar opcion
 * 		FinMientras
 * 	Fin
 */

import java.io.*;
import java.util.Scanner;
public class RealizarFraccion {
	
	public static void main (String[] args) {
		double num1 = 0;
		double num2 = 0;
		double den1 = 0;
		double den2 = 0;
		int opcion = 0;
		
		Scanner teclado = new Scanner (System.in);
		
		//PresentarMenu  y validar opcion
		do {
		MetodosFraccion.PresentarMenu();
		opcion = teclado.nextInt();
		}
		while (opcion < 0 || opcion > 4);
		
		
		
		
		
		//Mientras opcion sea distinta de 0
		while(opcion >= 1 && opcion <= 4){
			
			//Leer fracciones
		System.out.println("Elija sus fracciones:");
		
		//Primera fraccion
		
		System.out.println("Primera fraccion");
		System.out.print("Elegir numerador: ");
		num1 = teclado.nextDouble();
		System.out.print("Elegir denominador: ");
		den1 = teclado.nextDouble();
	
		
		//Segunda fraccion
		System.out.println("Segunda fraccion");
		System.out.print("Elegir numerador: ");
		num2 = teclado.nextDouble();
		System.out.print("Elegir denominador: ");
		den2 = teclado.nextDouble();
			
			//Segun (opcion)
			switch(opcion){
				
				//Caso 1
				case 1:
				//SumarFraccion *
				MetodosFraccion.Suma(num1, num2, den1, den2);
				//System.out.println("Primer opcion");
				break;
				
				case 2:
				//RestarFraccion *
				MetodosFraccion.Resta(num1, num2, den1, den2);
				//System.out.println("Segunda opcion");
				break;
				
				case 3:
				//MultiplicacionFraccion *
				MetodosFraccion.Multiplicacion(num1, num2, den1, den2);
				//System.out.println("Tercera opcion");
				break;
				
				case 4:
				//DivisionFraccion *
				MetodosFraccion.Division(num1, num2, den1, den2);
				//System.out.println("Cuarta opcion");
				break;
			} //Fin Segun
			//PresentarMenu * y validar opcion
			do {
				MetodosFraccion.PresentarMenu();
				opcion = teclado.nextInt();
				}
				while (opcion < 0 || opcion > 4);
			}//Fin Mientras
		}
	}




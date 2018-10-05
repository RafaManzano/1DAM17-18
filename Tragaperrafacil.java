/* Nombre del programa: Tragaperrafacil
 * Comentario: Realizaremos un programa para una tragaperras honrada con 4  posibilidades
 * de premio y 3 slots donde jugar , dariamos premios de nuestra tabla de premios
 * Premios con apuesta 1	Premios con apuesta 2	Premios con apuesta 5
 * Pera 5					10						25
 * Manzana 10				20						50
 * Naranja 20				40						100
 * Uva	40					80						200
 -------------------------------------------------------------------------------------------------
 * Analisis:
 * 	Entrada: dinero,respuesta, apuesta, slot1, slot2, slot3, premio, numelegido
 * 	Salida: Si gana saldra un mensaje y el dinero aumentara
 * 			Si pierde saldra un mensaje y el dinero disminuira
 * Requisitos: El dinero no puede 0 ni negativo
 * 			   Apuesta tiene que ser 1, 2 o 5
 * 			   Respuesta tiene que ser S o N
 * 			   Random sera de 1 a 4
-------------------------------------------------------------------------------------------------
* Estudio de los bucles
* Nombre del bucle: BucleRespuestaSoN
* VCB: Centinela
* Inicializacion VCB: Lectura anticipada, antes de la primera iteracion
* Actualizacion VCB: Lectura final, al final del bucle
* Condicion de salida: respuesta == 's' || respuesta == 'n'
* 
* Nombre del bucle: Mientras sea s
* VCB: Centinela
* Inicializacion VCB: Lectura anticipada, antes de la primera iteracion
* Actualizacion VCB: Lectura final, al final del bucle
* Condicion de salida: respuesta == 's' 
* 
* Nombre del bucle: BucleDineroNo0inf
* VCB: Centinela
* Inicializacion VCB: Lectura anticipada, antes de la primera iteracion
* Actualizacion VCB: Lectura final, al final del bucle
* Condicion de salida: dinero > 0 
* 
* Nombre del bucle: BucleApuesta125
* VCB: Centinela
* Inicializacion VCB: Lectura anticipada, antes de la primera iteracion
* Actualizacion VCB: Lectura final, al final del bucle
* Condicion de salida: apuesta == 1 || apuesta == 2 || apuesta == 5
* 
* Nombre 
 -------------------------------------------------------------------------------------------------
 * 
 * PG
 * 	Inicio
 * 		IniBucleRespuestaSoN	
 * 		ActBucleRespuestaSoN
 * 		MientrasSeaSi
 * 			IntBucleDineroNo0inf
 * 			ActBucleDineroNo0inf
 * 			Mientras dinero sea mayor que 0
	 * 			IntBucleApuesta125
	 * 				si el dinero es inferior a la apuesta
	 * 			ActBucleApuesta125
	 * 			Segun (el primer slot)
	 * 				caso1
	 * 					Mostrar Pera
	 * 				caso2
	 * 					Mostrar Manzana
	 * 				caso3
	 * 					Mostrar Naranja
	 * 				caso4
	 * 					Mostrar Uva
	 * 			FinSegun
	 * 
	 * 			Segun (el segundo slot)
	 * 				caso1
	 * 					Mostrar Pera
	 * 				caso2
	 * 					Mostrar Manzana
	 * 				caso3
	 * 					Mostrar Naranja
	 * 				caso4
	 * 					Mostrar Uva
	 * 			FinSegun
	 * 
	 * 			Segun (el tercer slot)
	 * 				caso1
	 * 					Mostrar Pera
	 * 				caso2
	 * 					Mostrar Manzana
	 * 				caso3
	 * 					Mostrar Naranja
	 * 				caso4
	 * 					Mostrar Uva
	 * 			FinSegun
	 * 
	 *				Si el primer slot es igual a el slot 2 y al slot 3
	 *				Si la apuesta es igual a 1
	 * 					premio ganador y sumado al dinero
	 * 				Sino
	 * 					Si la apuesta es igual a 2
	 * 						premio ganador multiplicado por 2 y sumado al dinero
	 * 					Sino
	 * 						Si la apuesta es igual a 5
	 * 							premio ganador multiplicando por 5 y sumado al dinero
	 * 						Sino
	 * 							No hay premio y se resta la apuesta con el dinero
	 * 				FinSi
	 * 		FinMientras	
	 * 	FinMientras
	 * 	IniBucleRespuestaSoN	
	 * 	ActBucleRespuestaSoN
	 * 
 */

import java.io.*; //Siempre lo importamos
import java.util.*; //La importamos completo para tener la clase tanto Random como Scanner

public class Tragaperrafacil{
	public static void main (String [] args){
		int dinero = 0;
		char respuesta; 
		int apuesta;
		int slot1;
		int slot2; 
		int slot3; 
		int premio = 0; 
		int	numelegido;
		int aleatorio;
		
		Scanner teclado = new Scanner (System.in);
		Random random = new Random();
		do{
		//IniBucleRespuestaSoN	 		
		System.out.print("Bienvenido a la tragaperras, desea jugar (S/N): ");
		respuesta = teclado.next().charAt(0);
		}
		while(respuesta != 's' && respuesta != 'n');
		//ActBucleRespuestaSoN
		
		while (respuesta == 's'){ //MientrasSeaSi
			
 			//IntBucleDineroNo0inf
			
				System.out.print("Cuanto dinero tiene en su poder: ");
				dinero = teclado.nextInt();
				while(dinero > 0){ //Mientras dinero sea menor que 0
									
				//IntBucleApuesta125
				do{
					System.out.print("Cual es su apuesta (1, 2 o 5)");
					apuesta = teclado.nextInt();
					if (apuesta > dinero){
						System.out.println("No tienes dinero para la apuesta");
						}
				}
				//ActBucleApuesta125
				while((apuesta != 1 && apuesta != 2 && apuesta != 5) ||(apuesta > dinero));
				
			
				//Segun (el primer slot)
				aleatorio = random.nextInt(4) + 1;
				switch(slot1 = aleatorio){ 
					case 1:
					System.out.println("Pera");
					premio = 5;
					break;
				
					case 2:
					System.out.println("Manzana");
					premio = 10;
					break;
				
					case 3:
					System.out.println("Naranja");
					premio = 20;
					break;
				
					case 4:
					System.out.println("Uva");
					premio = 40;
					break;
				}
				
				//Segun (el segundo slot)
				aleatorio = random.nextInt(4) + 1;
				switch(slot2 = aleatorio){
					case 1:
					System.out.println("Pera");
					break;
				
					case 2:
					System.out.println("Manzana");
					break;
				
					case 3:
					System.out.println("Naranja");
					break;
				
					case 4:
					System.out.println("Uva");
					break;
				}
				
				//Segun (el tercer slot)
				aleatorio = random.nextInt(4) + 1;
				switch(slot3 = aleatorio){
					case 1:
					System.out.println("Pera");
					break;
				
					case 2:
					System.out.println("Manzana");
					break;
				
					case 3:
					System.out.println("Naranja");
					break;
				
					case 4:
					System.out.println("Uva");
					break;
				}
			if (slot1 == slot2 && slot2 == slot3){ //Si el primer slot es igual a el slot 2 y al slot 3
				if (apuesta == 1){ //Si la apuesta es igual a 1
				System.out.println("Has ganado y su premio ha sido de " + premio);
				dinero = premio + dinero;
				System.out.println("Su monedero tiene " + dinero);
			}
			else if (apuesta == 2) { //Sino, Si la apuesta es igual a 2
				System.out.println("Has ganado y su premio ha sido de " + (premio * 2));
				dinero = (premio * 2) + dinero;	
			}
			else if (apuesta == 5) { //Sino, Si la apuesta es igual a 5
				System.out.println("Has ganado y su premio ha sido de " + (premio * 5));
				dinero = (premio * 5) + dinero;
			}
		}
		else { //Sino
			System.out.println("Has perdido");
			dinero = dinero - apuesta;
			System.out.println("Su monedero tiene " + dinero);
		}
		do{
		//IniBucleRespuestaSoN	 		
		System.out.print("Desea jugar de nuevo (S/N): ");
		respuesta = teclado.next().charAt(0);
		}
		while(respuesta != 's' && respuesta != 'n');
		//ActBucleRespuestaSoN
		}
		}	
	}
}
	



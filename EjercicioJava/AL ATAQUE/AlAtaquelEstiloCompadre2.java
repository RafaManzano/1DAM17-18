/*
 * Nombre del Programa: AlAtaquelEstiloCompadre2.0
 * BreveComentario: Seria un juego de combate con la peculiaridad de tener clase
 *  ganar unos enemigos y despues ganarle al Boss
 * 
 * Analisis:
 * 	Entrada: o Opcion
 * 			 o Respuesta
 * 			 o Victoria
 * 			 o NombrePL
 * 			 o opcionRival
 * 
 * 	Salida: o Mensajes de comunicacion con el usuario
 * 			o Resultado de las batallas
 * 
 * 	Requisitos: o Opcion esta entre 0 y 3
 * 				o Respuesta solo puede ser s o n
 * 
--------------------------------------------------------------------------------------------------------------------------------------------
* PG lvl 0
* 	Inicio
* 		Presentar Menu y validar //Lectura inicial
* 		Segun la opcion elegida
* 			Caso 1:
* 				Un jugador 
* 			Caso 2: 
* 				Multijugador
* 			Caso 3
* 				Explicacion del juego
* 		FinSegun
* 		Presentar Menu y validar //Lectura final
* 	Fin
--------------------------------------------------------------------------------------------------------------------------------------------
* PG (Un jugador)
* 	Inicio
* 		Leer y validar respuesta //Lectura inicial
* 		Mientras la respuesta es Si
* 			Si las victorias son iguales a 0 
* 				Introducir nombre jugador
* 				Mostrar atributos de jugador principal
* 			FinSi
* 			Si las victorias son inferiores a 5
* 				Mostrar Enemigo
* 				Mostrar Atributos Enemigo
* 			Sino
* 				Mostrar Jefe Final
* 				Mostrar Atributos Jefe Final
* 			Mostrar Escenario
* 			Si el jugador tiene el mismo tipo que el escenario
* 				Suben las estadisticas del jugador
* 			Sino Si el rival que tiene el mismo tipo que el escenario
* 				Suben las estadisticas del rival
* 			Repetir
* 				Leer y validar opcion combate
* 				Realizar Combate
* 			Mientras (Jugador tenga vida y el enemigo tenga vida)
* 		FinSi
* 		Si el jugador se queda sin vida
* 			Imprimir Fin del juego
* 		Sino 
* 			Sumar a las victorias
* 		Fin mientras
* 		Leer y validar respuesta //Lectura final
* 	Fin
---------------------------------------------------------------------------------------------
* PG (Realizar Combate)
* 	Inicio
* 		Elegir y validar Movimiento
* 		Segun (opcion)
* 			Caso 1:
* 				Realizar Movimiento Ataque
* 				Imprimir Resultado
* 			Caso 2:
* 				Realizar Movimiento Defensa
* 				Imprimir Resultado
* 			Caso 3:
* 				Realizar Movimiento Esquivar
* 				Imprimir Resultado
* 		Fin Segun
* 	Fin
---------------------------------------------------------------------------------------------
* PG Multijugador
* 	Inicio
* 		Leer y validar respuesta //Lectura inicial
* 		Imprimir En construccion
* 		Leer y validar respuesta //Lectura final
* 	Fin
---------------------------------------------------------------------------------------------
* PG 
*   Inicio
* 		Leer y validar respuesta //Lectura inicial
* 		Imprimir Explicacion de juego
* 		Leer y validar respuesta //Lectura final
* 	Fin
 */

import java.util.*; 

public class AlAtaquelEstiloCompadre2 {
	
	public static void main (String[] args) {
		//Declaracion de variables
		char respuesta;
		int opcion;
		int victoria = 0;
		String nombrePL;
		int opcionRival;
		int porcentajeEsquivar;
		int porcentajeDefensa;
		
		//Construccion de objetos
		Scanner teclado = new Scanner (System.in);
		Random random = new Random ();
		Jugador j1 = new Jugador ();
		Jugador rival = new Jugador ();
		Jugador esc = new Jugador ();
		
		//Comienzo de la partida
		System.out.println("Bienvenido a la mejor simulacion de combates");
		
		//Presentar Menu y validar
		do {
			metodosAlAtaque.PresentarMenu();
			opcion = teclado.nextInt();
		}
		while (opcion < 0 || opcion > 3);
		
		
		while (opcion != 0)  { //Mientras la opcion sea distinta de 0
			
			
			
			switch (opcion) { //Segun (opcion)
				
				case 1: //Caso 1
				
				//Leer y validar respuesta
				do {
						System.out.println("Has pulsado el boton que querias? (S/N)");
						respuesta = teclado.next().charAt(0);
				}
				while (respuesta != 's' && respuesta != 'n');
				
				//Mientras la respuesta es Si
				while (respuesta == 's') {
						
					if (victoria == 0) { //Si las victorias son iguales a 0 
						//Introducir nombre jugador
						System.out.println("Elija su nombre, por favor");
						nombrePL = teclado.next();
						
						//Mostrar atributos de jugador principal
						System.out.println("Y sus estadisticas son:");
						
						//Ataque
						j1.setAtaque(metodosAlAtaque.generarNumeroPT());
						System.out.println("Ataque: " + j1.getAtaque());
						
						//Defensa
						j1.setDefensa(metodosAlAtaque.generarNumeroPT());
						System.out.println("Defensa: " + j1.getDefensa());
						
						//Esquivar
						j1.setEsquivo(metodosAlAtaque.generarNumeroPT());
						System.out.println("Esquivar: " + j1.getEsquivo());
						
						//Vida
						j1.setVida(metodosAlAtaque.generarNumeroVida());
						System.out.println("Vida: " + j1.getVida());
						
						//Tipo
						j1.setTipo(metodosAlAtaque.cargadoArrayAleatorioTipos());
						System.out.println("Tipo: " + j1.getTipo());
					}
						
					
						//Mostrar Enemigo 
						if (victoria < 5) { //Si las victorias son inferiores a 5
							System.out.println("Aqui tienes a tu rival");
								
							rival.setNombre(metodosAlAtaque.cargadoArrayAleatorioNombre()); //Generamos los nombres aleatorio
							
							
							System.out.println("Nombre: " + rival.getNombre());
								
							//Ataque
							rival.setAtaque(metodosAlAtaque.generarNumeroPT());
								
							//Defensa
							rival.setDefensa(metodosAlAtaque.generarNumeroPT());
								
							//Esquivar
							rival.setEsquivo(metodosAlAtaque.generarNumeroPT());
								
							//Vida
							rival.setVida(metodosAlAtaque.generarNumeroVida());
							
							//Tipo
							rival.setTipo(metodosAlAtaque.cargadoArrayAleatorioTipos());
							System.out.println("Tipo: " + rival.getTipo());
						}
						else { //Sino
							//Mostrar Jefe Final
							System.out.println("Es el Jefe Final, ten mucho cuidado");
							rival.setNombre("Atanatari");
							System.out.println("Nombre: " + rival.getNombre());
							
							//Mostrar Atributos Jefe Final
							rival.setAtaque(metodosAlAtaque.generarNumeroPT() + 4);
							
							rival.setDefensa(metodosAlAtaque.generarNumeroPT() + 4);
							
							rival.setEsquivo(metodosAlAtaque.generarNumeroPT() + 4);
							
							rival.setVida(metodosAlAtaque.generarNumeroVida() + 30);
							
							rival.setTipo("Legendario");
							System.out.println("Tipo: " + rival.getTipo());
						}
						
						//Mostrar Escenario
						esc.setTipo(metodosAlAtaque.cargadoArrayAleatorioTipos());
						System.out.println("El escenario es " + esc.getTipo());
					
					if (j1.getTipo () == esc.getTipo ()) { //Si el jugador tiene el mismo tipo que el escenario
						System.out.println("El escenario le favorece, sus estadisticas suben"); //Suben las estadisticas del jugador
						j1.setAtaque(j1.getAtaque() + 2);
						j1.setDefensa(j1.getDefensa() + 2);
						j1.setEsquivo(j1.getEsquivo() + 2);
					}
					if (rival.getTipo () == esc.getTipo ()) { //Sino Si el tival que tiene el mismo tipo que el escenario
						System.out.println("El escenario favorece al rival, sus estadisticas suben"); //Suben las estadisticas del rival
						rival.setAtaque(rival.getAtaque() + 2);
						rival.setDefensa(rival.getDefensa() + 2);
						rival.setEsquivo(rival.getEsquivo() + 2);
					}
						do { //Repetir
							
							//Leer y validar opcion combate
							do {
							metodosAlAtaque.PresentarMenuCombate();
							opcion = teclado.nextInt();
							opcionRival = random.nextInt(3)+1;
							}
							while (opcion < 0 || opcion > 3);
							
							switch (opcion) {
								
								case 1: //Caso 1:
								
								//Realizar Movimiento Ataque
									if (opcion == opcionRival) {
									j1.setVida((j1.getVida() - rival.getAtaque()));
									System.out.println("Tienes " + j1.getVida() + " de vida"); //Imprimir resultado
							
									rival.setVida((rival.getVida() - j1.getAtaque()));
									System.out.println("El rival tiene " + rival.getVida() + " de vida");
							
									}
									
									else if (opcionRival == 2) {
										porcentajeDefensa = random.nextInt(100)+1;
											if ((porcentajeDefensa + rival.getDefensa ()) < 40) {
												rival.setVida((rival.getVida () - j1.getAtaque()));
												System.out.println("El rival tiene " + rival.getVida() + " de vida por el golpe");
											}
											else if ((porcentajeDefensa + rival.getDefensa ()) > 80) {
													j1.setVida((j1.getVida () - (rival.getDefensa())));
													System.out.println("Tienes " + j1.getVida() + " por el golpe");
												}
												else {
													System.out.println("No afecta el golpe");
												}
										}	
						
									if (opcionRival == 3) {
										
										porcentajeEsquivar = random.nextInt(100)+1;
										if ((porcentajeEsquivar + rival.getEsquivo ()) < 40) {
											rival.setVida((rival.getVida () - j1.getAtaque()));
											System.out.println("Tienes " + j1.getVida() + " por el golpe");
										}
										else if ((porcentajeEsquivar + rival.getEsquivo ()) > 80) {
												j1.setVida((j1.getVida () - rival.getAtaque()));
												System.out.println("El rival tiene " + rival.getVida() + " de vida");
											}
											else {
												System.out.println("No afecta el golpe");
											}
									}
								break;
					
								case 2: //Caso 2:
									//Realizar Movimiento Defensa
									if (opcion == opcionRival) {
										System.out.println("Ambos se defienden, por lo tanto no hay golpe");
									}
									else if (opcionRival == 1) {
											porcentajeDefensa = random.nextInt(100)+1;
											if ((porcentajeDefensa + j1.getDefensa ()) < 40) {
												j1.setVida((j1.getVida () - rival.getAtaque()));
												System.out.println("Tienes " + j1.getVida() + " por el golpe");
											}
											else if ((porcentajeDefensa + j1.getDefensa ()) > 80) {
													rival.setVida((rival.getVida () - (j1.getDefensa())));
													System.out.println("El rival tiene " + rival.getVida() + " de vida por el golpe");
												}
												else {
													System.out.println("No afecta el golpe");
												}
										}		
										
										else if (opcionRival == 3) {
											System.out.println("No es efectivo puesto que el rival ha esquivado");
										}
								break;
						
								case 3: //Caso 3:
									//Realizar Movimiento Esquivar
										porcentajeEsquivar = random.nextInt(100)+1;
										if (opcionRival == 1) {
											if ((porcentajeEsquivar + j1.getEsquivo ()) < 40) {
												j1.setVida((j1.getVida () - rival.getAtaque()));
												System.out.println("Tienes " + j1.getVida() + " por el golpe");
											}
											else if ((porcentajeEsquivar + j1.getEsquivo ()) > 80) {
													rival.setVida((rival.getVida () - j1.getAtaque()));
													System.out.println("El rival pierde " + rival.getVida() + " de vida por el golpe");
												}
												else {
													System.out.println("No afecta el golpe");
												}
										}		
										if (opcionRival == 2) {
											System.out.println("No es efectivo puesto que se ha defendido");
										}
										if (opcionRival == 3) {
											System.out.println("Los dos usais el mismo movimiento, no es efectivo");
										}
								break;
							
						}
						
						}
						while(j1.getVida () > 0 && rival.getVida () > 0);
						
						
						if (j1.getVida() <= 0) { //Si el jugador se queda sin vida
							System.out.println("FIN DEL JUEGO"); //Imprimir Fin del juego
							do {
								System.out.println("Quieres jugar de nuevo? (S/N)");
								respuesta = teclado.next().charAt(0);
							}
							while (respuesta != 's' && respuesta != 'n');
						}
						else { //Sino
							
							System.out.println("Has derrotado a " + rival.getNombre());
							victoria = victoria + 1; //Sumar a las victorias
							do { //Leer y validar respuesta //Lectura final
								System.out.println("Quieres tomar una pocion de vida (Te proporciona 10 puntos extra)");
								respuesta = teclado.next().charAt(0);
								j1.setVida (j1.getVida () + 10);
							}
							while (respuesta != 's' && respuesta != 'n');
							
								
							
							
							if (victoria == 6) {
								respuesta = 'n';
							}
							/*
							if (victoria == 5) {
								System.out.println("Es el Jefe Final, ten mucho cuidado");
								rival.setNombre("Atanatari");
								System.out.println("Nombre: " + rival.getNombre());
								rival.setAtaque(metodosAlAtaque.generarNumeroPT() + 4);
								rival.setDefensa(metodosAlAtaque.generarNumeroPT() + 4);
								rival.setEsquivo(metodosAlAtaque.generarNumeroPT() + 4);
								rival.setVida(metodosAlAtaque.generarNumeroVida() + 30);
								rival.setTipo("Legendario");
								System.out.println("Tipo: " + rival.getTipo());
							}
							*/
						}
						
					}	
					
				break;
			case 2:
				do { //Leer y validar respuesta //Lectura inicial
					System.out.println("Has pulsado el boton que querias? (S/N)");
					respuesta = teclado.next().charAt(0);
					victoria = 0;
				}
				while (respuesta != 's' && respuesta != 'n');
				
				//Imprimir En construccion
				while (respuesta == 's') { 
					System.out.println("Esta en construccion, en proximas actualizaciones estara disponible");
					
					do { //Leer y validar respuesta //Lectura final
						System.out.println("Quieres volver a usarlo? (S/N)");
						respuesta = teclado.next().charAt(0);
					}
					while (respuesta != 's' && respuesta != 'n');
				}
			break;
			
			case 3: 
				do { //Leer y validar respuesta //Lectura inicial
					System.out.println("Has pulsado el boton que querias? (S/N)");
					respuesta = teclado.next().charAt(0);
				}
				while (respuesta != 's' && respuesta != 'n');
				
				//Imprimir Explicacion del juego
				while (respuesta == 's') {
					System.out.println("El juego es un simulador de combates que enfrentaria tanto a un rival contra un bot, como multijugador (todavia no implementada). Tienes tres movimientos base, atacar, defender y esquivar. Con eso tienes que ganar a 4 enemigos para encontrar al Atanatari. Si puedes con el has ganado el juego. Te deseo suerte, la necesitaras");
					
					do { //Leer y validar respuesta //Lectura final
						System.out.println("Quieres volver a leerlo? (S/N)");
						respuesta = teclado.next().charAt(0);
					}
					while (respuesta != 's' && respuesta != 'n');
				}
			break;
				}
				 
				do { //Presentar Menu y validar
					metodosAlAtaque.PresentarMenu();
					opcion = teclado.nextInt();
				}
				while (opcion < 0 || opcion > 3);
				
			}
			
			}			
	}

	

 
 			
			
 		
	







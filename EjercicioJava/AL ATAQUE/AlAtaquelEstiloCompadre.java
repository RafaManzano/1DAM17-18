/*
 * Nombre del Programa: AlAtaquelEstiloCompadre
 * BreveComentario: Seria un juego de combate con la peculiaridad de tener clase
 *  ganar unos enemigos y despues ganarle al Boss
 * 
 * Analisis:
 * 	Entrada: o Opcion
 * 			 o OpcionRival
 * 
 * 	Salida: o Mensajes de comunicacion con el usuario
 * 			o Resultado de las batallas
 * 
 * 	Requisitos: o Opcion esta entre 0 y 3
 * 
-----------------------------------------------------------------------------------------------
* PG lvl 0
* 	Inicio
* 		Presentar Menu y validar
* 		Segun la opcion elegida
* 			Caso 1:
* 				Un jugador 
* 			Caso 2: 
* 				Multijugador
* 		FinSegun
* 	Fin
---------------------------------------------------------------------------------------------
* PG lvl 1 (Un jugador)
* 	Inicio
* 		Leer y validar respuesta
* 		Si quiere jugar 
* 			Introducir nombre jugador
* 			Mostrar atributos
* 			Repetir
* 				Mostrar Enemigo
* 				Realizar Combate
* 			Mientras (Jugador tenga vida y queden enemigos)
* 		FinSi
* 	Fin
---------------------------------------------------------------------------------------------
* PG lvl 2 (Realizar Combate)
* 	Inicio
* 		Repetir
* 			Elegir Movimiento
* 			Realizar Movimiento
* 			Imprimir Resultado
* 		Mientras (Jugador o Enemigo este con vida)
* 	Fin
---------------------------------------------------------------------------------------------
* PG lvl 1 Multijugador
* 	Inicio
* 		Imprimir En construccion
* 	Fin
---------------------------------------------------------------------------------------------
* 
 */

import java.io.*;
import java.util.*;

public class AlAtaquelEstiloCompadre {
	
	public static void main (String[] args) {
		int opcion = 0;
		int OpcionRival = 0;
		String nombrePL;
		char respuesta = 's';
		int victoria = 0;
		char nuevorival = 'n';
		
				
		Scanner teclado = new Scanner (System.in);
		Random random = new Random ();
		Jugador j1 = new Jugador ();
		Jugador rival = new Jugador ();
		Jugador esc = new Jugador ();
		System.out.println("Bienvenido a la mejor simulacion de combates");
		
		//Presentar Menu y validar
		do {
			metodosAlAtaque.PresentarMenu();
			opcion = teclado.nextInt();
		}
		while (opcion < 0 || opcion > 3);
		
		while (opcion != 0)  {
			switch (opcion) {
			case 1:
				do {
						System.out.println("Quieres jugar?");
						respuesta = teclado.next().charAt(0);
				}
				while (respuesta != 's' && respuesta != 'n');
				if (respuesta == 's') {
					if (nuevorival == 'n' || rival.getVida () > 0)  {
						System.out.println("Elija su nombre, por favor");
						nombrePL = teclado.next();
						System.out.println("Y sus estadisticas son:");
						j1.setAtaque(metodosAlAtaque.generarNumeroPT());
						System.out.println("Ataque: " + j1.getAtaque());
						j1.setDefensa(metodosAlAtaque.generarNumeroPT());
						System.out.println("Defensa: " + j1.getDefensa());
						j1.setEsquivo(metodosAlAtaque.generarNumeroPT());
						System.out.println("Esquivar: " + j1.getEsquivo());
						j1.setVida(metodosAlAtaque.generarNumeroVida());
						System.out.println("Vida: " + j1.getVida());
						j1.setTipo(metodosAlAtaque.cargadoArrayAleatorioTipos());
						System.out.println("Tipo: " + j1.getTipo());
					}
						
					if (victoria != 5) {
						System.out.println("Aqui tienes a tu rival");
						rival.setNombre(metodosAlAtaque.cargadoArrayAleatorioNombre());
						System.out.println("Nombre: " + rival.getNombre());
						rival.setAtaque(metodosAlAtaque.generarNumeroPT());
						rival.setDefensa(metodosAlAtaque.generarNumeroPT());
						rival.setEsquivo(metodosAlAtaque.generarNumeroPT());
						rival.setVida(metodosAlAtaque.generarNumeroVida());
						rival.setTipo(metodosAlAtaque.cargadoArrayAleatorioTipos());
						System.out.println("Tipo: " + rival.getTipo());
					}
				
					esc.setTipo(metodosAlAtaque.cargadoArrayAleatorioTipos());
					System.out.println("El escenario es " + esc.getTipo());
					
					if (j1.getTipo () == esc.getTipo ()) {
						System.out.println("El escenario le favorece, sus estadisticas suben");
						j1.setAtaque(j1.getAtaque() + 2);
						j1.setDefensa(j1.getDefensa() + 2);
						j1.setEsquivo(j1.getEsquivo() + 2);
					}
					if (rival.getTipo () == esc.getTipo ()) {
						System.out.println("El escenario favorece al rival, sus estadisticas suben");
						rival.setAtaque(rival.getAtaque() + 2);
						rival.setDefensa(rival.getDefensa() + 2);
						rival.setEsquivo(rival.getEsquivo() + 2);
					}
				
				System.out.println("Que comience el combate");
				
				do {
				metodosAlAtaque.PresentarMenuCombate();
				opcion = teclado.nextInt();
				OpcionRival = random.nextInt(3)+1;
				
				switch (opcion) {
					case 1:
						if (opcion == OpcionRival) {
							j1.setVida((j1.getVida() - rival.getAtaque()));
							System.out.println("Tienes " +j1.getVida() + " de vida");
							
							rival.setVida((rival.getVida() - j1.getAtaque()));
							System.out.println("El rival tiene " + rival.getVida() + " de vida");
							
						}
						else if (OpcionRival == 2) {
							if (j1.getAtaque () > rival.getDefensa()) {
								rival.setVida((rival.getVida() - (j1.getAtaque() - rival.getDefensa())));
								System.out.println("El rival tiene " + rival.getVida() + " de vida");
								
							}
							else {
								j1.setVida((j1.getVida () - (rival.getDefensa() - j1.getAtaque())));
								System.out.println("Tienes " + j1.getVida () + " de vida");
							}
						}
						
						if (OpcionRival == 3) {
							j1.setVida((j1.getVida () - rival.getAtaque()));
							System.out.println("Tienes " + j1.getVida() + " de vida por el esquivo");
							
						}
					break;
					
					case 2:
						if (opcion == OpcionRival) {
							System.out.println("Ambos se defienden");
						}
						
						else if (OpcionRival == 1 && (j1.getDefensa () < rival.getAtaque())) {
							j1.setVida((j1.getVida() - (rival.getAtaque() - j1.getDefensa())));
							System.out.println("Tienes " + j1.getVida() + " de vida");
							
						}
							else {
								rival.setVida((rival.getVida () - (j1.getDefensa() - rival.getAtaque())));
								System.out.println("El rival tiene " + rival.getVida() + " de vida");
							}
					break;
						
					case 3:
						if (opcion == OpcionRival) {
							System.out.println("Ambos se esquivan");
						}
						
						else if (OpcionRival == 1) {
							rival.setVida((rival.getVida () - j1.getAtaque()));
							System.out.println("El rival tiene " + rival.getVida() + " de vida");
							
						}
							else {
								System.out.println("No resulta efectivo el movimiento usado");
							}
					break;
					}
				}
				while (j1.getVida () > 0 && rival.getVida() > 0);
			
		
			
			if (rival.getVida() <= 0) {
				System.out.println("Has derrotado a " + rival.getNombre());
				nuevorival = 's';
				victoria = victoria + 1;
				opcion = 1;
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
			}
		
			if (j1.getVida() <= 0) {	
			System.out.println("FIN DEL JUEGO");	
					do {
						System.out.println("Quieres jugar de nuevo?");
						respuesta = teclado.next().charAt(0);
					}
					while (respuesta != 's' && respuesta != 'n');
			}
		
		}
			
			break;
			
			case 2:
			System.out.println("En construccion");
			break;
			
			case 3:
				System.out.println("Nuestro personaje principal tiene un tipo elemental"+
				"que se le refuerza segun el escenario que haya salido y sus estadisticas"+
				"seran mostradas. Para el combate hay 3 opciones, atacar, defender o esquivar."+
				"Depende de lo que hagan en el combate, si los dos atacan gana el mas fuerte. Si "+
				"uno ataca y el otro defiende le devuelve el daño si supera su estadistica. Si esquiva" +
				"y el otro ataca no resultaria dañado");
			break;
			}
		}
		//Segun opcion elegida
		
		
				
	}
}


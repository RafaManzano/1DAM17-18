/*Nombre del programa: NoValidoBlackjackEstiloCompadre
 * Comentario: Jugaremos al blackjack y apostaremos dinero
 * 			   Las reglas serian:
 * 				- El jugador que mas se acerque sin pasarse al 21 ganaria la partida
 * 				- Cada jugador puede pedir las cartas que desee pero si se pasa se acaba la partida y ganaria el otro jugador
 * 				- Si se desea habria una partida final que seria todo o nada //En construccion 
 * Analisis:
 * 	Entrada: - cartajugador
 * 			 - plantarse
 * 			 - sumacarta
 * 			 - aleatorio
 * 			 - dinero
 * 			 - apuesta
 * 			 - cartapc
 * 			 
 * 			 
 * 
 * 	Salida: - Mensaje si pierde jugador y sumar dinero 
 * 			- Mensaje si gana jugador  y restar dinero
 * 
 *	Requisitos: - El numero aleatorio es entre 1 y 10
 * 				- Para plantarse solo vale solo p
 * 				- Para elegir carta vale solo c
 * 				- El dinero tiene que ser mayor que 0
 * 				- La apuesta tiene que ser mayor que 0 pero menor que dinero
 * ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * 
* 	PG
* 		Inicio
* 		LeeryValidar
* 			Repetir
* 				Repetir
* 					RealizarPartida *
* 					MostrarGanador *
* 				Mientras apuesta mayor que 0 y menor o igual que dinero
* 				FinMientras
*			 Mientras dinero sea mayor que 0
* 			FinMientras
* 		Fin
* 	
*/

import java.io.*; //Siempre lo importamos
import java.util.*; //Lo importamos para la clase Scanner y la clase Random

public class NoValidoBlackjackEstiloCompadre {
	public static void main (String [] args){
		int dinero = 0;
		char opcion = ' ';
		int sumacarta = 0;
		int cartajugador = 0; 			
		int aleatorio = 0;
  		int apuesta = 0;
  		int cartapc = 0;
  		int sumacartapc = 0;
  		char respuesta = ' ';
  		  		
		
		System.out.println("Bienvenido al casino, esta noche actuara la niña de los rizos en el cafe bar, no se la pierdan");
		Scanner teclado = new Scanner (System.in);
		Random random = new Random ();
		do {
			System.out.println("Quieres entrar en el casino (S/N)");
			respuesta = teclado.next().charAt(0);
		}
		while (respuesta != 's' && respuesta != 'n');
		
		while (respuesta == 's'){
		
		while (dinero <= 0) {	
		do {
			System.out.println("Cuanto dinero quiere que le cambie en fichas");
			dinero = teclado.nextInt();
			if (dinero < 0){
				System.out.println("Eso no existe, reviselo por favor");
			}
			else if (dinero == 0) {
			System.out.println("No tiene dinero, tenemos un banco muy cerca si lo desea");
			}
				else {
					System.out.println("De acuerdo");
				}
			
			}	
			while (dinero <= 0);
		}
			
		//System.out.println("Entra");
		
		
			do {
				System.out.println("Haga su apuesta para comenzar la partida");
				apuesta = teclado.nextInt();

			}
			while (apuesta <= 0 || apuesta > dinero);
			//System.out.println("Entra");
			sumacarta = 0;
			sumacartapc = 0;
			do{
				cartajugador = random.nextInt(10)+1;
				//resguardosBlackjack.RealizarJugada(cartajugador);
				System.out.println("Esta seria su carta " + cartajugador);
				sumacarta = sumacarta + cartajugador;
				//resguardosBlackjack.ComprobarCartaJugador(sumacarta);
				MetodosBlackjack.ComprobarCartaJugador(sumacarta);
				System.out.println("Total: " + sumacarta);
				/*if (MetodosBlackjack.ComprobarCartaJugador(sumacarta) == false){
					System.out.println("Te has pasado, has perdido");
					//opcion = 'c';
				}
				
				else {}*/
				if(MetodosBlackjack.ComprobarCartaJugador(sumacarta)){
					do {
					System.out.println("Desea otra carta o prefiere plantarse (Para carta elija c y para plantarse eliga p)");
					opcion = teclado.next().charAt(0);
					}
				while (opcion != 'c' && opcion != 'p');
				}
				else {
					System.out.println("Se ha pasado, ha perdido");
					dinero = dinero - (apuesta);
					System.out.println("Su monedero: " + dinero);
				}
			} 
			while(opcion == 'c' && MetodosBlackjack.ComprobarCartaJugador(sumacarta));
			
			if  (sumacarta <= 21){
				do{
				cartapc = random.nextInt(10)+1;
				System.out.println("Mi carta es " + cartapc);
				sumacartapc = sumacartapc + cartapc;
				MetodosBlackjack.ComprobarCartaJugador(sumacartapc);
				System.out.println("Total: " + sumacartapc);
				}
				while (sumacartapc <= 17);
				
				if(sumacartapc>21){
					System.out.println("He perdido");
					dinero = dinero + (apuesta * 2);
					System.out.println("Su monedero: " + dinero);
				}
				 
				if (sumacarta > sumacartapc && sumacarta <= 21 && sumacartapc <= 21){
					System.out.println("Enhorabuena ha ganado");
					dinero = dinero + (apuesta * 2);
					System.out.println("Su monedero: " + dinero);
				}
					if (sumacarta == sumacartapc && sumacarta <= 21 && sumacartapc <= 21) {
						System.out.println("Hemos empatado");
					}
						if (sumacarta < sumacartapc && sumacarta <= 21 && sumacartapc <= 21) {
							System.out.println("Ha perdido");
							dinero = dinero - (apuesta);
							System.out.println("Su monedero " + dinero);
						}
					}
	
		do {
			System.out.println("Desea otra partida mas o quiere jugar una partida final (Si/no o para partida final pulse f)");
			respuesta = teclado.next().charAt(0);
		}
		while (respuesta != 's' && respuesta != 'n' && respuesta != 'f');
		if (respuesta == 'f') {
			System.out.println("En construccion");
		}
	
}
}
}




			


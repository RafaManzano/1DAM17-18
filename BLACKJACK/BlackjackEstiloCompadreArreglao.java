/* Nombre del programa: BlackjackEstiloCompadre
 * Comentario: Jugaremos al blackjack y apostaremos dinero
 * 			   Las reglas serian:
 * 				- El jugador que mas se acerque sin pasarse al 21 ganaria la partida
 * 				- Cada jugador puede pedir las cartas que desee pero si se pasa se acaba la partida y ganaria el otro jugador
 * 				- Si se desea habria una partida final que seria todo o nada
 * Analisis:
 * 	Entrada: - cartajugador
 * 			 - plantarse
 * 			 - sumacarta
 * 			 - aleatorio
 * 			 - dinero
 * 			 - apuesta
 * 			 - cartapc
 * 			 - ultimaPartida
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
 * -----------------------------------------------------------------------------------------------------------------------------
 * 
 * NIVEL 0
 * 	PG
 * 		Inicio
 * 			Leer y Validar partida
 * 			Mientras la respuesta sea si
 * 				Leer y Validar Dinero
 * 				Mientras tenga dinero
 * 				Repetir
 * 					Leer y Validar Apuesta
 * 					Realizar Partida Jugador
 * 					Realizar partida PC
 * 					Mostrar Ganador 
 * 					Si tienes dinero
 * 						Preguntar si seguir jugando
 * 					FinSi 
 * 				Mientras tengas dinero y quieras seguir jugando
 * 				Leer y validar partida	
 * 			FinMientras
 * 		Fin
---------------------------------------------------------------------------------------------------------------------------------
 * Realizar Partida Jugador
 * 	Inicio
 * 		Repetir
 * 			Realizar la jugada, mostrarla y sumarla a la mano 
 * 			ComprobarCarta *
 * 			Si es mayor que 21
 * 				Pierde automaticamente
 * 			Sino
 * 			Preguntar y validar si quiere plantarse o pedir carta
 * 		Mientras no quiera plantarse y no se haya pasado de 21
 * 	Fin
 * 
--------------------------------------------------------------------------------------------------------------------------------- 
 * Realizar partida PC
 * Inicio
 * 	Mientras la partida jugador sea menor que 21
 * 		Repetir
 * 			Realizar la tirada y sumarla a la mano
 * 			ComprobarCarta *
 * 		Mientras la carta esta entre 17 y 21
 * 	FinMientras 
 * Fin
---------------------------------------------------------------------------------------------------------------------------------- 
 * Mostrar Ganador 
 * 	Inicio
 * 		Si el jugador gana
 * 			Sumar el dinero
 * 			Mensaje ganador
 * 		Sino 
 * 			Si el jugador pierde
 * 				Restar el dinero
 * 				Mensaje perdedor
 * 			Sino 
 * 				Informar del empate
 * 			Fin si
 * 		Fin si
 * 	Fin
---------------------------------------------------------------------------------------------------------------------------------
 */

import java.io.*; //Siempre lo importamos
import java.util.*; //Lo importamos para la clase Scanner y la clase Random

public class BlackjackEstiloCompadreArreglao {

    public static void main(String[] args) {
        int dinero = 0;
        char opcion = ' ';
        int sumacarta = 0;
        int cartajugador = 0;
        int aleatorio = 0;
        int apuesta = 0;
        int cartapc = 0;
        int sumacartapc = 0;
        char respuesta = ' ';
        boolean ultimaPartida = false;

        System.out.println("Bienvenido al casino, esta noche actuara la peque de los rizos en el cafe bar, no se la pierdan");
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        //Leer y Validar partida
        do {
            System.out.println("Quieres entrar en el casino (S/N)");
            respuesta = teclado.next().charAt(0);
        }
        while (respuesta != 's' && respuesta != 'n');

        //Leer y validar dinero
        do {
            System.out.println("Cuanto dinero quiere que le cambie en fichas");
            dinero = teclado.nextInt();
        }
        while (dinero < 0);
        //Mientras la respuesta sea si
        while (respuesta == 's' && dinero > 0) {
            //Mientras tenga dinero

            //System.out.println("Entro");

            //Leer y Validar Apuesta
            if (ultimaPartida == false) {
                do {
                    System.out.println("Haga su apuesta para comenzar la partida");
                    apuesta = teclado.nextInt();
                }
                
                while (apuesta <= 0 || apuesta > dinero);
                
				}
             else {
                apuesta = dinero;
            }
            
            sumacarta = 0;
            sumacartapc = 0;
            //System.out.println("Palante");

            //Realizar Partida Jugador
            //Repetir
            do {
                //Realizar la jugada, mostrarla y sumarla a la mano 
                cartajugador = random.nextInt(10) + 1;
                System.out.println("Esta seria su carta " + cartajugador);
                sumacarta = sumacarta + cartajugador;
                System.out.println("Total: " + sumacarta);


                //ComprobarCarta *
                //resguardosBlackjack.ComprobarCartaJugador(sumacarta);
                MetodosBlackjack.ComprobarCartaJugador(sumacarta);


                //Preguntar y validar si quiere plantarse o pedir carta
                //System.out.println("Desea otra carta o prefiere plantarse (Para carta elija c y para plantarse eliga p)");
                //opcion = teclado.next().charAt(0);

                if (sumacarta > 21) { //Si es mayor que 21
                    System.out.println("Ha perdido");
                    dinero = dinero - (apuesta);
                    System.out.println("Su monedero " + dinero);
                } 
                else { //Sino
                    //Preguntar y validar si quiere plantarse o pedir carta
                    do {
                        System.out.println("Desea otra carta o prefiere plantarse ([c] Nueva carta  [p] Plantarse)");
                        opcion = teclado.next().charAt(0);
                    }
                    while (opcion != 'c' && opcion != 'p');
                }
            }
            //Mientras no quiera plantarse y no se haya pasado de 21
            while (opcion != 'p' && MetodosBlackjack.ComprobarCartaJugador(sumacarta));


            if (sumacarta <= 21) { //Mientras la partida jugador sea menor que 21
                do {
                    //Repetir
                    //Realizar la tirada y sumarla a la mano
                    cartapc = random.nextInt(10) + 1;
                    System.out.println("Mi carta es " + cartapc);
                    sumacartapc = sumacartapc + cartapc;
                    System.out.println("Total: " + sumacartapc);
                }
                //Mientras la carta sea menor a 17
                while (sumacartapc <= 17);


                if (sumacartapc > 21) {
                    System.out.println("Enhorabuena has ganado");
                    dinero = dinero + apuesta;
                    System.out.println("Su monedero: " + dinero);
                }

                //Mostrar Ganador 

                if (sumacarta > sumacartapc && sumacarta <= 21 && sumacartapc <= 21) { //Si el jugador gana
                    System.out.println("Enhorabuena has ganado"); //Mensaje ganador

                    dinero = dinero + apuesta; //Sumar el dinero
                    System.out.println("Su monedero: " + dinero); //Mostrar dinero
                }
                
                if (sumacarta == sumacartapc && sumacarta <= 21 && sumacartapc <= 21) {
                    System.out.println("Hemos empatado"); //Mensaje empate
                    System.out.println("Su monedero " + dinero);
                }
                
                if (sumacarta < sumacartapc && sumacarta <= 21 && sumacartapc <= 21) {
                    System.out.println("Has perdido");
                    dinero = dinero - (apuesta);
                    System.out.println("Su monedero " + dinero);
                }
            }
            //do {
            //System.out.println("Desea otra partida mas o quiere jugar una partida final (Si/no o para partida final pulse f)");
            //respuesta = teclado.next().charAt(0);
            //}
            //while (respuesta != 's' && respuesta != 'n' && respuesta != 'f');

            //if (respuesta == 'f') {
            //	System.out.println("En construccion");
            //}	

            if (ultimaPartida == false) {
                do {
                    System.out.println("Desea otra partida mas o quiere jugar una partida final (Si/no o para partida final pulse f)");
                    respuesta = teclado.next().charAt(0);
                }
                
                while (respuesta != 's' && respuesta != 'n' && respuesta != 'f');
                
                if (respuesta == 'f') {
					if (dinero > 0) {
                    ultimaPartida = true;
                    respuesta = 's';
                    System.out.println("Es su ultima partida, nos jugamos todo el dinero");
					}
					else {
						System.out.println("La partida no puede jugarse puesto que no tienes dinero. Hasta luego. Seguriidaad!!");
					}
                }
            } 
            else {
                respuesta = 'n';
            }
            if (dinero <= 0 && respuesta == 's') {
				do {
				System.out.println("Cuanto dinero quiere que le cambie en fichas");
				dinero = teclado.nextInt();
				}
				while (dinero < 0);
				}

            //System.out.println(respuesta);			

            //do {
            //System.out.println("Desea otra partida mas o quiere jugar una partida final (Si/no o para partida final pulse f)");
            //respuesta = teclado.next().charAt(0);
            //}
            //while (respuesta != 's' && respuesta != 'n' && respuesta != 'f');

            //if (respuesta == 'f') {
            //System.out.println("En construccion");

        }
    }
}


//"[c] Nueva carta  [p] Plantarse"

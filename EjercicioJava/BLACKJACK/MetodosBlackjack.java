/* MetodosBlackjack
 *
 * MT:
 * 	Necesidades: Una carta
 * 	Devoluciones: Una respuesta
 * 	Necesidades/Devoluciones: No hay
 * 	Requisitos: La carta tiene que ser entre 1 y 10
 * 
 * Interfaz:
 * 	Nombre: ComprobarCartaJugador
 * 	Comentario: Comprobar si la carta es mayor que 21
 * 	Cabecera: boolean ComprobarCartaJugador(int cartajugador){
 * 	Precondiciones: La carta tiene que ser entre 1 y 10
 * 	Entrada: La carta del jugador
 * 	Salida: Una respuesta
 * 	Entrada/Salida: No hay
 * 	Postcondiciones: La respuesta va a ser verdadero o falso
*/
public class MetodosBlackjack{
public static boolean ComprobarCartaJugador (int sumacarta){
	boolean respuesta = true;
	
	if(sumacarta > 21){
		respuesta = false;
	}
	
	return respuesta;
	}
}

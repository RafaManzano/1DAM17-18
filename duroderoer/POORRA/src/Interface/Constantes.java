package Interface;

import Clase.Jugador;

public interface Constantes {
	
	public final int NUMERO_PARTIDO = 2;
	
	public final int NUMERO_JORNADAS = 38;
	public final double DINERO_INICIAL = 45;
	
	public final int RESULTADO_MINIMO = 0;
	public final int RESULTADO_MAXIMO = 4;
	
	public final double DINERO_CADA_JORNADA = 1;
	
	public final Jugador[] jugadores = {
			new Jugador ("Make"),
			new Jugador ("Juanma"),
			new Jugador ("Fernando"),
			new Jugador ("Alberto"),
			new Jugador ("Lorente"),
			new Jugador ("Adrian"),
			new Jugador ("Maria"),
			new Jugador ("Parra"),
			new Jugador ("Pablo"),
			new Jugador ("Prieto"),
			new Jugador ("Ruben"),
			new Jugador ("Jony"),
			new Jugador ("Fran"),
			new Jugador ("Isidoro"),
			new Jugador ("Rafa")
	};

}

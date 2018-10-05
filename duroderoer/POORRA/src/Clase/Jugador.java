package Clase;

import Interface.Constantes;

public class Jugador implements Constantes {
	//Propiedades 
	private String nombre;
	private double dinero;
	private int porrasGanadas;
	private String [] resultados;
	
	
	//Constructor
	public Jugador () {
		String nombre = " ";
		double dinero = 0.0;
		int porrasGanadas = 0;
		
	}
	
	public Jugador (String nombre, double dinero, int porrasGanadas) {
		this.nombre = nombre;
		this.dinero = dinero;
		this.porrasGanadas = porrasGanadas;
	}
	
	
}

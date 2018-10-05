/*
 * Tipo Racional
 * 
 * Propiedades Basicas
 * 	Numerador
 * 		o Tipo: double
 * 		o ¿Consultable?: Si
 * 		o ¿Modificable?: Si
 * 
 * 	Denominador
 *   	o Tipo: double
 * 		o ¿Consultable?: Si
 * 		o ¿Modificable?: Si
 * 
 * Propiedades Derivadas
 * 	SumarEntero
 * 		o Tipo: double
 * 		o ¿Consultable?: Si
 * 		o ¿Modificable?: No
 * 
 * 	Resta
 * 		o Tipo: double
 * 		o ¿Consultable?: Si
 * 		o ¿Modificable?: No
 * 
 * 	Multiplicar
 * 		o Tipo: double
 * 		o ¿Consultable?: Si
 * 		o ¿Modificable?: No
 * 
 * 	Dividir
 * 		o Tipo: double
 * 		o ¿Consultable?: Si
 * 		o ¿Modificable?: No
 * 
 * Get and set
 * 	Numerador
 * 		o double getNumerador ();
 * 		o void setNumerador (double newNum);
 * 
 * 	Denominador
 *   	o double getDenominador ();
 * 		o void setDenomindador (double newDen);
 * 		
 * 
 * 	SumarEntero
 * 		o double ? getSumarEntero ();
 * 
 * 	Resta
 * 		o double getResta ();
 * 
 * 	Multiplicar
 * 		o double getMultiplicar ();
 * 
 * 	Dividir
 * 		o double getDividir ();
 *
 * Requisitos: Todos son mayores que 0.0
 * 
 * No hay metodos añadidos (De momento)
 * 
*/


public class Racional {
	
	//Propiedades
	private double numerador;
	private double denominador;
	
	//Constructor
	public Racional () {
		numerador = 0.0 	
	}
	
	public Racional (double numerador, double denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public Racional (Racional Fraccion) {
		this.numerador = Fraccion.getNumerador;
		this.denominador = Fraccion.getDenominador;
	}
	
	//Metodos
	//Numerador
	
		
}


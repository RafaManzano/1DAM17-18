/*
 * Tipo Dimension
 * Propiedades Basicas: 
 * 	Alto
 * 		Tipo: Double
 * 		¿Consultable?: Si
 * 		¿Modificable?: Si
 * 	Ancho
 *   	Tipo: Double
 * 		¿Consultable?: Si
 * 		¿Modificable?: Si
 * 	Largo
 *   	Tipo: Double
 * 		¿Consultable?: Si
 * 		¿Modificable?: Si
 *
 * Propiedades Derivadas
 * 	CalcularVolumen
 * 		Tipo: Double
 * 		¿Consultable?: Si 	 
 * 
 * Propiedades Compartidas
 * 	No hay
 * 
 * Get and Set
 * 	Alto
 * 		Double getAlto ();
 * 		void setAlto (double newAlto);
 * 
 * 	Ancho
 * 		Double getAncho ();
 * 		void setDireccion (double newAncho);
 * 
 * 	Largo
 * 		Double getLargo();
 * 		void setLargo (double newLargo);
 * 
 * 	CalcularVolumen
 * 		Double getCalVol ();
 * 
 * Requisitos
 * 	Alto: Mayor que 0
 * 	Ancho: Mayor que 0
 * 	Largo: Mayor que 0
 * 
 */


public class Dimension {
	//Propiedades
	private double Alto;
	private double Ancho;
	private double Largo;
	
	//Constructor
	public Dimension () { //Por defecto
		double Alto = 0.0;
		double Ancho = 0.0;
		double Largo = 0.0;
	}
	
	public Dimension (double Alto, double Ancho, double Largo) { //Con parametros
		this.Alto = Alto;
		this.Ancho = Ancho; 
		this.Largo = Largo;
	}
	
	public Dimension (Dimension dim){ //De copia
		this.Alto = dim.getAlto();
		this.Ancho = dim.getAncho ();
		this.Largo = dim.getLargo ();
	}
	
	//Metodos
	//Alto
	public double getAlto () { //GET
		return this.Alto;
	}
	
	public void setAlto (double newAlto) { //SET
		this.Alto = Alto;
	}
	
	// Ancho
	public double getAncho () { //GET
		return this.Ancho;
	}
	
	public void setAncho (double newAncho) { //SET
		this.Ancho = Ancho;
	}
	
	//Largo
	public double getLargo () { //GET
		return this.Largo;
	}
	
	public void setLargo(double newLargo) { //SET
		this.Largo = Largo;
	}
	
	//CalcularVolumen
	public double getCalVol () {
		double volumen;
		volumen = getLargo() * getAlto () * getAncho ();
		return volumen;
	}
	
}


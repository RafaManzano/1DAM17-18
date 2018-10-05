/*
 * 1. Tipo Rectangulo
 * 	
 * 
 * 2. Propiedades Basicas  
 * 	  Base
 * 		o Tipo: Double
 * 		o ¿Consultable? : Si
 * 		o ¿Modificable? : Si
 * 
 * 	  Altura
 * 		o Tipo: Double
 * 		o ¿Consultable? : Si
 * 		o ¿Modificable? : Si
 * 
 * 3. Propiedades derivadas
 * 	  Area
 * 		o Tipo: Double
 * 		o ¿Consultable? : Si
 * 		o ¿Modificable? : No
 * 
 * 	  Perimetro
 *   	o Tipo: Double
 * 		o ¿Consultable? : Si
 * 		o ¿Modificable? : No
 * 
 * 4. Compartidas 
 * 	No hay
 * 
 * 5. Base
 * 		o double get Base ();
 * 		o void set Base (double newBase);
 * 
 * 	  Altura
 *  	o double get Altura ();
 * 		o void set Altura (double newAltura);
 * 
 * 	  Area
 *   	o double get Area ();
 * 
 *	  Perimetro
 *   	o double get Perimetro ();
 * 
 * 6. Mayor que 0 tanto altura como base
 * 7. No hay
 * 		
 * 
 */


public class Rectangulo {
	//Propiedades
	private double base;
	private double altura; 
	
	//Constructor
	
	public Rectangulo () {
		base = 0;
		altura = 0;
	}

	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public Rectangulo(Rectangulo rec){
		 this.base = rec.getBase();
		 this.altura = rec.getAltura();
	}
	
	//Metodos
	public double getBase (){
		return this.base;
	}

	public void setBase (double base)throws ExcepcionRectangulo{
		if (base > 0) {
			this.base = base;
		}
		else {
			throw new ExcepcionRectangulo("La base tiene que ser mayor que 0");
		}
	}

	public double getAltura () {
		return this.altura;
	}
	
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	public double getArea() {
		double area = 0.0;
		area = getAltura() * getBase();
		return area;
	}
	
	public double getPerimetro () {
		double perimetro = 0.0;
		perimetro = (getAltura() * getBase()) * 2;
		return perimetro;
	}
	
	
}


/*
 * 1. Tipo Potencia
 * 	o Base
 * 	o Exponente
 * 
 * 2. Base
 * 		o Tipo: Entero -> Int
 * 		o ¿Consultable? -> Si
 * 		o ¿Modificable? -> Si
 * 
 * 	  Exponente
 * 		o Tipo: Entero -> Int
 * 		o ¿Consultable? -> Si
 * 		o ¿Modificable? -> Si
 * 
 * 3. CalcularPotencias
 * 		o Tipo: Entero -> Int
 * 		o ¿Consultable? -> Si
 * 		o ¿Modificable? -> No
 * 
 * 4. No hay
 * 5. Base
 * 		o int get Base ();
 * 		o void set Base (int newBase);
 * 
 * 	  Exponente
 * 		o int get Exponente ();
 * 		o void set Exponente (int newExponente);
 * 
 * 	  CalcularPotencias
 * 		o int CalcularPotencias (int base, int exponente)
 */


public class Potencia {
	
//Propiedades
private int base;
private int exponente;

//Constructor
	public  Potencia () {
		base = 0;
		exponente = 0;
	}

	public Potencia (int base, int exponente) {
		this.base = base;
		this.exponente = exponente;
	}

	public Potencia(Potencia p){
		 this.base = p.getBase();
		 this.exponente = p.getExponente();
	}

//Metodos
	public int getBase (){
		return this.base;
	}

	
	public void setBase (int base)throws ExcepcionPotencia{
		
		if(base>0){
			
			this.base = base;
		}
		else{
			throw new ExcepcionPotencia("La base tiene que ser mayor que 0");
		}
	}

	public int getExponente () {
		return this.exponente;
	}
	
	public void setExponente(int exponente){
		this.exponente = exponente;
	}
	
	public int CalcularPotencia() {
		int resultado = this.base ^ this.exponente;
		return resultado;
	}
	

}


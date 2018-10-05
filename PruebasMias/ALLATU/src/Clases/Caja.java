package Clases;

/*
 * Tipo Caja
 * 
 * Precio
 *  Tipo: Int
 *  Cons: Si
 *  Mod: Si
 *  
 * Numero
 * 	Tipo: Int
 *  Cons: Si
 *  Mod: Si
 *  
 * Propiedades Derivadas
 *  No hay
 *  
 * Propiedades Compartidas
 *  No hay
 *
 *  GET AND SET
 *  Precio
 *   public int getPrecio ();
 *   public void setPrecio (int Precio);
 *  
 *  Numero
 *   public int getNumero ();
 *   public void setNumero (int Numero);
 */

public class Caja {

	//Atributos
	private int precio;
	private int numero;
	
	//Constructor
	public Caja () { //Por defecto
		int precio = 0;
		int numero = 0;
	}
	
	public Caja (int precio, int numero) { //Con parametros
		this.precio = precio;
		this.numero = numero;
	}
	
	public Caja (Caja c) {
		this.precio = c.precio;
		this.numero = c.numero;
	}

	
	//Metodos
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}

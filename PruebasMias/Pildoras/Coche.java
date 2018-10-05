/*
*/


public class Coche {
	//Propiedades Basicas
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	private String color;
	
	//Constructor
	public Coche () { //Por defecto
		ruedas = 0;
		largo = 0;
		ancho = 0;
		motor = 0;
		peso = 0;
	}
	
	//Get
	public int getLargo () {
		return this.largo;
	}
	
	public void setColor (String color_coche) {
		this.color = color_coche;
	}
	
	public String getColor () {
		return this.color;
	}
}


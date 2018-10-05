package Clases;

import Excepciones.excepcionFicha;

/*
 * Interfaz
 * Tipo Ficha
 * Propiedades Basicas
 * Color 
 * 	Tipo: String
 * 	Consultable: Si
 * 	Modificable: Si
 * 
 * Propiedades Derivadas
 * No hay
 * 
 * Propiedades Compartidas
 * No hay
 * 
 * GET AND SET 
 * public String getColor ();
 * public void setColor (String color);
 * 
 * Requisitos:
 * 
 */
public class Ficha implements Cloneable {
	//Propiedades
	private String color;
	
	//Constructor
	public Ficha () {  //Por defecto
		String color = " ";
	}
	
	public Ficha (String color) { //Con parametros
		this.color = color;
	}
	
	public Ficha (Ficha f) {
		this.color = f.getColor();
	}

	
	//Metodos
	public String getColor() {
		return color;
	}

	public void setColor(String color) throws excepcionFicha {
		if(color == "azul" || color == "rojo") {
			this.color = color;
		}
		else {
			throw new excepcionFicha("El color tiene que ser azul o rojo (En minuscula todo)");
		}
	}
	
	//toString
	@Override
	public String toString () {
		return color;
	}
	
	//hashCode
	@Override
	public int hashCode () {
		return color.hashCode() * 331;
	}
	
	//Equals
	@Override
	public boolean equals (Object obj) {
		boolean ficha = false;
		if (this == obj) {
			ficha = true;
		}
		else if(obj != null && obj instanceof Ficha) {
			Ficha otro = (Ficha) obj;
			if(this.color == otro.color) {
				ficha = true;
			}
		}
		return ficha;
	}

	//Clone
	@Override
	public Ficha clone () {
	Ficha copia = null;
	try	{
		copia = (Ficha)super.clone();
	}
	catch (CloneNotSupportedException es){
		System.out.println("Error en la copia, devuelve un null.");
	}
	return copia;
	}
}

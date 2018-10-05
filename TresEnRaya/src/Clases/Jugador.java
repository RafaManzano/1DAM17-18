package Clases;

import Excepciones.excepcionFicha;

/*
 * Tipo Jugador
 * Propiedades Basicas
 * Nombre
 * 	Tipo String
 * 	Consultable: Si
 * 	Modificable: Si
 * 
 * Ficha 
 * 	Tipo Ficha
 * 	Consultable: Si
 * 	Modificable: No
 * 
 * Propiedades Derivadas
 * No hay
 * 
 * Propiedades Compartidas
 * No hay
 * 
 * GET AND SET
 * public String getNombre ();
 * public void setNombre (String nombre);
 * 
 * Utilizaremos el patron de legacion de Ficha
 * 
 * Requisitos
 * No hay
 * 
 * Metodos añadidos
 * No hay
 */

public class Jugador implements Cloneable {
	//Propiedades
	private String nombre;
	private Ficha ficha;
	String color = " ";
	
	//Constructor
	public Jugador () { //Por defecto
		String nombre = " ";
		Ficha ficha = new Ficha ();
	}
	
	public Jugador (String nombre, String color) { //Con parametros
		this.nombre = nombre;
		this.ficha = new Ficha (color);
	}
	
	public Jugador (Jugador j) {
		this.nombre = j.getNombre();
		this.ficha = new Ficha (j.ficha);
	}

	
	
	//Metodos
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Usamos el patron de legacion
	public String getFichaColor () {
		return this.ficha.getColor();
	}
	
	public void setFichaColor (String color) throws excepcionFicha {
		if (color == "azul" || color == "rojo") {
			this.ficha.setColor(color);
		}
		else {
			throw new excepcionFicha("El color tiene que ser azul o rojo (En minuscula todo)");
		}
	}
	
	//toString
	@Override
	public String toString () {
		return nombre + "," + ficha.toString();
	}
	
	//hashCode
	@Override
	public int hashCode () {
		return nombre.hashCode() * ficha.hashCode() * 331;
	}
	
	//Equals
	@Override
	public boolean equals (Object obj) {
		boolean jugador = false;
		if (this == obj) {
			jugador = true;
		}
		else if (obj != null && obj instanceof Jugador) {
			Jugador otro = (Jugador) obj;
			if(this.getNombre() == otro.getNombre()) {
				jugador = true;
			}
		}
		return jugador;
	}
	
	//Clone
	@Override
	public Jugador clone () {
		Jugador jugador = null;
		try {
			jugador = (Jugador) super.clone();
		}
		catch(CloneNotSupportedException error) {
			System.out.println("Objeto no clonado, devuelve null");
		}
		return jugador;
	}
	
	//Deep clone
	public Jugador deepClone () {
		Jugador copia = null;
		
		try{
			copia = (Jugador)super.clone();
			copia.ficha = this.ficha.clone();
		}
		catch(CloneNotSupportedException error){
			System.out.println("Objeto no clonado,devuelve un null");
		}
		return copia;
	}
}

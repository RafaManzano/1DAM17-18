package Clases;
/*
 * Interfaz
 * Tipo Ficha
 * Propiedades Basicas
 * Color // Es un ENUM
 * 	Tipo: ENUM
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
 * public String getColor ();
 * 
 * Requisitos:
 * 
 */
public class FichaMAL {

	private ENUM.Color Color;
	
	
	//Constructor
	public FichaMAL () { //Por defecto
	}
	
	public FichaMAL(ENUM.Color Color) { //Con parametros
		this.Color = Color;
	}
	
	public FichaMAL (FichaMAL f) { //De copia
		this.Color = f.Color;
	}

	
	//Metodos
	public ENUM.Color getColor() {
		return Color;
	}

	public void setColor(ENUM.Color color) {
		Color = color;
	}
	
	
	
	
	
	
	
}

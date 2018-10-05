/*
 * Interfaz
 * 	Tipo Jugador
 * 
 * 	Propiedades Basicas
 * 	Nombre
 * 		Tipo: String
 * 		Cons: Si
 * 		Mod: Si
 * 
 * 	Puntuacion
 * 		Tipo: int
 * 		Cons: Si
 * 		Mod: Si
 * 
 * 	Propiedades Derivadas
 * 		No hay
 * 
 * 	Propiedades Compartidas
 * 		No hay
 * 
 * 	Get And Set
 * 	Nombre
 * 		public String nombre ();
 * 		public void nombre (String nombre);
 * 
 * 	Puntuacion
 * 		public int puntuacion ();
 * 		public void puntuacion (int puntuacion);
 * 
 * 	Requisitos:
 * 		Puntuacion tiene que ser mayor que 0
 * 
 * 
 * 
 * 
 */

package clase;

public class Jugador implements Cloneable {
	
	//Propiedades
	private String nombre;
	private int puntuacion;
	
	//Constructor
	public Jugador () { //Por defecto
		String nombre = " ";
		int puntuacion = 0;
	}
	
	public Jugador (String nombre, int puntuacion) {
		this.nombre = nombre;
		this.puntuacion = puntuacion;
	}
	
	public Jugador (Jugador j) {
		this.nombre = j.getNombre();
		this.puntuacion = j.getPuntuacion();
	}


	
	//Metodos
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	@Override
	public String toString() {
		return nombre + "," + puntuacion ;
	}

	@Override
	public int hashCode() {
		int prime = 105;
		int result = 112;
		result = prime * result + puntuacion * prime;
		return result;
	}

	@Override
	public  Jugador clone () {
		Jugador copia = null;
		try {
			copia = (Jugador)super.clone();
		}
		catch(CloneNotSupportedException error) {
			System.out.println("Objeto no clonado, devuelve null");
		}
		return copia;
	}
	
	@Override
	public boolean equals (Object obj) {
		boolean jugador = false;
		if (this == obj) {
			jugador = true;
		}
		
		else if (obj != null && obj instanceof Jugador) {
			Jugador elotro = (Jugador)obj;
			if (this.nombre == elotro.getNombre()) {
					jugador = true;
			}
				
		}
		return jugador;
	}
}

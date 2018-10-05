/*
 * Tipo Procesador
 * Modelo: String cons, mod
 * Velocidad: double cons, mod
 * 
 * Propiedades Derivadas
 * 	No hay
 * 
 * Propiedades Compartidas
 * 	No hay
 * 
 * Get/Set
 * Tamanho
	String getModelo ();
	void setModelo (String modelo);
	
 * Velocidad
 * 	double getVelocidad ();
 * 	void setVelocidad (double Velocidad); 
 * 
 * Requisitos
 * Velocidad tiene que ser mayor que 0
 * 
 * 
 */


public class Procesador implements Cloneable {
	//Propiedades 
	private String modelo;
	private double velocidad;
	
	//Constructor
	public Procesador () {
		String modelo = " ";
		double velocidad = 0.0;
	}
	
	public Procesador (String modelo, double velocidad) {
		this.modelo = modelo;
		this.velocidad = velocidad;
	}
	
	public Procesador (Procesador p) {
		this.modelo = p.getModelo ();
		this.velocidad = p.getVelocidad ();
	}
	
	//Metodos
	public String getModelo () {
		return this.modelo;
	}
	
	public void setModelo (String modelo) {
		this.modelo = modelo;
	}
	
	public double getVelocidad () {
		return this.velocidad;
	}
	
	public void setVelocidad (double velocidad) throws ExcepcionProcesador {
		if (velocidad > 0) {
			this.velocidad = velocidad;
		}
		else {
			throw new ExcepcionProcesador ("La velocidad no puede ser menor que 0");
		}
	}
	
	//toString
	@Override
	public String toString () {
		return "Modelo: " + modelo + " y, Velocidad: " + velocidad;
	}
	
	//hashCode
	@Override
	public int hashCode () {
		return (int)velocidad * 87 - (int)velocidad * 997  - (int)velocidad;
	}
	
	//Clonar
	@Override
	public Procesador clone () {
		Procesador copia = null;
		try {
			copia = (Procesador)super.clone();
		}
		catch(CloneNotSupportedException error) {
			System.out.println("Objeto no clonado, devuelve null");
		}
		return copia;
	}
	
}


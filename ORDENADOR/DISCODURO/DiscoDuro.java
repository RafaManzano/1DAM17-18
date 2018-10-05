/*
 * Tipo DiscoDuro
 * Tamaño: int cons, mod
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
	int getTamanho ();
	void setTamanho (int Tamanho);
	
 * Velocidad
 * 	double getVelocidad ();
 * 	void setVelocidad (double Velocidad); 
 * 
 * Requisitos
 * Tamanho tiene que ser mayor que 0
 * Velocidad tiene que ser mayor que 0
 * 
 * 
 */


public class DiscoDuro implements Cloneable, Comparable <DiscoDuro> {
	
	//Propiedades
	private int tamanho;
	private double velocidad;
	
	//Constructor
	public DiscoDuro () {
		this.tamanho = 0;
		this.velocidad = 0.0;
	}
	
	public DiscoDuro (int tamanho, double velocidad) {
		this.tamanho = tamanho;
		this.velocidad = velocidad;
	}
	
	public DiscoDuro (DiscoDuro d) {
		this.tamanho = d.getTamanho();
		this.velocidad = d.getVelocidad();
	}
	
	//Metodos
	//Tamanho
	public int getTamanho (){
		return this.tamanho;
	}
	
	public void setTamanho (int tamanho)throws ExcepcionDiscoDuro {
		if (tamanho > 0) {
		this.tamanho = tamanho;
		}
		
		else {
			throw new ExcepcionDiscoDuro ("El tamaño tiene que ser superior 0");
		}
	}
	
	//Velocidad
	public double getVelocidad (){
		return this.velocidad;
	}
	
	public void setVelocidad (double velocidad) throws ExcepcionDiscoDuro {
		if  (velocidad == 0.0){
		this.velocidad = velocidad;
		}
		else {
			throw new ExcepcionDiscoDuro("La velocidad tiene que ser mayor que 0");
		}
	}
	
	//toString 
	@Override
	public String toString () {
		return "Tamanho: " + tamanho + "y Velocidad: " + velocidad;
	}
	
	//hashCode
	@Override
	public int hashCode () {
		return (int)velocidad * 73 - (int)velocidad * 17 + tamanho - (int)velocidad;
	}
	
	//Equals
	@Override
	public boolean equals (Object obj) {
	boolean discoduro = false;
		if (this == obj) {
			discoduro = true;
		}
		
		else if (obj != null && obj instanceof Memoria) {
			DiscoDuro elotro = (DiscoDuro)obj;
			if (this.tamanho == elotro.getTamanho() &&
				this.velocidad == elotro.getVelocidad()) {
					discoduro = true;
			}
				
		}
		return discoduro;
	}
	
	//Clonar
	@Override
	public DiscoDuro clone () {
		DiscoDuro copia = null;
		try {
			copia = (DiscoDuro)super.clone();
		}
		catch(CloneNotSupportedException error) {
			System.out.println("Objeto no clonado, devuelve null");
		}
		return copia;
	}
	
	//CompareTo comparado por el tamaño
	public int compareTo(DiscoDuro otro) {
		int res = -1;
		
		if (this == otro || this.getTamanho () == otro.getTamanho()) res = 0;
		else if (this.getTamanho () > otro.getTamanho()) res = 1;
		
		return res;
	}
}


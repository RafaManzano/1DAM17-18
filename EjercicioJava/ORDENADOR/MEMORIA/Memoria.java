/*
 * Tipo Memoria
 * Tamaño: int cons, mod
 * Tipo: String cons, mod
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
	 * int getTamanho ();
	 * void setTamanho (int Tamanho);
	 * 
 * Tipo
 * 	String getTipo ();
 * 	void setTipo (String Tipo);
 * 
 * Velocidad
 * 	double getVelocidad ();
 * 	void setVelocidad (double Velocidad) 
 * 
 * Requisitos
 * Tamanho tiene que ser mayor que 0
 * Velocidad tiene que ser mayor que 0
 * 
 * 
 */


public class Memoria implements Cloneable, Comparable <Memoria> {
	
	//Propiedades
	private int tamanho;
	private String tipo;
	private double velocidad;
	
	//Constructores
	public Memoria (){ //Por defecto
		int tamanho = 0;
		String tipo = " ";
		double velocidad = 0.0;
	}
	
	public Memoria (int tamanho, String tipo, double velocidad) {
		this.tamanho = tamanho;
		this.tipo = tipo;
		this.velocidad = velocidad;
	}
	
	public Memoria (Memoria m) {
		this.tamanho = m.getTamanho();
		this.tipo = m.getTipo();
		this.velocidad = m.getVelocidad();
	}
	
	//Metodos
	//Tamanho
	public int getTamanho (){
		return this.tamanho;
	}
	
	public void setTamanho (int tamanho)throws ExcepcionMemoria {
		if (tamanho > 0) {
		this.tamanho = tamanho;
		}
		
		else {
			throw new ExcepcionMemoria ("El tamaño tiene que ser superior 0");
		}
	}
	
	//Tipo
	public String getTipo (){
		return this.tipo;
	}
	
	public void setTipo (String tipo)throws ExcepcionMemoria {
		if (tipo == "DDR" || tipo == "DDR2" || tipo == "DDR3" || tipo == "DDR4") {
			this.tipo = tipo;
		}
		else {
			throw new ExcepcionMemoria("El tipo tiene que ser DDR, DRR2, DDR3 y DDR4");
		}
	}
	
	//Velocidad
	public double getVelocidad (){
		return this.velocidad;
	}
	
	public void setVelocidad (double velocidad) throws ExcepcionMemoria {
		if  (velocidad == 0.0){
		this.velocidad = velocidad;
		}
		else {
			throw new ExcepcionMemoria("La velocidad tiene que ser mayor que 0");
		}
	}
	
	//toString 
	@Override
	public String toString () {
		return "Tamanho: " + tamanho + ", Tipo: " + tipo + "y Velocidad: " + velocidad;
	}
	
	//HashCode
	@Override
	public int hashCode () {
		return (int)velocidad * 187 - (int)velocidad * 97 + tamanho ;
	}
	
	//Equals
	@Override
	public boolean equals (Object obj) {
		boolean memoria = false;
		if (this == obj) {
			memoria = true;
		}
		
		else if (obj != null && obj instanceof Memoria) {
			Memoria elotro = (Memoria)obj;
			if (this.tamanho == elotro.getTamanho() &&
				this.tipo == elotro.getTipo() &&
				this.velocidad == elotro.getVelocidad()) {
					memoria = true;
			}
				
		}
		return memoria;
	}
	
	//Clonar
	@Override
	public Memoria clone () {
		Memoria copia = null;
		try {
			copia = (Memoria)super.clone();
		}
		catch(CloneNotSupportedException error) {
			System.out.println("Objeto no clonado, devuelve null");
		}
		return copia;
	}
	
	//compareTo comparando por el tamaño
	public int compareTo(Memoria otro) {
		int res = -1;
		
		if (this == otro || this.getTamanho () == otro.getTamanho()) res = 0;
		else if (this.getTamanho () > otro.getTamanho()) res = 1;
		
		return res;
	}
}



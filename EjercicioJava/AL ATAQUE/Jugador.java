/*
 * INTERFAZ
 * Propiedades Basicas:
 * 	o Nombre: String cons,mod
 * 	o Vida: int cons, mod
 * 	o Ataque: int cons, mod
 * 	o Defensa: int cons, mod
 * 	o Esquivo: int cons, mod
 * 	o Tipo: String cons,mod
 * 
 * Propiedades Derivadas
 * 	No hay
 * 
 * Propiedades Compartidas
 * 	No hay
 * 
 * GET AND SET
 * 	Nombre
 * 	String getNommbre();
 * 	void setNombre (String newNombre);
 * 
 * 	Vida
 * 	int getVida();
 * 	void setVida (int newVida);
 * 
 *  Ataque
 * 	int getAtaque();
 * 	void setAtaque (int newAtaque);
 * 
 *  Defensa
 * 	int getDefensa();
 * 	void setDefensa (int newDefensa);
 * 
 * 	Esquivo
 * 	int getEsquivo();
 * 	void setEsquivo (int newEsquivo);
 * 
 * 	Tipo
 * 	String getTipo();
 * 	void setVida (String newTipo);
 * 
 * Requisitos:
 * 	o Tipos: Agua, Fuego, Tierra, Aire, Electrico, Hielo, Oscuridad
 * 	o Esquivo: 5 a 15
 * 	o Vida: 50 a 70
 * 	o Defensa: 5 a 15
 * 	o Ataque: 5 a 15
 */


public class Jugador implements Cloneable {
	
	//Propiedades
	private String nombre;
	private int vida;
	private int ataque;
	private int defensa;
	private int esquivo;
	private String tipo;
	
	//Constructores
	public Jugador () { //Por defecto
		String nombre = " ";
		int vida = 0;
		int ataque = 0;
		int defensa = 0;
		int esquivo = 0;
		String tipo = " ";
	}
	
	public Jugador (String nombre, int vida, int ataque, int defensa, int esquivo, String tipo) { //Por parametros
		this.nombre = nombre;
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
		this.esquivo = esquivo;
		this.tipo = tipo;
	}
	
	public Jugador (Jugador jug) {
		this.nombre = jug.nombre;
		this.vida = jug.vida;
		this.ataque = jug.ataque;
		this.defensa = jug.defensa;
		this.esquivo = jug.esquivo;
		this.tipo = jug.tipo;
	}
		
	//Metodos
	//Nombre
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Vida
	public int getVida() {
		return this.vida;
	}
	
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	//Ataque
		public int getAtaque(){
		return this.ataque;
	}

	public void setAtaque (int ataque){
		this.ataque = ataque;
		
	}
	
	//Defensa
	public int getDefensa () {
		return this.defensa;
	}
	
	public void setDefensa (int defensa) {
		this.defensa = defensa;
	}
	
	//Esquivo
	public int getEsquivo () {
		return this.esquivo;
	}
	
	public void setEsquivo (int esquivo) {
		this.esquivo = esquivo;
	}
	
	//Tipo
	public String getTipo () {
		return this.tipo;
	}
	
	public void setTipo (String tipo) {
		this.tipo = tipo;
	}
	
	//toString 
	@Override
	public String toString () {
		return "Nombre: " + nombre + ", Vida: " + vida + ", Ataque: " + ataque + ", Defensa: " + defensa + ", Esquivo: " + esquivo + " y Tipo: " + tipo;
	}
	
	@Override
	public int hashCode () {
		return vida * esquivo * defensa * 2 * ataque;
	}
	
	@Override
	public boolean equals (Object obj) {
		boolean jugador = false;
		if (this == obj) {
			jugador = true;
		}
		
		else if (obj != null && obj instanceof Jugador) {
			Jugador elotro = (Jugador)obj;
			if (this.nombre == elotro.getNombre() &&
				this.vida == elotro.getVida() &&
				this.ataque == elotro.getAtaque() &&
				this.defensa == elotro.getDefensa() &&
				this.esquivo == elotro.getEsquivo() &&
				this.tipo == elotro.getTipo()) {
					jugador = true;
			}
				
		}
		return jugador;
	}
	
	@Override
	public Jugador clone () {
		Jugador copia = null;
		try {
			copia = (Jugador)super.clone();
		}
		catch(CloneNotSupportedException error) {
			System.out.println("Objeto no clonado, devuelve null");
		}
		return copia;
	}
	
	
}


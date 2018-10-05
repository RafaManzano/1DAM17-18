/*
 * Tipo Ordenador:
 * Propiedades Basicas
 * 	IVA int cons mod
 * 	PrecioBase double cons mod
 * 	Atributos Procesador
 * 	Atributos Memoria
 * 	Atributos Procesador
 * 
 * Propiedades Derivadas
 * 	PrecioMercado double cons  
 * 
 * Propiedades Compartidas
 * 	No hay
 * 
 * GET AND SET
 * IVA
 * 	int getIVA ();
 * 	void setIVA (int IVA);
 * 
 * PrecioBsae
 * 	double getPrecioBase ();
 * 	void setPrecionBase (double PrecioBase);
 * 
 * PrecioMercado
 * 	double getPrecioMercado ();
 * 
 * Utilizaremos el patron de legacion para los atributos de memoria, disco duro y procesador
 * 
 * Requisitos: No se observa ninguna
 * Metodos añadidos: No se observa ninguno
 */


public class Ordenador implements Cloneable, Comparable <Ordenador> {
	//Propiedades
	private int IVA;
	private double PrecioBase;
	private double PrecioMercado;
	private Memoria memoria;
	private DiscoDuro discoduro;
	private Procesador procesador;
	
	 int mTamanho = 0;
	 String mTipo = " ";
	 double mVelocidad = 0.0;
	 int dTamanho = 0;
	 double dVelocidad = 0.0;
	 String pModelo = " ";
	 double pVelocidad = 0.0;
	
	//Constructor
	public Ordenador () { //Por Defecto
		Memoria memoria = new Memoria ();
		DiscoDuro discoduro = new DiscoDuro ();
		Procesador procesador = new Procesador ();
		int IVA = 0;
		double PrecioBase = 0.0;
		double PrecioMercado = 0.0;
	}
	//Con parametros
	public Ordenador (int mTamanho, String mTipo, double mVelocidad, int dTamanho, double dVelocidad, String pModelo, double pVelocidad, int IVA, double PrecioBase, double PrecioMercado) {
		this.IVA = IVA;
		this.PrecioBase = PrecioBase;
		this.PrecioMercado = PrecioMercado;
		this.memoria = new Memoria (mTamanho, mTipo, mVelocidad);
		this.discoduro = new DiscoDuro (dTamanho, dVelocidad);
		this.procesador = new Procesador (pModelo, pVelocidad);
	}
	
	//De copia
	public Ordenador (Ordenador otro) {
		this.IVA = otro.getIVA ();
		this.PrecioBase = otro.getPrecioBase ();
		this.PrecioMercado = otro.getPrecioMercado ();
		this.memoria = new Memoria(otro.memoria); 
		this.discoduro = new DiscoDuro(otro.discoduro);
		this.procesador = new Procesador (otro.procesador);
	}
	
	//Metodos
	//IVA
	public int getIVA () {
		return this.IVA;
	}
	
	public void setIVA (int IVA) {
		this.IVA = IVA;
	}
	
	//PrecioBase
	public double getPrecioBase () {
		return this.PrecioBase;
	}
	
	public void setPrecioBase (double PrecioBase) {
		this.PrecioBase = PrecioBase;
	}
	
	//PrecioMercado
	public double getPrecioMercado () {
		double Precio;
		Precio = getPrecioBase () * (getIVA ()+ 100);
		return Precio;
	}
	
	//Patron de legacion Memoria
	//Tamanho
	public int getMemoriaTamanho () {
		return this.memoria.getTamanho();
	}
	
	public void setMemoriaTamanho (int mTamanho)throws ExcepcionMemoria {
		if (mTamanho > 0) {
		this.memoria.setTamanho(mTamanho);
		}
		else {
			throw new ExcepcionMemoria ("El tamaño tiene que ser superior 0");
		}
	}
	
	//Tipo 
	public String getMemoriaTipo () {
		return this.memoria.getTipo();
	}
	
	public void setMemoriaTipo (String mTipo)throws ExcepcionMemoria {
		if (mTipo == "DDR" || mTipo == "DDR2" || mTipo == "DDR3" || mTipo == "DDR4") {
		this.memoria.setTipo(mTipo);
		}
		else {
			throw new ExcepcionMemoria("El tipo tiene que ser DDR, DRR2, DDR3 y DDR4");
		}
	}
	
	//Velocidad
	public double getMemoriaVelocidad () {
		return this.memoria.getVelocidad();
	}
	
	public void setMemoriaVelocidad (double mVelocidad) throws ExcepcionMemoria {
		if  (mVelocidad == 0.0){
			this.memoria.setVelocidad(mVelocidad);
		}
		else {
			throw new ExcepcionMemoria("La velocidad tiene que ser mayor que 0");
		}
	}
	
	//Patron de legacion Disco Duro
	//Tamanho
	public int getDiscoDuroTamanho () {
		return this.discoduro.getTamanho();
	}
	
	public void setDiscoDuroTamanho (int dTamanho)throws ExcepcionDiscoDuro {
		if (dTamanho > 0) {
			this.discoduro.setTamanho(dTamanho);
		}
		else{
			throw new ExcepcionDiscoDuro ("El tamaño tiene que ser superior 0");
		}
	}
	
	//Velocidad
	public double getDiscoDuroVelocidad () {
		return this.discoduro.getVelocidad();
	}
	
	public void setDiscoDuroVelocidad (double dVelocidad)throws ExcepcionDiscoDuro {
		if (dVelocidad > 0) {
			this.discoduro.setVelocidad (dVelocidad);
		}
		else {
			throw new ExcepcionDiscoDuro ("La velocidad tiene que ser superior 0");
		}
	}
	
	//Patron de legacion Procesador
	//Modelo
	public String getProcesadorModelo () {
		return this.procesador.getModelo();
	}
	
	public void setProcesadorModelo (String pModelo){
		this.procesador.setModelo(pModelo);
	}
	
	//Velocidad
	public double getProcesadorVelocidad () {
		return this.procesador.getVelocidad();
	}
	
	public void setProcesadorVelocidad (double pVelocidad)throws ExcepcionProcesador {
		if (pVelocidad > 0) {
			this.procesador.setVelocidad(pVelocidad);
		}
		else {
			throw new ExcepcionProcesador ("La velocidad no puede ser menor que 0");
		}
	}
	
	//Metodos sobreescritos
	//toString
	@Override
	public String toString (){
		return IVA + "," + PrecioBase + "," + memoria.toString() + "," + discoduro.toString() + "," + procesador.toString();
	}
	
	//hashCode
	@Override
	public int hashCode () {
		return IVA * 97 + (int)PrecioBase - (int)PrecioMercado + 369;
	}
	
	//Equals. Se compara por el precio de mercado, si tiene el mismo son el mismo objeto
	@Override
	public boolean equals (Object obj){
		boolean ordenador = false;
		if (this == obj) {
			ordenador = true;
		}
		
		else if (obj != null && obj instanceof Ordenador) {
			Ordenador elotro = (Ordenador)obj;
			if (this.PrecioMercado == elotro.PrecioMercado){
			ordenador = true;
			}
		}
		return ordenador;
	}
	
	//Clone Superficial
	@Override
	public Ordenador clone(){
		
		Ordenador copia = null;
		
		try{
			copia = (Ordenador)super.clone();
			
		}catch(CloneNotSupportedException error){
			
			System.out.println("Objeto no clonado,devuelve un null");
		}
		return copia;
	}
	
	//Clone En profundidad
	public Ordenador cloneProf(){
		
		Ordenador copia = null;
		
		try{
			copia = (Ordenador)super.clone();
			
			copia.memoria = this.memoria.clone();
			copia.discoduro = this.discoduro.clone();
			copia.procesador = this.procesador.clone();
		
		}catch(CloneNotSupportedException error){
			
			System.out.println("Objeto no clonado,devuelve un null");
		}
		return copia;
	}
	
	//CompareTo El mismo criterio que equals
	public int compareTo(Ordenador otro){
		int res = 0;
		if(this.getPrecioMercado() > otro.getPrecioMercado()){
			res = 1;
		}else if(this.getPrecioMercado() < otro.getPrecioMercado()){
			res = -1;
		}
		return res;
	}
}
	



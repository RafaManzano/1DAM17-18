/*
 * Tipo Paquete
 * Propiedades Basicas: 
 * 	Destinatario
 * 		Tipo: String
 * 		¿Consultable?: Si
 * 		¿Modificable?: Si
 * 	Direccion
 *   	Tipo: String
 * 		¿Consultable?: Si
 * 		¿Modificable?: Si
 * 	Peso
 *   	Tipo: Double
 * 		¿Consultable?: Si
 * 		¿Modificable?: Si
 * 	AlcanceEnvio
 *   	Tipo: String
 * 		¿Consultable?: Si
 * 		¿Modificable?: Si
 * 	TipoPago 
 *   	Tipo: String
 * 		¿Consultable?: Si
 * 		¿Modificable?: Si
 * 
 * Propiedades Derivadas
 * 	Dimensiones
 * 		Tipo: Dimension
 * 		¿Consultable?: Si
 * 		¿Modificable?: Si
 * 
 * Propiedades Compartidas
 * 	No hay
 * 
 * Get and Set
 * 	Destinatario
 * 		String getDestinatario ();
 * 		void setDestinatario (String new Dest);
 * 
 * 	Direccion
 * 		String getDireccion ();
 * 		void setDireccion (String newDir);
 * 
 * 	Peso
 * 		Double getPeso();
 * 		void setPeso (Double newPeso);
 * 
 * 	AlcanceEnvio
 * 		String getAlcance ();
 * 		void setAlcance (String newAlc);
 * 
 * 	TipoPago
 * 		String getTipoPago ();
 * 		void setTipoPago (String newTipo);
 * 
 * 	Dimensiones
 * 		Dimension getDimensiones ();
 * 
 * Requisitos
 * 	Peso: Mayor que 0
 * 	Alcance: Regional, Nacional, Internacional
 * 	TipoPago: Contrarrembolso, YaPagado
 * 
 */


public class Paquete implements Cloneable{
	//Propiedades
	private String Destinatario;
	private String Direccion;
	private double Peso;
	private String AlcanceEnvio;
	private String TipoPago;
	private Dimension Dimensiones;
	
	//Constructor
	public Paquete () {  //Por defecto
	String Destinatario = " ";
	String Direccion = " ";
	double Peso = 0.0;
	String AlcanceEnvio = " ";
	String TipoPago = " "; 
	}
	
	public Paquete (String Destinatario, String Direccion, double Peso, String AlcanceEnvio, String TipoPago, double alto, double largo, double ancho) { //Con parametros
		this.Destinatario = Destinatario;
		this.Direccion = Direccion;
		this.Peso = Peso;
		this.AlcanceEnvio = AlcanceEnvio;
		this.TipoPago = TipoPago;
		this.Dimensiones = new Dimension(alto, largo, ancho);
	}
	
	public Paquete (Paquete paq) { //De copia
		this.Destinatario = paq.getDestinatario();
		this.Direccion = paq.getDireccion();
		this.Peso = paq.getPeso();
		this.AlcanceEnvio = paq.getAlcance();
		this.TipoPago = paq.getTipoPago();
	}
	
	
	//Metodos
	//Destinatario
	public String getDestinatario() {
		return this.Destinatario;
	}
	
	public void setDestinatario(String newDest) {
		this.Destinatario = Destinatario;
	}
	
	//Direccion
	public String getDireccion () {	
		return this.Direccion;
	}
	
	public void setDireccion (String newDir) {
		this.Direccion = Direccion;
	}
	
	//Peso
	public double getPeso() {
		return this.Peso;
	}
	
	public void setPeso (double newPeso)throws ExcepcionPaquete {
		if (Peso > 0.0) {
			this.Peso = Peso;
		}
		else {
			throw new ExcepcionPaquete("El peso no puede ser negativo");
		}
	}
	
	//AlcanceEnvio
	public String getAlcance () {
		return this.AlcanceEnvio;
	}
	
	public void setAlcance (String newAlc)throws ExcepcionPaquete {
		if (AlcanceEnvio == "Nacional" || AlcanceEnvio == "Regional" || AlcanceEnvio == "Internacional"){
			this.AlcanceEnvio = AlcanceEnvio;
		}
		else {
			throw new ExcepcionPaquete ("Para el alcance solo es posible Regional, Nacional e Internacional");
		}
	}
	
	//tipoPago
	public String getTipoPago () {
		return this.TipoPago;
	}
	
	public void setTipoPago (String newTipo)throws ExcepcionPaquete {
		if (TipoPago == "Contrarrembolso" || TipoPago == "Ya Pagado" ){
			this.TipoPago = TipoPago;
		}
		else {
			throw new ExcepcionPaquete("El tipo de pago es Contrarrembolso o Ya Pagado");
		}
	}
	
	//Patron de legacion
	//Alto de Dimension
	public double getDimensionesAlto () {
		return Dimensiones.getAlto();
	}
	
	//Ancho de Dimension
	public double getDimensionesAncho () {
		return Dimensiones.getAncho();
	}
	
	//Largo de Dimension
	public double getDimensionesLargo () {
		return Dimensiones.getLargo();
	}
	
	//Dimensiones
	public String getDimensiones () {
	
		return (Dimensiones.getAlto()+" X "+Dimensiones.getAncho()+" X "+Dimensiones.getLargo());
		
	}	
	
	//ToString
	@Override
	public String toString () {
		return "Destinatario es " + Destinatario + ", Direccion es " + Direccion + ", Peso es " + Peso + ", AlcanceEnvio es " + AlcanceEnvio + ", TipoPago es " + TipoPago + ", Dimensiones es Dimensiones";
	}
	
	@Override
	public int hashCode () {
		return (int) Peso * 201 - 3 * 13;
	}
	
	@Override
	public Paquete clone () {
		Paquete copia = null;
		try {
			copia = (Paquete)super.clone();
		}
		catch(CloneNotSupportedException error) {
			System.out.println("Objeto no clonado, devuelve null");
		}
		return copia;
	}
	
	@Override
	public boolean equals (Object obj) {
		boolean paquete = false;
		if (this == obj) {
			paquete = true;
		}
		
		else if (obj != null && obj instanceof Paquete) {
			Paquete elotro = (Paquete)obj;
			if (this.Destinatario == elotro.getDestinatario() &&
				this.Direccion == elotro.getDireccion() &&
				this.Peso == elotro.getPeso() &&
				this.AlcanceEnvio == elotro.getAlcance() &&
				this.TipoPago == elotro.getTipoPago()) {
					paquete = true;
			}
				
		}
		return paquete;
	}
	
}



package poo;

public class Coche_Mia {

	//Atributos
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos_cuero;
	private boolean climatizador;
	
	//Constructor
	public Coche_Mia () { //Por defecto
		int ruedas = 0;
		int largo = 0;
		int ancho = 0;
		int motor = 0;
		int peso_plataforma = 0;
	}
	
	
	public Coche_Mia (int ruedas, int largo, int ancho, int motor, int peso_plataforma) { //Con parametros
		this.ruedas = ruedas;
		this.largo = largo;
		this.ancho = ancho;
		this.motor = motor;
		this.peso_plataforma = peso_plataforma;
	}
	
	public Coche_Mia (Coche_Mia c) { //De copia
		this.ruedas = c.getRuedas();
		this.largo = c.getLargo();
		this.ancho = c.getAncho();
		this.motor = c.getMotor();
		this.peso_plataforma = c.getPeso_plataforma();
	}
	
	
	//Metodos
	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

	public int getPeso_plataforma() {
		return peso_plataforma;
	}

	public void setPeso(int peso_plataforma) {
		this.peso_plataforma = peso_plataforma;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPeso_total() {
		return peso_total;
	}

	public void setPeso_total(int peso_total) {
		this.peso_total = peso_total;
	}

	public boolean isAsientos_cuero() {
		return asientos_cuero;
	}

	public void setAsientos_cuero(boolean asientos_cuero) {
		this.asientos_cuero = asientos_cuero;
	}

	public boolean isClimatizador() {
		return climatizador;
	}

	public void setClimatizador(boolean climatizador) {
		this.climatizador = climatizador;
	}
	
	
	
	public String dime_datos_generales () {
		return "La plataforma del vehiculo tiene " + ruedas + " ruedas " +
		". Mide " + largo/1000 + " metros con un ancho de " + ancho + " cm y un peso de plataforma de " + peso_plataforma + " kg.";
	}
	
	
}

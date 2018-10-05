package arraylist;

public class Empleado {

	//Atributos
	private String nombre;
	private int edad;
	private double salario;
	
	//Constructor
	public Empleado (String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	
	public String dameDatos() {
		return "El empleado se llama " + nombre + ". Tiene " + edad + " a�os. Y un salario de " + salario;
	}
}

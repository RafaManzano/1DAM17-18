/*
 * 
 */


public class Persona {
	
	private String nombre;
	private char sexo;
	private int edad;
	private boolean asistencia;
	
	private final String[] NOMBRES_VARONES = {"Juan","Ramon","Pepe","Rafael","Pedro"};
	private final String[] NOMBRES_HEMBRAS = {"Asuncion","Maria","Paqui","Juana","Marta"};
	
	//Constructores
	public Persona () { //Por defecto
		String nombre = " ";
		char sexo = ' ';
		int edad = 0;
		boolean asistencia = false;
	}
	
	public Persona (String nombre, char sexo, int edad, boolean asistencia) { //Con parametros
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.asistencia = asistencia;
	}
	
	public Persona (Persona p) {
		this.nombre = p.getNombre();
		this.sexo = p.getSexo();
		this.edad = p.getEdad();
		this.asistencia = p.getAsistencia();
	}
	
	//Metodos
	//Nombre
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String newNombre) {
		this.nombre = nombre;
	}
	
	//Sexo
	public char getSexo() {
		return this.sexo;
	}
	
	public void setSexo(char newSexo) {
		this.sexo = sexo;
	}
	
	//Edad
	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad(char newEdad) {
		this.edad = edad;
	}
	
	//Asistencia
	public boolean getAsistencia() {
		return this.asistencia;
	}
	
	public void setAsistencia(boolean newAsistencia) {
		this.asistencia = asistencia;
	}
	
	public int esSexo (){
		int quesexo;
		quesexo = MetodosSueltos.generaNumeroAleatorio(0,1);
		if (quesexo == 1) {
			sexo = 'V';
			return quesexo;
		}
		else {
			return quesexo;
		}
	}
	
}


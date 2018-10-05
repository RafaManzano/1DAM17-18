/*
 * 
 * 
 */


public class Profesor extends Persona {
	
	private String materia;

	//Constructor
	public Profesor () { //Por defecto
		super();
		materia = " ";
	}
	
	public Profesor (String nombre, char sexo, int edad, boolean asistencia, String materia ) { //Con parametros
		super(nombre, sexo, edad, asistencia);
		this.materia = materia;
	}
	
	//Metodos
	//materia
	public String getMateria() {
		return this.materia;
	}
	
	public void setMateria(String newMateria) {
		this.materia = materia;
	}
	
	public void Esdisponible () {
		int prob;
		prob = MetodosSueltos.generaNumeroAleatorio(0,100);
		
		if (prob > 20) {
			super.setAsistencia(false);
		}
		else {
			super.setAsistencia(true);
		}
	}
}


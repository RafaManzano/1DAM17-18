/*
 * 
 */


public class Alumno extends Persona {
	
	//Propiedades
	private int nota;
	
	//Constructores
	public Alumno () { //Por defecto
		super();
		nota = 0;
	}
	
	public Alumno (String nombre, char sexo, int edad, boolean asistencia, int nota) { //Con parametros
		super(nombre, sexo, edad, asistencia);
		this.nota = nota;
	}
	
	//public Alumno (Alumno al) {	De copia
	//}
	
	//Metodos
	public int getNota() {
		return this.nota;
	}
	
	public void setNota(int newNota) {
		this.nota = nota;
	}
	
	public void Esdisponible () {
		int prob;
		prob = MetodosSueltos.generaNumeroAleatorio(0,100);
		
		if (prob > 50) {
			super.setAsistencia(false);
		}
		else {
			super.setAsistencia(true);
		}	
	}
}




/*
 * Tipo Triangulo
 * 	o Base
 * 	o Altura
 * 
 *  Propiedades Basicas:
 * 		Base
 * 		o Tipo: Double
 * 		o ¿Constultable? : Si  
 * 		O ¿Modificable? : Si
 * 
 * 		Altura
 * 		o Tipo: Double
 * 		o ¿Constultable? : Si  
 * 		O ¿Modificable? : Si
 * 
 * 	Propiedades Derivadas:
 * 		Area
 * 		o Tipo: Double
 * 		o ¿Consultable?: Si
 * 		o ¿Modificable?: No
 * 
 * Get and Set
 * 		Base
 * 		o double getBase ();
 * 		o void setBase (double newBase);
 * 
 * 		Altura
 * 		o double getAltura ();
 * 		o void setBase (double newBase);
 * 
 * 		Area 
 * 		o double getArea ();
 * 
 *  Requisitos:
 * 	o Tanto la base como la altura tienen que ser mayor que 0.0
 * 
 * No hay metodos añadidos de momento
*/


public class Triangulo implements Cloneable,Comparable <Triangulo>{
	//Propiedades
	private double base;
	private double altura;
	
	//Constructor
	public Triangulo () {
		base = 0;
		altura = 0;
	}
	
	public Triangulo (double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	public Triangulo (Triangulo Tri) {
		this.base = Tri.getBase();
		this.altura = Tri.getAltura();
	}
	
	//Metodos
	public double getBase () {
		return this.base;
	}
	
	public void setBase (double newBase) {
		this.base = base;
	}
	
	public double getAltura () {
		return this.altura;
	}
	
	public void setAltura (double newAltura) {
		this.altura = altura;
	}
	
	public double getArea () {
		double area = 0.0;
		area = (getBase() * getAltura()) /2;
		return area;
	}
	
	@Override
	public String toString() {
		return "Triangulo base=" + base + ", altura=" + altura;
	}
	
	@Override
	public int hashCode() {
		return (int)base * 201 + (int)altura * 11;
	}
	
	@Override
	public Triangulo clone () {
		Triangulo copia = null;
		try {
		copia = (Triangulo)super.clone();
		}
		catch(CloneNotSupportedException error) {
			System.out.println("Objeto no clonado, devuelve null");
		}
		return copia;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean ret = false;
		if (this == obj) {
			ret = true;
		}
		
		else if (obj != null && obj instanceof Triangulo) {
			Triangulo otro = (Triangulo)obj;
			
			if (this.altura == otro.getAltura() &&
				this.base == otro.getBase()) {
					ret = true;
			}
		}
		return ret;
		
	}
	
	@Override
	public int compareTo(Triangulo otro) {
		int ret = -1;
		
		if(this == otro || this.getArea() == otro.getArea()) {
			ret = 0;
		}
		else if(this.getArea() > otro.getArea()){
			ret = 1;
		}
		
		return ret;
	}
}


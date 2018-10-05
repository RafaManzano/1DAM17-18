package empleado;



public class Uso_empleado {

	public static void main(String[] args) {

		/*
		Empleado empleado1 = new Empleado ("Paco Gomez", 85000, 1990, 12, 17);
		
		Empleado empleado2 = new Empleado ("Ana Lopez", 95000, 1995, 6, 2);
		
		Empleado empleado3 = new Empleado ("Maria Martin", 105000, 2002, 3, 15);
		
		empleado1.subeSueldo(5);
		
		empleado2.subeSueldo(5);
		
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo() + " Fecha de alta:  " + empleado1.dameFechaContrato());
		
		System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo() + " Fecha de alta:  " + empleado2.dameFechaContrato());

		System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo() + " Fecha de alta:  " + empleado3.dameFechaContrato());		
		
	}
	*/
		
		Empleado [] misEmpleados = new Empleado [3];
		
		misEmpleados [0] =  new Empleado ("Paco Gomez", 85000, 1990, 12, 17);
		misEmpleados [1] =  new Empleado ("Ana Lopez", 95000, 1995, 6, 2);
		misEmpleados [2] =  new Empleado ("Maria Martin", 105000, 2002, 3, 15);
		
		/*
		for(int i = 0; i < 3; i++ ) {
			misEmpleados[i].subeSueldo(5);
		}
		*/
		
		for(Empleado e : misEmpleados) {
			e.subeSueldo(5);
		}
		
		/*
		for (int i = 0; i < 3; i++) {
			System.out.println("Nombre: " + misEmpleados[i].dameNombre() + " Sueldo: " + misEmpleados[i].dameSueldo() + " Fecha de alta: " + misEmpleados[i].dameFechaContrato());
		}
		*/
		
		for(Empleado e: misEmpleados)
			System.out.println("Nombre: " + e.dameNombre() + " Sueldo: " + e.dameSueldo() + " Fecha de alta: " + e.dameFechaContrato());
		}
		
		

}

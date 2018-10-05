package arraylist;

import java.util.*;

public class UsoEmpleado {
	public static void main (String [] args) {
		/*
		 * ARRAY NORMAL
		Empleado listaEmpleados [] = new Empleado [4];
		
		listaEmpleados[0] = new Empleado ("Ana", 45, 2500);
		listaEmpleados[1] = new Empleado ("Antonio", 55, 2000);
		listaEmpleados[2] = new Empleado ("Maria", 25, 2600);
		listaEmpleados[3] = new Empleado ("Maria", 25, 2600);
		*/
		
		ArrayList <Empleado> listaEmpleados = new ArrayList <Empleado> ();
		
		//listaEmpleados.ensureCapacity(11);
		
		listaEmpleados.add(new Empleado("Ana", 45, 2500));
		listaEmpleados.add(new Empleado("Antonio", 55, 2000));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		listaEmpleados.add(new Empleado("Jose", 35, 2200));
		listaEmpleados.add(new Empleado("Ana", 45, 2500));
		listaEmpleados.add(new Empleado("Antonio", 55, 2000));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		listaEmpleados.add(new Empleado("Jose", 35, 2200));
		listaEmpleados.add(new Empleado("Pedro", 22, 2200));
		listaEmpleados.add(new Empleado("Pedro", 22, 2200));
		listaEmpleados.add(new Empleado("Pedro", 22, 2200));
		listaEmpleados.add(new Empleado("Pedro", 22, 2200));
		
		//listaEmpleados.trimToSize();
		
		//listaEmpleados.add(new Empleado("Olga", 22, 2200));
		//listaEmpleados.set(1, new Empleado("Olga", 22, 2200));
		
		//System.out.println(listaEmpleados.get(4).dameDatos());
		
		
		
		//System.out.println(listaEmpleados.size());
		
		/*
		for (Empleado e: listaEmpleados) {
			System.out.println(e.dameDatos());
		}
		*/
		
		Iterator <Empleado> miIterador = listaEmpleados.iterator();
		
		while(miIterador.hasNext()) {
			System.out.println(miIterador.next().dameDatos());
		}
		
		/*
		for(int i = 0; i < listaEmpleados.size(); i++) {
			
			Empleado e = listaEmpleados.get(i);
			
			System.out.println(e.dameDatos());
		}
		*/
		
		/*
		Empleado arrayEmpleados[] = new Empleado [listaEmpleados.size()];
		
		listaEmpleados.toArray(arrayEmpleados);
		
		for(int i = 0; i < arrayEmpleados.length; i++) {
			System.out.println(arrayEmpleados[i].dameDatos());
		}
		*/
	}
	

}

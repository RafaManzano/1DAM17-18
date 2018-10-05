package Main;

import Gestor.Gestor;

public class Main {

	public static void main(String[] args) {

	int [] array = {35, 23, 11, 5, 13} ;
	int [] array1 = {35, 23, 11, 5, 13} ;
	int [] array2 = {35, 23, 11, 5, 13} ;
	int [] array3 = {35, 23, 11, 5, 13} ;
	int [] array4 = {35, 23, 11, 5, 13} ;
	int [] array5 = {35, 23, 11, 5, 13} ;
	
	
	System.out.println("Array sin ordenar");
	Gestor.imprimirArray(array);
	Gestor.burbuja(array);
	System.out.println(" ");
	System.out.println("Array ordenado (Burbuja)");
	Gestor.imprimirArray(array);
	
	System.out.println("");
	
	System.out.println("Array sin ordenar ");
	Gestor.imprimirArray(array1);
	Gestor.seleccionDirecta(array1);
	System.out.println(" ");
	System.out.println("Array ordenado (Seleccion)");
	Gestor.imprimirArray(array1);
	
	System.out.println("Array sin ordenar ");
	Gestor.imprimirArray(array2);
	Gestor.rapido(array2, 5, 13);
	System.out.println(" ");
	System.out.println("Array ordenado (QuickSort)");
	Gestor.imprimirArray(array2);
	
	

	}

}

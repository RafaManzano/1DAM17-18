/*
 * Ejercicio_3.java
 * 
 * Copyright 2018 Rafael Manzano <Rafael Manzano@DESKTOP-TIIMULS>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.*;
public class Ejercicio_3 {
	
	public static void main (String[] args) {
		int longitud;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Inserte una longitud");
		longitud = teclado.nextInt();
		
		int numeros [] = new int [longitud];
		int num = 0;
		
		for (int i = 0; i < numeros.length; i++){
			System.out.println("Introduzca un numero en la posicion " + i);
			do{
				
				num = teclado.nextInt(); 
				
				if (!(num >= 0 && num <= 10)){
					System.out.println("Error. Solo numeros del 0 al 10. Inserte un numero en la posicion " + i);
				}
			}
			while (!(num >= 0 && num <= 10));
			
			numeros [i] = num;
			
		}
		
		//Esta parte es para mostrar lo insertado
		System.out.println("Estos son los numeros elegidos por el usuario");
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros [i]);
		}
		
	}
}


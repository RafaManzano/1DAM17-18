/*
 * Ejercicio_5.java
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
public class Ejercicio_5 {
	
	public static void main (String[] args) {
		int indice = 0;
		int num = 0;
		String cadena = " ";
		Scanner teclado = new Scanner (System.in);
		
		char [] abecedario = new char [91-65];
		
		for (int i = 65; i < 91; i++, indice++) {
			abecedario [indice] = (char)i;
			System.out.println(abecedario [indice]);
		}
		
		System.out.println("Introduzca su numero. Inserte un numero entre 0 y " + (abecedario.length-1) + ". -1 para acabar");
		num = teclado.nextInt();
		
		
		while (num != -1) {
			if (num >= 0 && num <abecedario.length) {
				
				cadena += abecedario [num];
			}
			else {
				System.out.println("Numero no valido. Inserte un numero entre 0 y " + (abecedario.length-1) );
			}
			
			System.out.println("Introduzca su numero. Inserte un numero entre 0 y " + (abecedario.length-1) + ". -1 para acabar");
			num = teclado.nextInt();
		}
		System.out.println("La cadena es" + cadena);
	}
}


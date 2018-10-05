/*
 * Ejercicio_6.java
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


public class Ejercicio_6 {
	
	public static void main (String[] args) {
		
		int [] numeros = {1,2,3,4,5};
		
		int [] aux = new int [numeros.length];
		
		for(int i = numeros.length - 1, j = 0;i >= 0;i-- , j++){
			aux [j] = numeros [i];
			System.out.println(aux [j]);
		}
		
		numeros = aux;
	}
}


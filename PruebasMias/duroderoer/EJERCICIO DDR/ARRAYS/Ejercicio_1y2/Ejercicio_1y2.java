/*
 * Ejercicio_1y2.java
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


public class Ejercicio_1y2 {
	
	public static void main (String[] args) {
		int [] numeros = new int [100];
		int suma = 0;
		double media = 0.0;
		
		//Suma
		for (int i =0; i<numeros.length; i++){
			numeros[i] = i+1;
			suma= suma + numeros[i];
		}
		System.out.println("La suma es " + suma);
		
		//Media
		media= (double)suma / numeros.length;
		System.out.println("La media es " + media);
	}
}


/*
 * arrayforeach.java
 * 
 * Copyright 2018 rafam <rafam@DESKTOP-SKCSU96>
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


public class arrayforeach {
	
	public static void main (String[] args) {
		
		//String [] paises = new String [8];
		
		/*
		paises [0] = "España";
		paises [1] = "Francia";
		paises [2] = "Italia";
		paises [3] = "Alemania";
		paises [4] = "Belgica";
		paises [5] = "Australia";
		paises [6] = "Mexico";
		paises [7] = "Colombia";
		*/
		
		String [] paises = {"España","Francia","Italia","Alemania","Belgica","Australia","Mexico","Colombia"};
		
		/*for(int i=0; i<paises.length;i++) {
			System.out.println("Pais " + (i+1) + " " + paises[i]);
		}
		*/
		for(String elemento:paises) {
			System.out.println(elemento);
		}
		
	}
}


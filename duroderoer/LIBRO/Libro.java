/*
 * Libro.java
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


public class Libro {
	//Propiedades
	private int ISBN;
	private String titulo;
	private String autor;
	private int numPaginas;
	
	//Constructor
	public Libro () {//Por defecto
		ISBN = 0;
		titulo = " ";
		autor = " ";
		numPaginas = 0;
	}
	
	public Libro (int ISBN, String titulo, String autor, int numPaginas) { //Con parametros
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}
	
	public Libro (Libro lib) {
		this.ISBN = lib.ISBN;
		this.titulo = lib.titulo;
		this.autor = lib.autor;
		this.numPaginas = lib.numPaginas;
	}
	
	//Metodos
	//ISBN
	public int getISBN () {
		return ISBN;
	}
	
	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}
	
	//Titulo
	public String getTitulo () {
		return titulo;
	}
	
	public void setTitulo (String titulo) {
		this.titulo = titulo;
	}
	
	//autor
	public String getAutor () {
		return autor;
	}
	
	public void setAutor (String autor) {
		this.autor = autor;
	}
	
	//numPaginas
	public int getNumPaginas () {
		return numPaginas;
	}
	
	public void setNumPaginas (int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	//toString
	@Override
	public String toString () {
		return "El libro " + titulo + " con ISBN " + ISBN + " creado por el autor " + autor + " tiene " + numPaginas + " paginas.";
	}
	
}


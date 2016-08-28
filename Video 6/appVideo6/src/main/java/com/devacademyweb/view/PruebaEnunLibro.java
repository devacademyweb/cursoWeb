package com.devacademyweb.view;

import com.devacademyweb.entity.Libro;

public class PruebaEnunLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Todos los libros\n");
		//Imprime todos los libros en enum Libro
		for (Libro libro : Libro.values()) {
			System.out.println(libro.getTitulo()+"-"+libro.getAñoCopyrigth());
		}

	}

}

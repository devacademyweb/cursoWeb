package com.devacademyweb.entity;

public enum Libro {

	// Declara constantes de tipo enum
	JHTP("Java How Program", "2012"),
	CHTP("How to program","2007"),
	CPPHTP("C++ How to Program","2012");
	

	// Campos de instancia
	private final String titulo;
	private final String añoCopyrigth;

	// Construtor de enum
	Libro(String tituloLibro, String año) {
		titulo=tituloLibro;
		añoCopyrigth=año;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAñoCopyrigth() {
		return añoCopyrigth;
	}

}

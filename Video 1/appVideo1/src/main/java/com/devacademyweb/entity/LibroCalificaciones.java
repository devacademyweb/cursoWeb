package com.devacademyweb.entity;

public class LibroCalificaciones {
	private String nombreDelCurso;

	public LibroCalificaciones() {
		// TODO Auto-generated constructor stub
		this.nombreDelCurso="Curso Inicial";
	}
	
	public String getNombreDelCurso() {
		return nombreDelCurso;
	}

	public void setNombreDelCurso(String nombreDelCurso) {
		this.nombreDelCurso = nombreDelCurso;
	}

	public void mostrarMensaje() {
		System.out.printf("Bienvenido al libro de calificaciones para\n%s!\n", this.getNombreDelCurso());
	}

}

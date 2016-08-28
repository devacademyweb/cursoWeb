package com.devacademyweb.entity;

import java.util.Scanner;

public class LibroCalificaciones {
	private String nombreDelCurso;

	public LibroCalificaciones() {
		// TODO Auto-generated constructor stub
		this.nombreDelCurso="Curso Inicial";
	}
	
	public LibroCalificaciones(String nombre) {
		// TODO Auto-generated constructor stub
		this.nombreDelCurso=nombre;
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

	public void determinarPromedioClase(){
		Scanner entrada=new Scanner(System.in);
		
		int total;//suma calificaciones ingresadas por el usuario
		int contadorCalif; //numero de la siguiente calificacion a ingresar.
		int calificacion;//valor de la calificacion escrita por el usuario
		int promedio;//promedio de las calificaciones
		
		//fase de inicializacion
		total=0;
		contadorCalif=1;
		
		//fase de procesamiento:
		while(contadorCalif<=10){
			System.out.println("Escriba la calificacion:");
			calificacion=entrada.nextInt();
			total=total+calificacion;
			contadorCalif++;
		}
		
		//fase de terminacion
		promedio=total/10;
		
		System.out.printf("\nEl total de las 10 calificaciones es %d\n", total);
		System.out.printf("\nEl promedio de la clase es %d\n", promedio);
	}
	
	
	
}

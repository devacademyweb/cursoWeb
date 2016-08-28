package com.devacademyweb.view;

import java.util.Scanner;

import com.devacademyweb.entity.LibroCalificaciones;

//Crear un objeto LibroCalificaciones y llama a su metodo
public class PruebaLibroCalificaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crear un objeto Scanner para obtener la entrada de la ventana de comandos
		Scanner entrada=new Scanner(System.in);
		String nombreDelCurso;
		
		//Crea un objeto LibroCalificaciones.
		LibroCalificaciones miLibroCalificaciones1=new LibroCalificaciones();
		LibroCalificaciones miLibroCalificaciones2=null;//new LibroCalificaciones("Estructura de Datos");
		
		System.out.printf("El nombre inicial del curso es:%s\n\n", miLibroCalificaciones1.getNombreDelCurso());
		//System.out.printf("El nombre inicial del curso es:%s\n\n", miLibroCalificaciones2.getNombreDelCurso());
				
		
		//pide y recibe el nombre del curso como entrada.
		System.out.println("Escriba el nombre del curso:");
		nombreDelCurso=entrada.nextLine();//lee una linea de texto
		//miLibroCalificaciones1.setNombreDelCurso(nombreDelCurso);
		miLibroCalificaciones2=new LibroCalificaciones(nombreDelCurso);
		System.out.println();
		
		//llama al metodo mostrarMensaje de miLibroCalificaciones
		miLibroCalificaciones2.mostrarMensaje();
		
		
	}

}

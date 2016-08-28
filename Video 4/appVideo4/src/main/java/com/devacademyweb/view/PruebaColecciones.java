package com.devacademyweb.view;

import java.util.ArrayList;
import java.util.List;

public class PruebaColecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear un objeto List de objetos String 
		List<String> elementos =new ArrayList<String>();

		elementos.add("rojo");//inserta un elemento a la lista
		elementos.add(0, "amarillo");//inserta el valor en el indice 0
		
		//encabezado
		System.out.print("Mostrar contenido de lista(for): ");
		
		for (int i = 0; i < elementos.size(); i++) {
			System.out.printf(" %s",elementos.get(i));
		}
		
		
		mostrar(elementos, "\nMostrar contenido de lista con for mejorado:");
		
		elementos.add("verde");
		elementos.add("amarillo");
		
		mostrar(elementos, "\nLista con dos nuevos elementos:");
		
		elementos.remove("amarillo");
		mostrar(elementos, "\nElminar primera instancia de amarillo:");
		
		elementos.remove(1);
		mostrar(elementos, "\nElminar segun elemento de la lista:");
		
		//Verificar si hay un valor en la lista
		System.out.printf("\"rojo\" %s esta en la lista\n",elementos.contains("rojo")?"":"no");
		
		System.out.printf("Tamaño: %s\n",elementos.size());
		
		
	}
	
	
	public static  void mostrar(List<String> elementos, String encabezado){
		System.out.print(encabezado);//mostrar encabezado
		for (String elemento : elementos) {
			System.out.printf(" %s",elemento);
		}
		System.out.println();
	}

}

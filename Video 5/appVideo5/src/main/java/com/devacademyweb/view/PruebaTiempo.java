package com.devacademyweb.view;

import com.devacademyweb.entity.Tiempo;

public class PruebaTiempo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiempo t1=new Tiempo();//00:00:00
		Tiempo t2=new Tiempo(2);// 02:00:00
		Tiempo t3=new Tiempo(21,34);//21:34:00
		Tiempo t4=new Tiempo(12,25,42);//12:25:42
		Tiempo t5=new Tiempo(t4);//12:25:42
		
		System.out.println("Se construyo con:");
		System.out.println("t1: todos los argumentos predertimados");
		System.out.printf("  %s\n",t1.aStringUniversal());
		System.out.printf("  %s\n",t1.toString());
		
		System.out.println("Se construyo con:");
		System.out.println("t2: todos los argumentos predertimados");
		System.out.printf("  %s\n",t2.aStringUniversal());
		System.out.printf("  %s\n",t2.toString());
		
		System.out.println("Se construyo con:");
		System.out.println("t3: todos los argumentos predertimados");
		System.out.printf("  %s\n",t3.aStringUniversal());
		System.out.printf("  %s\n",t3.toString());
		
		
		System.out.println("Se construyo con:");
		System.out.println("t4: todos los argumentos predertimados");
		System.out.printf("  %s\n",t4.aStringUniversal());
		System.out.printf("  %s\n",t4.toString());
		
		System.out.println("Se construyo con:");
		System.out.println("t5: todos los argumentos predertimados");
		System.out.printf("  %s\n",t5.aStringUniversal());
		System.out.printf("  %s\n",t5.toString());
		
		
		
		try {
			Tiempo t6=new Tiempo(27,74,99);
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.printf("\nExcepcion al inicializar t6 : %s\n",e.getMessage());
		}

	}

}

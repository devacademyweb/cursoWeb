package com.devacademyweb.view;

import com.devacademyweb.entity.Empleado;

public class PruebaEmpleadoStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.printf("Empleados antes de instanciar: %d\n",Empleado.obtenerCuenta());
		
		//Crear dos Empleados, la cuenta debe ser 2
		Empleado e1=new Empleado("Susan","Baker");
		Empleado e2=new Empleado("Bob","Blue");
		
		System.out.printf("Empleados despues de instanciar: %d\n",Empleado.obtenerCuenta());
		
		
		

	}

}

package com.devacademyweb.view;

import com.devacademyweb.entity.Empleado;
import com.devacademyweb.entity.Fecha;

public class PruebaEmpleadoFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fecha nacimiento=new Fecha(7, 24, 1949);
		Fecha contratacion=new Fecha(3,12,1988);
		
		Empleado empleado1=new Empleado("Bob", "Blue", nacimiento, contratacion);
		
		System.out.println("Prueba 1-Asignando ref de clase fecha a empleado por constructor");
		System.out.println(empleado1);
		
		
		Fecha nacimiento1=new Fecha(8, 24, 1949);
		Fecha contratacion1=new Fecha(11,12,1988);
		Empleado empleado2=new Empleado("Bob2", "Blue2");
		
		empleado2.setFechaNacimiento(nacimiento1);
		empleado2.setFechaContratacion(contratacion1);
		System.out.println("Prueba 2-Asignando ref de clase fecha a empleado utilizando metodos set");
		System.out.println(empleado2);

	}

}

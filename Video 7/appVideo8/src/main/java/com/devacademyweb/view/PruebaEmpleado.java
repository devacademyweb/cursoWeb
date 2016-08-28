package com.devacademyweb.view;

import java.util.ArrayList;
import java.util.List;

import com.devacademyweb.entity.Empleado;
import com.devacademyweb.entity.EmpleadoAsalariado;
import com.devacademyweb.entity.EmpleadoBaseMasComision;
import com.devacademyweb.entity.EmpleadoPorComision;
import com.devacademyweb.entity.EmpleadoPorHoras;

public class PruebaEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Empleado> empleados=new ArrayList<Empleado>();
		Empleado ea=new EmpleadoAsalariado("Henry", "Mendoza Puerta", "111-111", 1234.00);
		Empleado eph=new EmpleadoPorHoras("Juan", "Mendoza Puerta", "111-121", 1234.00,40);
		Empleado epc=new EmpleadoPorComision("Patricia", "Mendez Pelaez", "2222-222", 123.4, 10);
		Empleado ebc=new EmpleadoBaseMasComision("Vanesa", "Alcantara Tello", "3333-333", 12.8, 3, 13.0);
		
		empleados.add(ea);
		empleados.add(eph);
		empleados.add(epc);
		empleados.add(ebc);
		
		System.out.println("Empleados procesados en forma polimorfica");
		
		//procesa en forma generica a cada empleado
		for (Empleado empleado : empleados) {
			System.out.println(empleado);
			//determinar si el empleado es un EmpleadoBaseMasComision
			if(empleado instanceof EmpleadoBaseMasComision){
				//conversion descente ( especializando) de la referencia de Empleado
				//a un referencia de EmpleadoBaseMasComision
				EmpleadoBaseMasComision empleadobase=(EmpleadoBaseMasComision)empleado;
				empleadobase.setSalarioBase(1.10*empleadobase.getSalarioBase());
				
				System.out.println("El nuevo salario de empleado base es:"+empleadobase.getSalarioBase());
			}
		}
		

	}

}

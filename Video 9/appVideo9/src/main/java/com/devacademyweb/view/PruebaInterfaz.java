package com.devacademyweb.view;

import java.util.ArrayList;
import java.util.List;

import com.devacademyweb.entity.Empleado;
import com.devacademyweb.entity.EmpleadoAsalariado;
import com.devacademyweb.entity.Factura;
import com.devacademyweb.interfaces.PorPagar;

public class PruebaInterfaz {

	public static void main(String[] args) {
		List<PorPagar> lista=new ArrayList<PorPagar>();
		
		Empleado ea=new EmpleadoAsalariado("Henry", "Mendoza Puerta", "111-111", 1234.00);
		Factura f=new Factura("123", "Ninguno", 3, 123);
		
		lista.add(ea);
		lista.add(f);
		
		System.out.println("Factura y Empleados procesados en forma polimorfica");
		
		for (PorPagar porPagar : lista) {
			System.out.println(porPagar.toString());
			System.out.println("Pago:"+porPagar.obtenerMontoPago());
		}
		
	}
}

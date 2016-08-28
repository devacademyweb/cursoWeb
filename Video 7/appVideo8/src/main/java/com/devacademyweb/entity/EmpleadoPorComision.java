 package com.devacademyweb.entity;

// La clase EmpleadoPorComision extiende a Empleado.

public class EmpleadoPorComision extends Empleado {
	
	private double ventasBrutas; // ventas totales por semana
	private double tarifaComision; // porcentaje de comision

	public EmpleadoPorComision(String primerNombre, String apellidoPaterno,
			String numeroSeguroSocial,double ventasBrutas,double tarifaComision) {
		super(primerNombre, apellidoPaterno, numeroSeguroSocial);
		// TODO Auto-generated constructor stub
		this.ventasBrutas=ventasBrutas;
		this.tarifaComision=tarifaComision;
	}

	public double getVentasBrutas() {
		return ventasBrutas;
	}

	public void setVentasBrutas(double ventasBrutas) {
		this.ventasBrutas = ventasBrutas;
	}

	public double getTarifaComision() {
		return tarifaComision;
	}

	public void setTarifaComision(double tarifaComision) {
		this.tarifaComision = tarifaComision;
	}

	@Override
	public double ingresos() {
		// TODO Auto-generated method stub
		return getTarifaComision()*getVentasBrutas();
	}

	@Override
	public String toString() {
		return "EmpleadoPorComision [ventasBrutas=" + ventasBrutas + ", tarifaComision=" + tarifaComision
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	// return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f",

}

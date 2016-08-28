package com.devacademyweb.entity;

// La clase EmpleadoBaseMasComision extiende a EmpleadoPorComision.

public class EmpleadoBaseMasComision extends EmpleadoPorComision {
	

	private double salarioBase; // salario base por semana

	public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
			double ventasBrutas, double tarifaComision,double salarioBase) {
		super(primerNombre, apellidoPaterno, numeroSeguroSocial, ventasBrutas, tarifaComision);
		this.salarioBase=salarioBase;
		// TODO Auto-generated constructor stub
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	@Override
	public double ingresos() {
		// TODO Auto-generated method stub
		return getSalarioBase()+super.ingresos();
	}

	@Override
	public String toString() {
		return "EmpleadoBaseMasComision [salarioBase=" + salarioBase + ", toString()=" + super.toString() + "]";
	}
	
	
	// return String.format( "%s %s; %s: $%,.2f",

}

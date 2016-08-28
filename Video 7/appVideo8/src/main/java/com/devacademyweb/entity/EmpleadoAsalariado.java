package com.devacademyweb.entity;

// La clase concreta EmpleadoAsalariado extiende a la clase abstracta Empleado.

public class EmpleadoAsalariado extends Empleado {

	private double salarioSemanal;

	public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
			double salarioSemanal) {
		super(primerNombre, apellidoPaterno, numeroSeguroSocial);
		setSalarioSemanal( salarioSemanal) ;
		// TODO Auto-generated constructor stub
	}
	// String.format( "empleado asalariado: %s\n%s: $%,.2f",

	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		if (salarioSemanal >= 0.0)
			this.salarioSemanal = salarioSemanal;
		else
			throw new IllegalArgumentException("EL salario semanal debe ser >=0.0");
	}

	@Override
	public double ingresos() {
		// TODO Auto-generated method stub
		return salarioSemanal;
	}

	@Override
	public String toString() {
		return "EmpleadoAsalariado [salarioSemanal=" + salarioSemanal + ", toString()=" + super.toString() + "]";
	}

}

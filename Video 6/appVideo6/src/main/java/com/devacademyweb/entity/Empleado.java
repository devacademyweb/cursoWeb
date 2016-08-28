package com.devacademyweb.entity;

public class Empleado {
	private String primerNombre;
	private String apellidoPaterno;

	private Fecha fechaNacimiento;
	private Fecha fechaContratacion;

	// Atributos de clase
	private static int cuenta = 0;// numero de objetos empleados creados

	public Empleado(String nombre, String apellido, Fecha fechaDeNacimiento, Fecha fechaDeContratacion) {
		this.primerNombre = nombre;
		this.apellidoPaterno = apellido;
		this.fechaNacimiento = fechaDeNacimiento;
		this.fechaContratacion = fechaDeContratacion;

	}

	public Empleado(String nombre, String apellido) {
		this.primerNombre = nombre;
		this.apellidoPaterno = apellido;
		++cuenta;// incrementa la variable static cuenta de empleados

		System.out.printf("Constructor de empleado: %s %s: cuenta=%d\n", this.primerNombre, this.apellidoPaterno,
				cuenta);

	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Fecha getFechaContratacion() {
		return fechaContratacion;
	}

	public void setFechaContratacion(Fecha fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s, %s Contratado: %s Cumpleaños: %s", this.primerNombre, this.apellidoPaterno,
				this.fechaContratacion, this.fechaNacimiento);
	}

	public  static int obtenerCuenta() {
		return cuenta;
	}
}

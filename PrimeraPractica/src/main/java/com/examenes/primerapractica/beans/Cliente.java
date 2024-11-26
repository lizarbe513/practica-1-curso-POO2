package com.examenes.primerapractica.beans;

public class Cliente {
	private String Nombres;
	private String Apellidos;
	private String DNI;
	private String FechaDeNacimiento;
	private String Direccion;
	
	public Cliente() {
		super();

	}
	
	public Cliente(String nombres, String apellidos, String dNI, String fechaDeNacimiento, String direccion) {
		super();
		Nombres = nombres;
		Apellidos = apellidos;
		DNI = dNI;
		FechaDeNacimiento = fechaDeNacimiento;
		Direccion = direccion;
	}
	
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getFechaDeNacimiento() {
		return FechaDeNacimiento;
	}
	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		FechaDeNacimiento = fechaDeNacimiento;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	
	
}

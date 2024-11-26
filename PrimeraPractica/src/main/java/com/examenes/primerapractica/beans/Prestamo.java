package com.examenes.primerapractica.beans;

public class Prestamo {
	private int IdPrestamo;
	private String FechaDePrestamo;
	private Double MontoDePrestamo;
	private String ReferenciaDelCliente;
	private int Interes;
	private int NumeroDeCuotas;
	
	public Prestamo() {
		super();
	}

	public Prestamo(String fechaDePrestamo, Double montoDePrestamo, String referenciaDelCliente, int interes,
			int numeroDeCuotas) {
		super();
		FechaDePrestamo = fechaDePrestamo;
		MontoDePrestamo = montoDePrestamo;
		ReferenciaDelCliente = referenciaDelCliente;
		Interes = interes;
		NumeroDeCuotas = numeroDeCuotas;
	}

	public String getFechaDePrestamo() {
		return FechaDePrestamo;
	}

	public void setFechaDePrestamo(String fechaDePrestamo) {
		FechaDePrestamo = fechaDePrestamo;
	}

	public Double getMontoDePrestamo() {
		return MontoDePrestamo;
	}

	public void setMontoDePrestamo(Double montoDePrestamo) {
		MontoDePrestamo = montoDePrestamo;
	}

	public String getReferenciaDelCliente() {
		return ReferenciaDelCliente;
	}

	public void setReferenciaDelCliente(String referenciaDelCliente) {
		ReferenciaDelCliente = referenciaDelCliente;
	}

	public int getInteres() {
		return Interes;
	}

	public void setInteres(int interes) {
		Interes = interes;
	}

	public int getNumeroDeCuotas() {
		return NumeroDeCuotas;
	}

	public void setNumeroDeCuotas(int numeroDeCuotas) {
		NumeroDeCuotas = numeroDeCuotas;
	}
	
	
}

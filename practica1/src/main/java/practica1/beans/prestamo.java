package practica1.beans;

public class prestamo {

	private String clientereferenciaid;
	
	private String fechaprestamo;
	private double montoprestamo;
	private int interes;
	private int cuotas;
	
	public prestamo() {
	}
	
	public prestamo(String clientereferenciaid, String fechaprestamo, double montoprestamo, int interes, int cuotas) {
		this.clientereferenciaid = clientereferenciaid;
		this.fechaprestamo = fechaprestamo;
		this.montoprestamo = montoprestamo;
		this.interes = interes;
		this.cuotas = cuotas;
	}
	
	public String getClientereferenciaid() {
		return clientereferenciaid;
	}
	public void setClientereferenciaid(String clientereferenciaid) {
		this.clientereferenciaid = clientereferenciaid;
	}
	public String getFechaprestamo() {
		return fechaprestamo;
	}
	public void setFechaprestamo(String fechaprestamo) {
		this.fechaprestamo = fechaprestamo;
	}
	public double getMontoprestamo() {
		return montoprestamo;
	}
	public void setMontoprestamo(double montoprestamo) {
		this.montoprestamo = montoprestamo;
	}
	public int getInteres() {
		return interes;
	}
	public void setInteres(int interes) {
		this.interes = interes;
	}
	public int getCuotas() {
		return cuotas;
	}
	public void setCuotas(int cuotas) {
		this.cuotas = cuotas;
	}
	
	
}

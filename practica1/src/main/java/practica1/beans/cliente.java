package practica1.beans;

public class cliente {

	private String dniid;
	
	private String nombres;
	private String apellidos;
	private String fechanacimiento;
	private String direccion;
	
	public cliente() {
	}
	
	public cliente(String dniid, String nombres, String apellidos, String fechanacimiento, String direccion) {
		this.dniid = dniid;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fechanacimiento = fechanacimiento;
		this.direccion = direccion;
	}
	
	public String getDniid() {
		return dniid;
	}
	public void setDniid(String dniid) {
		this.dniid = dniid;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}

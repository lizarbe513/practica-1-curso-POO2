package com.examenes.primerapractica.models;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.examenes.primerapractica.beans.Cliente;

public class ClientesModel extends Conexion {
	CallableStatement cs;
	ResultSet rs;
	
	public List<Cliente> listarClientes() {
		try {
			this.abrirConexion();
			List<Cliente> lista = new ArrayList<>();
			
			cs = conexion.prepareCall("select * from clientes");
			rs = cs.executeQuery();
			
			while (rs.next()) {
				Cliente clienti = new Cliente();
				clienti.setApellidos(rs.getString("Apellidos"));
				clienti.setDireccion(rs.getString("Direccion"));
				clienti.setDNI(rs.getString("DNI"));
				clienti.setFechaDeNacimiento(rs.getString("Fecha_De_Nacimiento"));
				clienti.setNombres(rs.getString("Nombres"));
				
				lista.add(clienti);
			}
			this.cerrarConexion();
			return lista;

		} catch (Exception e) {
			e.printStackTrace();
			this.cerrarConexion();
			return null;
		}
	}
	
	public void NuevoCliente(String NuevoNombre, String NuevoApellidos, String NuevoDNI, String NuevoFechaDeNacimiento, String NuevoDireccion) {
		try {
			this.abrirConexion();
			cs= conexion.prepareCall("insert into clientes(DNI, Nombres, Apellidos, Fecha_De_Nacimiento, Direccion) "
					+ "values ('"+NuevoDNI+"','"+NuevoNombre+"','"+NuevoApellidos+"','"+NuevoFechaDeNacimiento+"','"+NuevoDireccion+"')");
			cs.execute();
			this.cerrarConexion();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void EditarCliente(String DNI, String NuevoNombre, String NuevoApellidos, String NuevoDNI, String NuevoFechaDeNacimiento, String NuevoDireccion) {
		try {
			this.abrirConexion();
			cs=conexion.prepareCall("update clientes set Nombres='"+NuevoNombre+"', Apellidos='"+NuevoApellidos+"', DNI='"+NuevoDNI+"', Fecha_De_Nacimiento='"+NuevoFechaDeNacimiento+"', Direccion='"+NuevoDireccion+"' "
					+ "where DNI='"+DNI+"'");
			cs.execute();
			this.cerrarConexion();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	
}

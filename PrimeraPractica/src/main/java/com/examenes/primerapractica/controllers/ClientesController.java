package com.examenes.primerapractica.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.examenes.primerapractica.models.ClientesModel;

@WebServlet("/ClientesController")
public class ClientesController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ClientesModel modelo = new ClientesModel();

	public ClientesController() {
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
    	if(request.getParameter("op") == null) {
    		listar(request, response);
    		return;
    	}
    	
    	String operacion = request.getParameter("op");
    	switch (operacion) {
		case "listar": {
			listar(request, response);
			break;
		}
		
		case "nuevo":{
			NuevoCliente(request, response);
			break;
		}
		
		case "editar":{
			EditarCliente(request, response);
			break;
		}
			
		}
		
    }

	protected void listar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("ListaClientes", modelo.listarClientes());
		request.getRequestDispatcher("/Clientes/ListarClientes.jsp").forward(request, response);
	}

	protected void NuevoCliente(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		modelo.NuevoCliente(request.getParameter("nombres"), request.getParameter("apellidos"),
				request.getParameter("dni"), request.getParameter("fechanacimiento"),
				request.getParameter("direccion"));
		listar(request, response);
	}
	
	protected void EditarCliente(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		modelo.EditarCliente(request.getParameter("AnteriorDNI"),request.getParameter("nombres"), request.getParameter("apellidos"),
				request.getParameter("dni"), request.getParameter("fechanacimiento"),
				request.getParameter("direccion"));
		listar(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

}

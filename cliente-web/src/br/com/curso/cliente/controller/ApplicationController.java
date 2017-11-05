package br.com.curso.cliente.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.curso.cliente.IControlerTask;

public class ApplicationController extends HttpServlet {

	private static final long serialVersionUID = -2577668947352968272L;

	private final String PACKAGE_NAME = "br.com.curso.cliente.controller.actions.";

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String tarefa = req.getParameter("tarefa");
		
		if (tarefa == null)
			throw new IllegalArgumentException("Você esqueceu de passar a tarefa");
		
		try {
			
			String nomeDaClasse = getInstanceName(req);
			
			Class<?> type = Class.forName(nomeDaClasse);			
			IControlerTask instancia = (IControlerTask) type.newInstance();
			String pagina = instancia.executar(req, resp);
			
			RequestDispatcher requestDispatcher = req.getRequestDispatcher(pagina);
			requestDispatcher.forward(req, resp);
			
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	private String getInstanceName(HttpServletRequest req) {

		String tarefa = req.getParameter("tarefa");
		String nameClass = "";
		
		if (tarefa.equalsIgnoreCase("busca"))
			nameClass = "Consulta";

		return PACKAGE_NAME + nameClass;

	}

}

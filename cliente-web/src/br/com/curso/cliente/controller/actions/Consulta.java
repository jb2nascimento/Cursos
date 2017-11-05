package br.com.curso.cliente.controller.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.curso.cliente.IControlerTask;
import br.com.curso.cliente.dao.ClienteDao;
import br.com.curso.cliente.enums.EnumPaginas;
import br.com.curso.cliente.model.Cliente;

public class Consulta implements IControlerTask {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse resp) {
		String filtro = req.getParameter("filtro");
		List<Cliente> clientes = new ClienteDao().buscarCliente(filtro);
		req.setAttribute("clientes", clientes);
		return EnumPaginas.ConsultaCliente.getPage();
	}

}

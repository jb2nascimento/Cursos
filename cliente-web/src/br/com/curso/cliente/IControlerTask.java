package br.com.curso.cliente;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IControlerTask {	
	
	String executar(HttpServletRequest req, HttpServletResponse resp);

}

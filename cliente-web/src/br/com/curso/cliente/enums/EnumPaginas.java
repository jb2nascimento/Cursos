package br.com.curso.cliente.enums;

public enum EnumPaginas {
	
	NovoCliente("/manutencao.jsp"),
	
	ConsultaCliente("/index.jsp");
	
	private EnumPaginas(String page) {
		this.page = page;
	}
	
	private String page;
	
	public String getPage() {
		return this.page;
	}
	
	

}

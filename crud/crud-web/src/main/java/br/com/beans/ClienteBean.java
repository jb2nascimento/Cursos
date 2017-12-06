package br.com.beans;

import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;

import br.com.cliente.Cliente;
import br.com.crud.service.CrudFactory;
import br.com.crud.service.IClienteService;
import lombok.Data;

@Data
public class ClienteBean {

	private List<Cliente> todosOsClientes;

	private IClienteService clienteService;

	private String termoPesquisa;

	private String indiceClienteClicado;

	private Cliente clienteAEditar;

	public ClienteBean() {
		carregarClientes();
	}

	public void carregarClientes() {
		clienteService = CrudFactory.getInstance();
		todosOsClientes = clienteService.recuperarTodosClientes();
	}

	public String manutencao() {
		return "manutencao";
	}

	public String voltarPaginaPrincipal() {
		return "index";
	}

	@SuppressWarnings("unchecked")
	public String atualizarCliente() {

		Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
		String id = params.get("id");

		if (StringUtils.isNotEmpty(id) && NumberUtils.isNumber(id)) {
			clienteAEditar = todosOsClientes.get(Integer.parseInt(id));
		}

		return "manutencao";
	}

	public String salvarCliente() {

		String paginaVoltar = "manutencao";

		if (StringUtils.isNotEmpty(clienteAEditar.getNome())
				&& StringUtils.isNotEmpty(clienteAEditar.getUltimo_nome())) {

			IClienteService service = CrudFactory.getInstance();
			service.salvarCliente(clienteAEditar);
			
			clienteAEditar = new Cliente();

			return "index";
		}

		return paginaVoltar;
	}

	public String pesquisarClientes() {

		if (StringUtils.isNotEmpty(this.termoPesquisa)) {
			clienteService = CrudFactory.getInstance();
			todosOsClientes = clienteService.filtrarClientes(termoPesquisa);
		}

		return "index";
	}

}

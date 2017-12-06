<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>


<t:div styleClass="container">

	<t:div styleClass="row">

		<h:form styleClass="col s12">

			<t:div styleClass="row">

				<t:div styleClass="input-field col s12">
					<t:inputText id="nomePesquisa" value="#{clienteBean.termoPesquisa}">
					</t:inputText>

					<t:div id="div-botao" style="float:right">

						<t:div style="margin-left:-185px">
							<t:commandButton action="#{clienteBean.pesquisarClientes}" value="Pesquisar"
								styleClass="waves-effect waves-light btn-large"
								id="btn-pesquisar" style="float:left">
							</t:commandButton>
						</t:div>
						<t:commandButton action="#{clienteBean.manutencao}" value="Novo"
							styleClass="waves-effect waves-light btn-large" id="btn-novo"
							style="float:left">
						</t:commandButton>

					</t:div>

				</t:div>

			</t:div>

			<t:dataTable var="cliente" value="#{clienteBean.todosOsClientes}"
				styleClass="tb-cliente">
				<h:column>
					<f:facet name="header">
						<h:outputText value="Nome" />
					</f:facet>
					<h:outputText value="#{cliente.nome }" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="Último Nome" />
					</f:facet>
					<h:outputText value="#{cliente.ultimo_nome}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="Idade" />
					</f:facet>
					<h:outputText value="#{cliente.idade}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="Ações" />
					</f:facet>
					<h:commandButton value="Editar" style="margin-right: 10px;" />					
					<h:commandButton value="Excluir" />
				</h:column>

			</t:dataTable>

		</h:form>

	</t:div>

</t:div>
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
					<t:inputText id="nomePesquisa" value="">
					</t:inputText>

					<t:commandButton action="" value="Pesquisar"
						styleClass="waves-effect waves-light btn" />

					<t:commandButton action="" value="Novo"
						styleClass="waves-effect waves-light btn" />

					<!-- Trabalho final: criar um Grid... -->

					<h:dataTable var="cliente1" value="#{clienteBean.todosOsClientes}">
						<h:column>
							<f:facet name="header">
								<h:outputText value="Nome" />
							</f:facet>
							<h:outputText value="#{cliente1.nome}" />
						</h:column>
						<h:column>
							<f:facet name="header">
								<h:outputText value="Sobrenome" />
							</f:facet>
							<h:outputText value="#{cliente1.ultimo_nome}" />
						</h:column>
						<h:column>
							<f:facet name="header">
								<h:outputText value="Idade" />
							</f:facet>
							<h:outputText value="#{cliente1.idade}" />
						</h:column>

						<!-- 	Editar...					 -->

						<h:column>
							<f:facet name="header">
								<h:outputText value="Ações" />
							</f:facet>
							<h:commandLink action="#{clienteBean.carregarClientes}">
								<t:updateActionListener
									property="#{clienteBean.todosOsClientes}" value="#{cliente1}" />
								<h:outputText value="Editar" />
							</h:commandLink>
						</h:column>



					</h:dataTable>



				</t:div>

			</t:div>

		</h:form>

	</t:div>

</t:div>
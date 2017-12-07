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

					<t:inputText id="nome" value="#{clienteBean.clienteAEditar.nome }" />

					<t:inputText id="sobrenome" value="#{clienteBean.clienteAEditar.ultimo_nome }" />

					<t:inputText id="idade" value="#{clienteBean.clienteAEditar.idade }" />

					<t:div id="div-botao" style="float:right">

						<t:div style="margin-left:-160px">
							<t:commandButton action="#{clienteBean.salvarCliente}" value="Salvar"
								styleClass="waves-effect waves-light btn-large" id="btn-salvar"
								style="float:left" onclick="aparecerLoading();">
							</t:commandButton>
						</t:div>
						<t:commandButton action="#{clienteBean.voltarPaginaPrincipal}" value="Cancelar"
							styleClass="waves-effect waves-light btn-large" id="btn-cancelar"
							style="float:left">
						</t:commandButton>

					</t:div>

				</t:div>

			</t:div>

		</h:form>

	</t:div>

</t:div>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Manutenção Cliente</title>
</head>

<body>
 
	<f:view>

		<h:form> 

			<h:panelGrid columns="1"> 

				<h:outputLabel value="Nome:" />
				<h:inputText value="#{clienteBean.nome }" />

				<h:outputLabel value="Idade:" />
				<h:inputText value="#{clienteBean.ultimo_nome }" />

				<h:outputLabel value="Telefone" />
				<h:inputText value="#{clienteBean.idade }" />

			

			</h:panelGrid>

			<h:messages />

		</h:form>

	</f:view>
	
</body>

</html>
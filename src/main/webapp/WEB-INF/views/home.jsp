<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de contatos</title>
</head>
<body>
	<form:form method="POST" modelAttribute="contato" action="/contato">
		<form:input path="nome"/>
		<form:input path="valor"/>
		<input type="submit" value="cadastrar"/>
	</form:form>
	
	<table>
	   <tr>
	      <th>Nome</th>
	      <th>Contato</th>
	    </tr>
		<c:forEach items="${listaContatos}" var="contato">
	       <tr>
	           <td><c:out value="${contato.nome}"/></td>
	           <td><c:out value="${contato.valor}"/></td>
	        </tr>
	    </c:forEach>
	</table>	
</body>
</html>
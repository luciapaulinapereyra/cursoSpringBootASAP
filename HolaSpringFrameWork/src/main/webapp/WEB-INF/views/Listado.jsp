<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>${titulo}</title>
</head>
<div class="container">
<h1>PROFESOR ${profesor}</h1>

<h2>Lista de alumnos</h2>
	<table class="table table-bordered">
	<tr>
	<th>codigo</th><th>nombre</th><th>apellido</th><th>repositorio</th>
	</tr>
		<c:forEach items="${alumnos}" var="alumno">
			<tr>
				<td><c:out value="${alumno.getCodigo()}"/>  </td>
				<td><c:out value="${alumno.getNombre()}"/>  </td>
				<td><c:out value="${alumno.getApellido()}"/></td>
				<td><c:out value="${alumno.getLinkArepositorio()}"/></td> 
			</tr>
		</c:forEach>
	</table>
	
</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Piedra, Papel, Tijera, Lagarto y Spock</title>
</head>
<body>

<form action ="http://localhost:8080/HolaSpringFrameWork/resolverJuego" method ="GET">
<h1> Elija una opción </h1>
    <select name ="selOpcion">
       <c:forEach items = "${opciones}" var= "opcion">
             <option value ="${opcion.getNumero()}"> ${opcion} </option>
        </c:forEach>
    </select>
    <button type="submit"> Enviar </button>
    </form>
</body>
</html>
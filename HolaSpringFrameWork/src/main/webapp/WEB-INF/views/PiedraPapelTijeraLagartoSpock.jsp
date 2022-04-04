<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title> Piedra, Papel, Tijera, Lagarto y Spock</title>
</head>
<body>

   <!-- Estilos con CSS -->
  <style type="text/css">
     h1 {
      color:#B82676;
      text-align:center;
      margin:auto;
     }
     
     .opcion {
       color:white; !important
     }
  </style>
<form action ="http://localhost:8080/HolaSpringFrameWork/resolverJuego" method ="GET">
<h1 class="display-3"> Elija una opción </h1>
<br>
    <select class="form-select opcion" style="background-color:#B82676" name ="selOpcion">
       <c:forEach items = "${opciones}" var= "opcion">
             <option class="opcion" value ="${opcion.getNumero()}"> ${opcion} </option>
        </c:forEach>
    </select>
    <br>
    <br>
    <button type="submit" class="btn btn-outline-danger btn-lg button"> Enviar </button>
    </form>
</body>
</html>
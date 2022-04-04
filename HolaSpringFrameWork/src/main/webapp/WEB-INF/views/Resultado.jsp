<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Resultadoooooo</title>
</head>
<body>


   <!-- Estilos con CSS -->
  <style type="text/css">
     h1 {
      color:#B82676;
      text-align:center;
      margin:auto;
     }
     
     h2 {
      color:#E35F5B; 
      text-align:center;
      margin:auto;
     }
     a {
       text-decoration:none;
       color:inherit;
     } 
     a:hover{
       color:white;
     }
  </style>
  
    <h1> Resultado del juego</h1>
    <h2> El jugador eligió:</h2>
    
      <h2> ${jugador} </h2>
      <br/>
    <h2> La computadora eligió:</h2>

      <h2> ${computadora} </h2>
       <br/>
       <h1> ${resultado}</h1>
       <br>
       <br>
       <button class="btn btn-outline-danger btn-lg button"> <a href="http://localhost:8080/HolaSpringFrameWork/juego"> Volver a jugar  </a> </button>
</body>
</html>
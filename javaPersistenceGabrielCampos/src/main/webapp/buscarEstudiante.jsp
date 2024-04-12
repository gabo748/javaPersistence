<%--
  Created by IntelliJ IDEA.
  User: gabri
  Date: 4/11/2024
  Time: 8:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Estudiante a buscar</title>
</head>
<body>
<h2>Estudiante a buscar con id: ${estudianteID}</h2>

<h3>Datos del estudiante encontrado</h3>
<p>
    Nombres: ${estudiante1.nombres}
</p>
<p>
    Apellidos: ${estudiante1.apellidos}
</p>
<p>
    Carnet: ${estudiante1.carnet}
</p>

<h2>Estudiante a buscar por carnet: ${estudianteCarnet}</h2>

<h3>Datos del estudiante encontrado</h3>
<p>
    Nombres: ${estudiante2.nombres}
</p>
<p>
    Apellidos: ${estudiante2.apellidos}
</p>
<p>
    Carnet: ${estudiante2.carnet}
</p>


</body>
</html>

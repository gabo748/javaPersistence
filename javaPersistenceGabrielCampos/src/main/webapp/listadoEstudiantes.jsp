<%--
  Created by IntelliJ IDEA.
  User: UFG
  Date: 8/4/2024
  Time: 07:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Listado de estudiantes</h1>
<%--    <ul>--%>
<%--        <li>Carnet: ${estudiante.carnet}</li>--%>
<%--        <li>Nombres: ${estudiante.nombres}</li>--%>
<%--        <li>Apellidos: ${estudiante.apellidos}</li>--%>
<%--    </ul>--%>

    <ul>
        <c:forEach var="estudiante" items="${estudiantes}">
            <li>${estudiante.carnet} ${estudiante.nombres}</li>
        </c:forEach>
    </ul>

</body>
</html>

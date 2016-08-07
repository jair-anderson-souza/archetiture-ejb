<%-- 
    Document   : index
    Created on : Aug 6, 2016, 1:49:23 PM
    Author     : des02
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <title>TODO supply a title</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    </head>
    <body>
        <a href="index.jsp">Cadatrar Pessoas</a>
        <table>
            <tr>
                <th>Nome</th>
                <th>Idade</th>
            </tr>
            <c:forEach var="pessoa" items="${sessionScope.pessoas}">

                <tr>
                    <td>${pessoa.nome}</td>
                    <td>${pessoa.idade}</td>
                </tr>
        </table> 
    </c:forEach>

</body>
</html>

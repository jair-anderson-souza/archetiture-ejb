<%-- 
    Document   : index
    Created on : Aug 6, 2016, 1:49:23 PM
    Author     : des02
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <a href="lista">Ver lista de Pessoa cadastradas</a>

        <form action="add" method="post">

            <label>Nome</label>
            <input name="nome" type="text"/>        

            <br/>

            <label>Idade</label>
            <input name="idade" type="text"/>  

            <br/>

            <input type="submit" value="Cadastrar Pessoa" />

        </form>



    </body>
</html>


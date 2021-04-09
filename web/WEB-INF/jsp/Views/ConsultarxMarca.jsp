<%-- 
    Document   : ConsultarxMarca
    Author     : KEVIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="Header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <div class="container" style="margin-top: 80px">
            <form:form cssClass="navbar-form" method="post" commandName="produ">
                    <div class="text-center p-3">
                        <h3>Consulta en la vitrina por MARCA</h3>
                    </div>
                    <div>
                        <div class="form-group">
                            <form:label path="Marca" cssClass="input-group-addon">Marca a buscar: </form:label>
                            <form:input path="Marca" cssClass="form-control"></form:input>
                        </div>
                        <form:button name="Enviar" class="btn btn-primary btn-lg">Consultar</form:button>
                        <a class="btn btn-primary btn-lg" href="index.htm" role="button">Regresar</a>
                    </div>
            </form:form>
        </div>
        <div class="footer">
            <h6>COPYRIGHT SENA CBA MOSQUERA | 2021 </h6>
        </div>
    </body>
</html>

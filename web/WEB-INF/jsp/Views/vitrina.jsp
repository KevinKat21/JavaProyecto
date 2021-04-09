<%-- 
    Document   : vitrina
    Author     : KEVIN
--%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@include file="Header.jsp" %>
 <br>
    <body>
    <center>
        <div class="container" style="margin-top: 80px">
            <form:form cssClass="navbar-form " method="post" commandName="produ">
                <form:button name="Enviar" class="btn btn-primary btn-lg">Visitar Vitrina</form:button><br><br>
                    <a class="btn btn-primary btn-lg" href="../index.htm" role="button" >Regresar</a>
            </form:form>
        </div>
    </center>
        <div class="footer">
            <h6>COPYRIGHT SENA CBA MOSQUERA | 2021 </h6>
        </div>
    </body>
</html>

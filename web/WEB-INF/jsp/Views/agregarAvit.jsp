<%-- 
    Document   : agregarAvit
    Author     : KEVIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="Header.jsp" %>
    <body>
        <div class="container" >
            <div class="text-center p-3">
                <h3>Agregar a Vitrina</h3>                    
            </div>
            <div>
                <form:form commandName="produ" method="post">
                    <form:errors path="*"></form:errors>
                    <div class="form-group">
                        <form:label path="Marca" cssClass="input-group-addon">Ingrese la Marca del automotor: </form:label>
                        <form:input path="Marca" cssClass="form-control"></form:input>
                    </div>
                    <div class="form-group">
                        <form:label path="Modelo" cssClass="input-group-addon">Ingrese el Modelo del automotor: </form:label>
                        <form:input path="Modelo" cssClass="form-control"></form:input>
                    </div>
                    <div class="form-group">
                        <form:label path="Cilindraje" cssClass="input-group-addon">Ingrese el Cilindraje del automotor: </form:label>
                        <form:input path="Cilindraje" cssClass="form-control"></form:input>
                    </div>
                    <div class="form-group">
                        <form:label path="Precio" cssClass="input-group-addon">Ingrese el Precio del automotor: </form:label>
                        <form:input path="Precio" cssClass="form-control"></form:input>
                    </div>   

                    <form:button value="Enviar_datos" class="btn btn-primary btn-md">Cargar Automotor</form:button>
                    <input type="reset" value="Limpiar" class="btn btn-primary btn-md"/>
                    <a href="vitrina.htm" class="btn btn-primary btn-md">Regresar</a>
                </form:form>
            </div>
        </div>
        <div class="footer">
            <h6>COPYRIGHT SENA CBA MOSQUERA | 2021 </h6>
        </div>
    </body>
</html>


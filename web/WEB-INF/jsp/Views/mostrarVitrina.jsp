<%-- 
    Document   : mostrarVitrina
    Author     : KEVIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="Header.jsp" %>
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.24/css/jquery.dataTables.css">
    <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.24/js/jquery.dataTables.js"></script>
    <script>
        $(document).ready( function () {
            $('#listadoTabla').DataTable({
                "paging":true,
                "buttons":true,
                "lenghtMenu": [[5,10,25,50,-1], [5,10,25,50,"All"]],
                "language": {
                    "url":"https://cdn.datatables.net/plug-ins/1.10.19/i18n/Spanish.json"
                },
                "paginate":true
            });
        } );
    </script>
    <body>
    <center>
        <br>
        <div>
            <a href="agregarAvit.htm" class="btn btn-success">Agregar a Vitrina</a>
        </div>
    </center>
        <div class="container-fluid">
            <table id="listadoTabla" class="table table-bordered table-striped table-hover">
                <thead>
                    <th>Id</th>
                    <th>Marca</th>
                    <th>Modelo</th>
                    <th>Cilindraje</th>
                    <th>Precio</th>
                    <th>Acciones</th>
                </thead>
                <tbody>
                    <c:forEach items="${produ}" var="dato">
                    <tr>
                        <td><c:out value="${dato.Id}"></c:out></td>
                        <td><c:out value="${dato.Marca}"></c:out></td>
                        <td><c:out value="${dato.Modelo}"></c:out></td>
                        <td><c:out value="${dato.Cilindraje}"></c:out></td>
                        <td><c:out value="${dato.Precio}"></c:out></td>
                        <td>
                            <a href="actualizarVit.htm?Id=${dato.Id}" class="btn btn-warning">Editar</a> 
                            <a href="borrarProdu.htm?Id=${dato.Id}" class="btn btn-danger">¡Eliminar!</a>
                        </td>
                    </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
        <div class="footer">
            <h6>COPYRIGHT SENA CBA MOSQUERA | 2021 </h6>
        </div>
    </body>
</html>



<!DOCTYPE html>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.ArticuloDAO"%>
<%@page import="Modelo.Articulo"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>Farmacos</h1>
            <!-- Se crea la tabla que mostrara los datos con los campos correspondientes-->
            <table border="1">
                <thead>
                    <tr>
                        <th>ID_Pos</th>
                        <th>Posicion Nro.</th>
                        <th>Traer</th>
                        <th>Llevar</th>
                        <th>Estado</th>
                        <th>Nombre</th>
                        <th>Descripcion</th>
                        <th>Cantidad</th>
                        <th>Foto</th>
                    </tr>
                </thead>
                <%
                    ArticuloDAO dao = new ArticuloDAO();
                    List<Articulo>list = dao.listar();
                    Iterator<Articulo>iter = list.iterator();
                    Articulo art = null;
                    while (iter.hasNext()){
                        art = iter.next();
                    %>
                <tbody>
                    <tr>
                        <td><%= art.getId()%></td>
                        <td><%= art.getPos()%></td>
                        <td><%= art.getTraer()%></td>
                        <td><%= art.getLlevar()%></td>
                        <td><%= art.getEstado()%></td>
                        <td><%= art.getNombre()%></td>
                        <td><%= art.getDescripcion()%></td>
                        <td><%= art.getCantidad()%></td>
                        <td><%= art.getFoto()%></td>                       
                        <td>
                            <a>Editar</a>
                            <a>Remover</a>
                        </td>
                    </tr>
                     <%}%>
                </tbody>
            </table>

        </div>
    </body>
</html>

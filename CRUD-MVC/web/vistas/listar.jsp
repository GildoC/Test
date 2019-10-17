<%-- 
    Document   : listar
    Created on : 05-oct-2019, 18:55:44
    Author     : Gildo
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.PersonaDAO"%>
<%@page import="Modelo.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>Personas</h1>
            <!-- Se crea la tabla que mostrara los datos con los campos correspondientes-->
            <table border="1">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>DNI</th>
                        <th>NOMBRES</th>
                        <th>ACCIONES</th>
                    </tr>
                </thead>
                <%
                    PersonaDAO dao = new PersonaDAO();  //instanciamos la clase PersonaDAO para adquirir los metodos listar y otros de acceso a la base de datos
                    List<Persona>list = dao.listar();   //creamos una lista para ir volcando en la variable persona los valores recibidos
                    Iterator<Persona>iter = list.iterator();    //creamos un iterator para recorredr la lista list
                    Persona per = null;     //variable a utilizar en el iterador
                    while(iter.hasNext()){
                        per = iter.next();
                    //movemos la llave al final de la tabla
                %>
                <tbody>
                    <tr>
                        <td><%= per.getId()%></td>      <!--se obtiene de per el valor almacenado en cada atributo, el nombre debe ser el mismo que el definido en la fucion listar de PersonaDAO-->
                        <td><%= per.getDni()%></td>
                        <td><%= per.getNom()%></td>
                        <td>
                            <a>Editar</a>
                            <a>Remove</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>
    </body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="org.usco.lcms.inscripcion.ProgramaControlador"%>
<%@ page import="org.usco.lcms.inscripcion.Programa"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Nombre</th>
		</tr>
		<%
			ProgramaControlador controlador = new ProgramaControlador();
			ArrayList<Programa> lista = controlador.getProgramas();

			for (int i = 0; i < lista.size(); i++) {
				Programa programa = lista.get(i);
		%>
		<tr>
			<td><%=programa.getId()%></td>
			<td><%=programa.getNombre()%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>
<%@ page import="org.usco.lcms.inscripcion.Persona"%>
<%@ page import="org.usco.lcms.inscripcion.Programa"%>
<%@ page import="org.usco.lcms.inscripcion.Inscripcion"%>
<%@ page import="org.usco.lcms.inscripcion.Estudiante"%>
<%@ page import="org.usco.lcms.inscripcion.Docente"%>
<html>
<body>
	<h2>Hello USCO - OBJETOS</h2>
	<%
		Persona persona1 = new Persona();
		persona1.setId(12);
		persona1.setApellido("Diaz");
		persona1.setNombre("Jankarlos");

		//persona1.imprimir();
		out.println("<p>Id:" + persona1.getId() + "</p>");
		out.println("<p>Nombre: " + persona1.getNombre() + "</p>");
		out.println("<p> Apellido: " + persona1.getApellido() + "</p>");

		Programa programa1 = new Programa();
		programa1.setId(10);
		programa1.setNombre("Ingenieria Civil");

		out.println("<p>Id: " + programa1.getId() + "</p>");
		out.println("<p>Nombre: " + programa1.getNombre() + "</p>");

		Inscripcion inscripcion1 = new Inscripcion();
		inscripcion1.setId(10);
		inscripcion1.setPersona(persona1);
		inscripcion1.setPrograma(programa1);

		out.println("<h2>Inscripciones</h2>");
		out.println("<p>Id: " + inscripcion1.getId() + "</p>");

		Persona persona = inscripcion1.getPersona();
		out.println("<p>Nombre: " + persona.getNombre() + "</p>");
		out.println("<p> Apellido: " + persona.getApellido() + "</p>");

		Programa programa = inscripcion1.getPrograma();
		out.println("<p>Programa: " + programa.getNombre() + "</p>");

		Estudiante estudiante1 = new Estudiante();
		estudiante1.setId(10);
		estudiante1.setApellido("lopez");
		estudiante1.setNombre("Maria");
		estudiante1.setCodigo("0987654");
		estudiante1.setPrograma(new Programa(12, "Enfermeria"));// setPrograma(new Programa(12, "Enfermeria"));
		//estudiante1.setPrograma(programa1);

		out.println("<h2>Estudiante</h2>");
		out.println("<p>Codigo: " + estudiante1.getCodigo() + "</p>");
		out.println("<p>Nombre: " + estudiante1.getNombre() + "</p>");
		out.println("<p> Apellido: " + estudiante1.getApellido() + "</p>");
		out.println("<p> Apellido: " + estudiante1.getPrograma().getNombre() + "</p>");
		
		
	%>
</body>
</html>

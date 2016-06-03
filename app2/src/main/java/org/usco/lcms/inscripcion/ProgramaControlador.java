/**
 * 
 */
package org.usco.lcms.inscripcion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.usco.lcms.utilidad.BaseDato;

/**
 * @author jankarlos
 *
 */
public class ProgramaControlador {

	public ArrayList<Programa> getProgramas() {
		ArrayList<Programa> listaPrograma = new ArrayList<Programa>();

		BaseDato basedato = new BaseDato();
		Connection conexion1 = null;
		Statement sentencia1 = null;
		ResultSet rs1 = null;
		String sql = "";
		try {
			conexion1 = basedato.getConexion();
			sentencia1 = conexion1.createStatement();
			sql = "SELECT pro_id, pro_nombre FROM programa";
			rs1 = sentencia1.executeQuery(sql);

			while (rs1.next()) {
				long id = rs1.getLong("pro_id");
				String nombre = rs1.getString("pro_nombre");
				System.out.println("Nombre " + nombre);
				Programa programa = new Programa();
				programa.setId(id);
				programa.setNombre(nombre);

				listaPrograma.add(programa);
			}

		} catch (Exception e) {
			System.out.println("Error " + e.toString());
		}

		return listaPrograma;
	}
}

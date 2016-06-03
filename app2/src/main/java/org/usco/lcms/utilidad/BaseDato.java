/**
 * 
 */
package org.usco.lcms.utilidad;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author jankarlos
 *
 */
public class BaseDato {

	public Connection getConexion() {
		Connection conexion = null;

		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/lcms";
		String user = "usco";
		String password = "usco";

		try {
			Class.forName(driver);
			conexion = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return conexion;
	}
}

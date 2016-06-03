/**
 * 
 */
package org.usco.lcms.utilidad;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * @author jankarlos
 *
 */
public class BaseDato {

	public Connection getConexion() {
		Connection conexion = null;
		/*
		 * String driver = "org.postgresql.Driver"; String url =
		 * "jdbc:postgresql://localhost:5432/lcms"; String user = "usco"; String
		 * password = "usco";
		 */

		Properties propiedades = getPropiedades();
		String driver = propiedades.getProperty("driver");
		String url = propiedades.getProperty("url");
		String user = propiedades.getProperty("user");
		String password = propiedades.getProperty("password");

		try {
			Class.forName(driver);
			conexion = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return conexion;
	}

	public Properties getPropiedades() {
		Properties prop = new Properties();
		InputStream input = null;
		try {
			input = this.getClass().getClassLoader().getResourceAsStream("basedatos.properties");
			prop.load(input);

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return prop;
	}
}

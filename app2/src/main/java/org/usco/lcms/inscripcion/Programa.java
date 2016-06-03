/**
 * 
 */
package org.usco.lcms.inscripcion;

/**
 * @author jankarlos
 * @version 1.0 Junio 02 de 2016
 *
 */
public class Programa {
	// Atributos
	private long id;
	private String nombre;

	/**
	 * 
	 */
	public Programa() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nombre
	 */
	public Programa(long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

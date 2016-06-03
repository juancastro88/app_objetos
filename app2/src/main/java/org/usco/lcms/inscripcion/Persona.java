/**
 * 
 */
package org.usco.lcms.inscripcion;

/**
 * @author jankarlos
 *
 */
public class Persona {
	private long id;
	private String apellido;
	private String nombre;
	private byte estrato;

	public void imprimir() {
		System.out.println(id + ", " + apellido + ", " + nombre);
	}

	/**
	 * @param id
	 * @param apellido
	 * @param nombre
	 */
	public Persona(long id, String apellido, String nombre, byte estrato) {
		super();
		this.id = id;
		this.apellido = apellido;
		this.nombre = nombre;
		this.estrato = estrato;
	}

	/**
	 * 
	 */
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
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
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido
	 *            the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
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

	/**
	 * @return the estrato
	 */
	public byte getEstrato() {
		return estrato;
	}

	/**
	 * @param estrato
	 *            the estrato to set
	 */
	public void setEstrato(byte estrato) {
		this.estrato = estrato;
	}

}

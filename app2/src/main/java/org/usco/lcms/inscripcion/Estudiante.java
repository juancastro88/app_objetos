/**
 * 
 */
package org.usco.lcms.inscripcion;

/**
 * @author jankarlos
 *
 */
public class Estudiante extends Persona {

	private String codigo;
	private Programa programa;

	/**
	 * 
	 */
	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param apellido
	 * @param nombre
	 * @param estrato
	 */
	public Estudiante(long id, String apellido, String nombre, byte estrato) {
		super(id, apellido, nombre, estrato);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param apellido
	 * @param nombre
	 * @param estrato
	 * @param codigo
	 * @param programa
	 */
	public Estudiante(long id, String apellido, String nombre, byte estrato, String codigo, Programa programa) {
		super(id, apellido, nombre, estrato);
		this.codigo = codigo;
		this.programa = programa;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo
	 *            the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the programa
	 */
	public Programa getPrograma() {
		return programa;
	}

	/**
	 * @param programa
	 *            the programa to set
	 */
	public void setPrograma(Programa programa) {
		this.programa = programa;
	}

}

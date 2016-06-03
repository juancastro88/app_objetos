/**
 * 
 */
package org.usco.lcms.inscripcion;

/**
 * @author jankarlos
 *
 */
public class Inscripcion {

	private long id;
	private Persona persona;
	private Programa programa;

	public boolean registrar() {
		return true;
	}

	public void imprimir() {
		System.out.println(id + ", " + persona.getNombre() + ", " + persona.getApellido());
	}

	/**
	 * @param id
	 * @param persona
	 * @param programa
	 */
	public Inscripcion(long id, Persona persona, Programa programa) {
		super();
		this.id = id;
		this.persona = persona;
		this.programa = programa;
	}

	/**
	 * 
	 */
	public Inscripcion() {
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
	 * @return the persona
	 */
	public Persona getPersona() {
		return persona;
	}

	/**
	 * @param persona
	 *            the persona to set
	 */
	public void setPersona(Persona persona) {
		this.persona = persona;
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

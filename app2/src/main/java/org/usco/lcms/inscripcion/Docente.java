/**
 * 
 */
package org.usco.lcms.inscripcion;

/**
 * @author jankarlos
 *
 */
public class Docente extends Persona {
	
	private Programa programa;
	private String titulo;
	/**
	 * 
	 */
	public Docente() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param apellido
	 * @param nombre
	 * @param estrato
	 */
	public Docente(long id, String apellido, String nombre, byte estrato) {
		super(id, apellido, nombre, estrato);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param apellido
	 * @param nombre
	 * @param estrato
	 * @param programa
	 * @param titulo
	 */
	public Docente(long id, String apellido, String nombre, byte estrato, Programa programa, String titulo) {
		super(id, apellido, nombre, estrato);
		this.programa = programa;
		this.titulo = titulo;
	}
	/**
	 * @return the programa
	 */
	public Programa getPrograma() {
		return programa;
	}
	/**
	 * @param programa the programa to set
	 */
	public void setPrograma(Programa programa) {
		this.programa = programa;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
}

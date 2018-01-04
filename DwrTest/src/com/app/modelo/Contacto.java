package com.app.modelo;


/**
 * The Class Contacto.
 */
public class Contacto extends Base{
	
	/** The codigo per. */
	private int codigoPer;
	
	/** The numero identificacion. */
	private String numeroIdentificacion;
	
	/** The primer nombre. */
	private String primer_nombre;
	
	/** The segundo nombre. */
	private String segundo_nombre;
	
	/** The primer apellido. */
	private String primer_apellido;
	
	/** The segundo apellido. */
	private String segundo_apellido;
	
	/** The email primario. */
	private String email_primario;
	
	/** The celular. */
	private String celular;
	
	/** The fecha nacimiento. */
	private String fechaNacimiento;
	
	/** The estado civil. */
	private String estadoCivil;
	
	/** The profesion. */
	private String profesion;
	
	/** The login contacto. */
	private String loginContacto;
	
	/**
	 * Gets the login contacto.
	 *
	 * @return the login contacto
	 */
	public String getLoginContacto() {
		return loginContacto;
	}
	
	/**
	 * Sets the login contacto.
	 *
	 * @param loginContacto the new login contacto
	 */
	public void setLoginContacto(String loginContacto) {
		this.loginContacto = loginContacto;
	}
	
	/**
	 * Gets the passwd contacto.
	 *
	 * @return the passwd contacto
	 */
	public String getPasswdContacto() {
		return passwdContacto;
	}
	
	/**
	 * Sets the passwd contacto.
	 *
	 * @param passwdContacto the new passwd contacto
	 */
	public void setPasswdContacto(String passwdContacto) {
		this.passwdContacto = passwdContacto;
	}
	
	/** The passwd contacto. */
	private String passwdContacto;
	
	
	
	/**
	 * Gets the codigo per.
	 *
	 * @return the codigo per
	 */
	public int getCodigoPer(){
		return codigoPer;
	}
	
	/**
	 * Sets the codigo per.
	 *
	 * @param codigoPer the new codigo per
	 */
	public void setCodigoPer(int codigoPer) {
		this.codigoPer = codigoPer;
	}
	
	/**
	 * Gets the numero identificacion.
	 *
	 * @return the numero identificacion
	 */
	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}
	
	/**
	 * Sets the numero identificacion.
	 *
	 * @param numeroIdentificacion the new numero identificacion
	 */
	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}
	
	/**
	 * Gets the profesion.
	 *
	 * @return the profesion
	 */
	public String getProfesion() {
		return profesion;
	}
	
	/**
	 * Sets the profesion.
	 *
	 * @param profesion the new profesion
	 */
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	
	/**
	 * Gets the estado civil.
	 *
	 * @return the estado civil
	 */
	public String getEstadoCivil() {
		
		return estadoCivil;
	}
	
	/**
	 * Sets the estado civil.
	 *
	 * @param estadoCivil the new estado civil
	 */
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	/**
	 * Gets the fecha nacimiento.
	 *
	 * @return the fecha nacimiento
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	/**
	 * Sets the fecha nacimiento.
	 *
	 * @param fechaNacimiento the new fecha nacimiento
	 */
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	/**
	 * Gets the primer nombre.
	 *
	 * @return the primer nombre
	 */
	public String getPrimer_nombre() {
		return primer_nombre;
	}
	
	/**
	 * Sets the primer nombre.
	 *
	 * @param primer_nombre the new primer nombre
	 */
	public void setPrimer_nombre(String primer_nombre) {
		this.primer_nombre = primer_nombre;
	}
	
	/**
	 * Gets the segundo nombre.
	 *
	 * @return the segundo nombre
	 */
	public String getSegundo_nombre() {
		return segundo_nombre;
	}
	
	/**
	 * Sets the segundo nombre.
	 *
	 * @param segundo_nombre the new segundo nombre
	 */
	public void setSegundo_nombre(String segundo_nombre) {
		this.segundo_nombre = segundo_nombre;
	}
	
	/**
	 * Gets the primer apellido.
	 *
	 * @return the primer apellido
	 */
	public String getPrimer_apellido() {
		return primer_apellido;
	}
	
	/**
	 * Sets the primer apellido.
	 *
	 * @param primer_apellido the new primer apellido
	 */
	public void setPrimer_apellido(String primer_apellido) {
		this.primer_apellido = primer_apellido;
	}
	
	/**
	 * Gets the segundo apellido.
	 *
	 * @return the segundo apellido
	 */
	public String getSegundo_apellido() {
		return segundo_apellido;
	}
	
	/**
	 * Sets the segundo apellido.
	 *
	 * @param segundo_apellido the new segundo apellido
	 */
	public void setSegundo_apellido(String segundo_apellido) {
		this.segundo_apellido = segundo_apellido;
	}
	
	/**
	 * Gets the email primario.
	 *
	 * @return the email primario
	 */
	public String getEmail_primario() {
		return email_primario;
	}
	
	/**
	 * Sets the email primario.
	 *
	 * @param email_primario the new email primario
	 */
	public void setEmail_primario(String email_primario) {
		this.email_primario = email_primario;
	}
	
	/**
	 * Gets the celular.
	 *
	 * @return the celular
	 */
	public String getCelular() {
		return celular;
	}
	
	/**
	 * Sets the celular.
	 *
	 * @param celular the new celular
	 */
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Contacto [codigoPer=" + codigoPer + ", numeroIdentificacion=" + numeroIdentificacion
				+ ", primer_nombre=" + primer_nombre + ", segundo_nombre=" + segundo_nombre + ", primer_apellido="
				+ primer_apellido + ", segundo_apellido=" + segundo_apellido + ", email_primario=" + email_primario
				+ ", celular=" + celular + ", fechaNacimiento=" + fechaNacimiento + ", estadoCivil=" + estadoCivil
				+ ", profesion=" + profesion + "]";
	}
	

}

package com.app.modelo;



/**
 * The Class Entidades.
 */
public class Entidades extends Base {
	
	/** The numero identificacion. */
	private String numeroIdentificacion;
	
	/** The nombres entidad. */
	private String nombresEntidad;
	
	/** The apellidos entidad. */
	private String apellidosEntidad;
	
	/** The email entidad. */
	private String emailEntidad;
	
	/** The razon social. */
	private String razonSocial;
	
	/** The nombre comercial. */
	private String nombreComercial;
	
	/** The telefonos contacto. */
	private String telefonosContacto;
	
	/** The login. */
	private String login;
	
	/** The password. */
	private String password;
	
	/**
	 * Gets the login.
	 *
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * Sets the login.
	 *
	 * @param login the new login
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
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
	 * Gets the nombres entidad.
	 *
	 * @return the nombres entidad
	 */
	public String getNombresEntidad() {
		return nombresEntidad;
	}
	
	/**
	 * Sets the nombres entidad.
	 *
	 * @param nombresEntidad the new nombres entidad
	 */
	public void setNombresEntidad(String nombresEntidad) {
		this.nombresEntidad = nombresEntidad;
	}
	
	/**
	 * Gets the apellidos entidad.
	 *
	 * @return the apellidos entidad
	 */
	public String getApellidosEntidad() {
		return apellidosEntidad;
	}
	
	/**
	 * Sets the apellidos entidad.
	 *
	 * @param apellidosEntidad the new apellidos entidad
	 */
	public void setApellidosEntidad(String apellidosEntidad) {
		this.apellidosEntidad = apellidosEntidad;
	}
	
	/**
	 * Gets the email entidad.
	 *
	 * @return the email entidad
	 */
	public String getEmailEntidad() {
		return emailEntidad;
	}
	
	/**
	 * Sets the email entidad.
	 *
	 * @param emailEntidad the new email entidad
	 */
	public void setEmailEntidad(String emailEntidad) {
		this.emailEntidad = emailEntidad;
	}
	
	/**
	 * Gets the razon social.
	 *
	 * @return the razon social
	 */
	public String getRazonSocial() {
		return razonSocial;
	}
	
	/**
	 * Sets the razon social.
	 *
	 * @param razonSocial the new razon social
	 */
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	
	/**
	 * Gets the nombre comercial.
	 *
	 * @return the nombre comercial
	 */
	public String getNombreComercial() {
		return nombreComercial;
	}
	
	/**
	 * Sets the nombre comercial.
	 *
	 * @param nombreComercial the new nombre comercial
	 */
	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}
	
	/**
	 * Gets the telefonos contacto.
	 *
	 * @return the telefonos contacto
	 */
	public String getTelefonosContacto() {
		return telefonosContacto;
	}
	
	/**
	 * Sets the telefonos contacto.
	 *
	 * @param telefonosContacto the new telefonos contacto
	 */
	public void setTelefonosContacto(String telefonosContacto) {
		this.telefonosContacto = telefonosContacto;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Entidades [numeroIdentificacion=" + numeroIdentificacion + ", nombresEntidad=" + nombresEntidad
				+ ", apellidosEntidad=" + apellidosEntidad + ", emailEntidad=" + emailEntidad + ", razonSocial="
				+ razonSocial + ", nombreComercial=" + nombreComercial + ", telefonosContacto=" + telefonosContacto
				+ "]";
	}

	
}

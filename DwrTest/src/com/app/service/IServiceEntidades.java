package com.app.service;

import java.sql.SQLException;

import com.app.modelo.Entidades;



/**
 * The Interface IEntidades.
 */
public interface IServiceEntidades {
	
	/**
	 * Entidades.
	 *
	 * @param numeroIdentificacion the numero identificacion
	 * @return the entidades
	 */
	public Entidades getEntidad(String numeroIdentificacion);
	
	/**
	 * Gets the credentinals.
	 *
	 * @param login the login
	 * @param password the password
	 * @return the credentinals
	 */
	public int getCredentinals(String login, String password);
	
	/**
	 * Gets the credentinals by object.
	 *
	 * @param login the login
	 * @param password the password
	 * @return the credentinals by object
	 */
	public Entidades getCredentinalsByObject(String login, String password);
	
	/**
	 * Save entidad.
	 *
	 * @param entidades the entidades
	 * @return the string
	 * @throws SQLException the SQL exception
	 */
	public String saveEntidad(Entidades entidades) throws SQLException;

}

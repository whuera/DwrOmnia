package com.app.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.app.modelo.Contacto;



/**
 * The Interface IServicePerson.
 */
public interface IServicePerson {
	
	/**
	 * Gets the information all persons.
	 *
	 * @param index the index
	 * @return the information all persons
	 */
	public ArrayList<Contacto> getInformationAllPersons(String index);
	
	/**
	 * Gets the information all persons for options.
	 *
	 * @param index the index
	 * @return the information all persons for options
	 */
	public ArrayList<Contacto> getInformationAllPersonsForOptions(String index);
	
	/**
	 * Gets the contact.
	 *
	 * @param id the id
	 * @return the contact
	 */
	public Contacto getContact(String id);
	
	/**
	 * Gets the contact by id.
	 *
	 * @param id the id
	 * @return the contact by id
	 */
	public ArrayList<Contacto> getContactById(String id);
	

	
	/**
	 * Save contact.
	 *
	 * @param contact the contact
	 * @return true, if successful
	 * @throws SQLException the SQL exception
	 */
	public String saveContact(Contacto contact) throws SQLException;
	
	

}

package com.app.service;

import java.util.ArrayList;

import com.app.modelo.ContactMail;



/**
 * The Interface IServiceContactSendMail.
 */
public interface IServiceContactSendMail {
	
	/**
	 * Gets the contacts.
	 *
	 * @param tipo the tipo
	 * @param varIter the var iter
	 * @return the contacts
	 */
	public ArrayList<ContactMail> getContacts(String tipo, int varIter);
	
	/**
	 * Gets the contacts.
	 *
	 * @param val the val
	 * @return the contacts
	 */
	public ArrayList<ContactMail> getContacts(int val);
	
	/**
	 * Update status mail.
	 *
	 * @param id the id
	 */
	public void updateStatusMail(int id);

}

package com.app.service;

import java.util.ArrayList;

import com.app.modelo.AddressContact;


/**
 * The Interface IServiceAddress.
 */
public interface IServiceAddress {
	
	/**
	 * Gets the all address.
	 *
	 * @return the all address
	 */
	public ArrayList<AddressContact> getAllAddress();
	
	/**
	 * Gets the address by id contact.
	 *
	 * @param codeContact the code contact
	 * @return the address by id contact
	 */
	public ArrayList<AddressContact> getAddressByIdContact(int codeContact);

}

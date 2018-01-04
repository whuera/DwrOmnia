package com.app.service;

import java.util.ArrayList;

import com.app.modelo.InformacionFinanciera;


/**
 * The Interface IServiceProducts.
 */
public interface IServiceProducts {
	
	/**
	 * Gets the products.
	 *
	 * @param id the id
	 * @return the products
	 */
	public ArrayList<InformacionFinanciera> getProducts(String id);

}

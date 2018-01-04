package com.app.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import com.app.conn.conexionOracle;
import com.app.modelo.AddressContact;
import com.app.service.IServiceAddress;


// TODO: Auto-generated Javadoc
/**
 * The Class ServiceAddressContact.
 */
public class ServiceAddressContact implements IServiceAddress {
	
	/** The Constant logger. */
	//private static final Logger logger = LoggerFactory.getLogger(ServiceAddressContact.class);
	
	/** The conn. */
	public static conexionOracle conn = new conexionOracle();
	

	/* (non-Javadoc)
	 * @see com.app.service.IServiceAddress#getAllAddress()
	 */
	@Override
	public ArrayList<com.app.modelo.AddressContact> getAllAddress() {
		ArrayList<AddressContact> listAddressContacts = new ArrayList<>();
		return listAddressContacts;
	}

	/* (non-Javadoc)
	 * @see com.app.service.IServiceAddress#getAddressByIdContact(int)
	 */
	@Override
	public ArrayList<com.app.modelo.AddressContact> getAddressByIdContact(int codeContact) {
		
		
		Connection conexion = conn.getConnection();
		String sqlQuery = "select persona, principal, numero, interseccion, referencia, descripcion, ciudad from STG_DIRECCIONES_ACT where persona = ?";
		ArrayList<AddressContact> listAddressContacts = new ArrayList<>();
		try {
			PreparedStatement preparedStatement = conexion.prepareStatement(sqlQuery);
			preparedStatement.setInt(1, codeContact);
			ResultSet rs = preparedStatement.executeQuery();
			
			 while (rs.next())
			 {
				 AddressContact addressContact = new AddressContact();				 				
				 addressContact.setCodeperson(rs.getInt("PERSONA"));
				 addressContact.setAddressPrincipal(rs.getString("PRINCIPAL"));
				 addressContact.setNumberAddress(rs.getString("NUMERO"));
				 addressContact.setAddressInter(rs.getString("INTERSECCION"));
				 addressContact.setAddressRef(rs.getString("REFERENCIA"));
				 addressContact.setAddressType(rs.getString("DESCRIPCION"));
				 addressContact.setAddressCity(rs.getString("CIUDAD"));				 				 						
				 //logger.info("address by id :"+addressContact.toString());
				 listAddressContacts.add(addressContact);
			 }
			 rs.close();
			 preparedStatement.close();
	         conexion.close();
	         
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return listAddressContacts;
	}

}

package com.app.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import com.app.service.impl.ServiceContact;



/**
 * The Class conexionOracle.
 */
public class conexionOracle {
	
	/**
	 * The Constant logger.
	 *
	 * @return the connection
	 */
	//private static final Logger logger = LoggerFactory.getLogger(conexionOracle.class);
	
	
	/**
	 * Gets the connection.
	 *
	 * @return the connection
	 */
	public  Connection getConnection(){
		Connection connection = null;
		try{
            Class.forName("oracle.jdbc.OracleDriver");            
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "weho7755");
            Statement stmt = connection.createStatement();            
          //  logger.info("Connection created");
            stmt.close();

        }catch(Exception e){
            e.printStackTrace();
        }
		return connection;
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) 
	{
		//ServiceInfoEnterprice emp = new ServiceInfoEnterprice();
		//emp.getInfoEnterprice("MOBILPYMES");
		ServiceContact serviceContact = new ServiceContact();
		serviceContact.getInformationAllPersonsForOptions("200");
		//serviceContact.getContactById("1714168448");
		//ServiceContactSendMail serviceContactSendMail = new ServiceContactSendMail();
		//serviceContactSendMail.getContacts(2);
		//ServiceProducts serviceProducts = new ServiceProducts();
		//serviceProducts.getProducts("0101598415");
		//ServiceEntidades entidad = new ServiceEntidades();
		//entidad.getCredentinalsByObject("whuera", "1234");
		/*Contacto contact = new Contacto();
		contact.setNumeroIdentificacion("3309336421");
		contact.setPrimer_nombre("BRUNO");
		contact.setPrimer_apellido("HUERA");
		contact.setEmail_primario("bredhuera@gmail.com");
		serviceContact.saveContact(contact);*/
		//System.out.println(serviceContact.getContactById("1712740644").size());
		//System.out.println(serviceContact.getInformationAllPersons().size());
		//ServiceAddressContact addressContact = new ServiceAddressContact();
		//System.out.println(addressContact.getAddressByIdContact(1151));
	}
	

}

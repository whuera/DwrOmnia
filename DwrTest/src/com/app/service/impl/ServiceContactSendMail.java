package com.app.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import com.app.conn.conexionOracle;
import com.app.modelo.ContactMail;
import com.app.service.IServiceContactSendMail;


/**
 * The Class ServiceContactSendMail.
 */
public class ServiceContactSendMail implements IServiceContactSendMail {
	
/** The Constant logger. */
//private static final Logger logger = LoggerFactory.getLogger(ServiceContactSendMail.class);
	
	/** The conn. */
	public static conexionOracle conn = new conexionOracle();

	/* (non-Javadoc)
	 * @see com.app.service.IServiceContactSendMail#getContacts()
	 */
	@Override
	public ArrayList<ContactMail> getContacts(String tipo, int varIter) {
		Connection conexion = conn.getConnection();

		ResultSet rs = null;
		ArrayList<ContactMail> listaContactos = new ArrayList<>();
		String statementSql = "select * from SYSTEM.SM_CONTACT_TO_MAIL WHERE ESTATUS = 0 AND TIPO = ? AND ROWNUM <= ?";
		try {
			//Statement st = conexion.createStatement();
			//rs = st.executeQuery("select * from SYSTEM.SM_CONTACT_TO_MAIL WHERE TIPO = ? AND ESTATUS = 0  AND ROWNUM <= 10");
			
			PreparedStatement preparedStatement = conexion.prepareStatement(statementSql);
			preparedStatement.setString(1, tipo);
			preparedStatement.setInt(2, varIter);
			rs = preparedStatement.executeQuery();
			
			if (rs != null) {
				while (rs.next()) {
					ContactMail contactMail = new ContactMail();
					contactMail.setId(rs.getInt("ID"));
					contactMail.setNames(rs.getString("NOMBRES"));
					contactMail.setEmailcontact(rs.getString("EMAILTOSEND").toLowerCase());
					contactMail.setStatus(rs.getString("ESTATUS"));
					//logger.info("contacto :" + contactMail.toString());
					listaContactos.add(contactMail);
				}
			} 
			rs.close();
			preparedStatement.close();
			conexion.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		System.out.println(listaContactos.toString());
		return listaContactos;
	}

	/* (non-Javadoc)
	 * @see com.app.service.IServiceContactSendMail#updateStatusMail(int)
	 */
	@Override
	public void updateStatusMail(int id) {
		Connection conexion = conn.getConnection();
		try{
		String updateSQL = "UPDATE SYSTEM.SM_CONTACT_TO_MAIL SET ESTATUS = 1 WHERE ID = ?";
		PreparedStatement preparedStatement = conexion.prepareStatement(updateSQL);
		preparedStatement.setInt(1, id);
		preparedStatement .executeUpdate();
		}catch(SQLException ex){
			ex.getMessage();
		}
		
		
	}

	/* (non-Javadoc)
	 * @see com.app.service.IServiceContactSendMail#getContacts(int)
	 */
	@Override
	public ArrayList<ContactMail> getContacts(int val) {
		Connection conexion = conn.getConnection();

		ResultSet rs = null;
		ArrayList<ContactMail> listaContactos = new ArrayList<>();
		try {
			Statement st = conexion.createStatement();
			rs = st.executeQuery("select * from SYSTEM.SM_CONTACT_TO_MAIL WHERE ESTATUS = 0 AND ROWNUM <="+val+"");
			if (rs != null) {
				while (rs.next()) {
					ContactMail contactMail = new ContactMail();
					contactMail.setId(rs.getInt("ID"));
					contactMail.setNames(rs.getString("NOMBRES"));
					contactMail.setEmailcontact(rs.getString("EMAILTOSEND").toLowerCase());
					contactMail.setStatus(rs.getString("ESTATUS"));
					//logger.info("contacto :" + contactMail.toString());
					listaContactos.add(contactMail);
				}
			} 
			rs.close();
			st.close();
			conexion.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		System.out.println(listaContactos.toString());
		return listaContactos;

	}

}

package com.app.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import com.app.conn.conexionOracle;
import com.app.modelo.InfoEnterprice;
import com.app.service.IServiceInfoEnterprice;


/**
 * The Class ServiceInfoEnterprice.
 */
public class ServiceInfoEnterprice implements IServiceInfoEnterprice {
	
	/** The Constant logger. */
	//private static final Logger logger = LoggerFactory.getLogger(ServiceInfoEnterprice.class);
	
	/** The conn. */
	public static conexionOracle conn = new conexionOracle();

	/* (non-Javadoc)
	 * @see com.app.service.IServiceInfoEnterprice#getInfoEnterprice(java.lang.String)
	 */
	@Override
	public InfoEnterprice getInfoEnterprice(String name) {
		Connection conexion = conn.getConnection();
		String sqlQuery = "select * from SM_EMP_EMAILSEND where EMP_NAME = ?";
		
		InfoEnterprice empInfo = new InfoEnterprice();
		String nombres, documento, nameTemplate, pathTemplate, emailReport, emailFrom = null;
		int occurrences = 0;
		try {
			PreparedStatement preparedStatement = conexion.prepareStatement(sqlQuery);
			preparedStatement.setString(1, name);
			ResultSet rs = preparedStatement.executeQuery();
			
			if (rs.isBeforeFirst()) {
				while (rs.next()) {
					documento = rs.getString("EMP_DOCUMENT")!=null?rs.getString("EMP_DOCUMENT"):"N/A";
					empInfo.setDocumentNumber(documento);
					nombres = rs.getString("EMP_NAME").trim();
					empInfo.setNameEmp(nombres);
					nameTemplate = rs.getString("EMP_NAME_TEMPLATE").trim();
					empInfo.setNameTemplate(nameTemplate);
					pathTemplate = rs.getString("EMP_PATH_TEMPLATE").trim();
					empInfo.setPathTemplate(pathTemplate);
					occurrences = rs.getInt("EMP_OCCURRENCES");
					empInfo.setOccurrences(occurrences);
					emailReport = rs.getString("EMP_EMAIL_INFORME");
					empInfo.setMailReport(emailReport);
					emailFrom = rs.getString("EMP_EMAIL");
					empInfo.setEmpemail(emailFrom);
					empInfo.setEmailSubject(rs.getString("EMP_SUBJECT"));
					empInfo.setPathFile(rs.getString("EMP_PATH_FILE"));
				//	logger.info("contacto by id :" + empInfo.toString());
					
				}
			} 
			rs.close();
			preparedStatement.close();
			conexion.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
//		logger.info(empInfo.toString());
		System.out.println(empInfo.toString());
		
		return empInfo;
	}

}

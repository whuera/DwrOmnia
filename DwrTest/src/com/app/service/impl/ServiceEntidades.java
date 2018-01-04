package com.app.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import com.app.conn.conexionOracle;
import com.app.modelo.Entidades;
import com.app.service.IServiceEntidades;


// TODO: Auto-generated Javadoc
/**
 * The Class ServiceEntidades.
 */
public class ServiceEntidades implements IServiceEntidades {
	
	/** The Constant logger. */
	//private static final Logger logger = LoggerFactory.getLogger(ServiceEntidades.class);
	
	/** The conn. */
	public static conexionOracle conn = new conexionOracle();

	/* (non-Javadoc)
	 * @see com.app.service.IEntidades#entidades(java.lang.String)
	 */
	@Override
	public Entidades getEntidad(String numeroIdentificacion) {
		
		Connection conexion = conn.getConnection();		
		String sqlQuery = "select * from SM_ENTIDADES where numero_identificacion = ?";
		Entidades entidades = new Entidades();
		String nombres, apellidos, razonSocial, nombreComercial, telefonos = null;
		try {
			PreparedStatement preparedStatement = conexion.prepareStatement(sqlQuery);
			preparedStatement.setString(1, numeroIdentificacion);
			ResultSet rs = preparedStatement.executeQuery();
			
			if (rs.isBeforeFirst()) {
				while (rs.next()) {
					
					entidades.setNumeroIdentificacion(rs.getString("NUMERO_IDENTIFICACION").trim());
					nombres = rs.getString("NOMBRES_ENTIDAD")!=null?rs.getString("NOMBRES_ENTIDAD"):"N/A";
					entidades.setNombresEntidad(nombres.trim());
					apellidos = rs.getString("APELLIDOS_ENTIDAD")!=null?rs.getString("APELLIDOS_ENTIDAD"):"N/A";
					entidades.setApellidosEntidad(apellidos.trim());
					entidades.setEmailEntidad(rs.getString("EMAIL_ENTIDAD").trim());
					razonSocial = rs.getString("RAZON_SOCIAL")!=null?rs.getString("RAZON_SOCIAL"):"N/A";
					entidades.setRazonSocial(razonSocial);
					nombreComercial = rs.getString("NOMBRE_COMERCIAL")!=null?rs.getString("NOMBRE_COMERCIAL"):"N/A";
					entidades.setNombreComercial(nombreComercial);
					telefonos = rs.getString("TELEFONOS_CONTACTO")!=null?rs.getString("TELEFONOS_CONTACTO"):"N/A";
					entidades.setTelefonosContacto(telefonos);
					entidades.setCodeTransaction("TO1");
					entidades.setDescTransaction("TRANSACCION OK");
					//logger.info("contacto by id :" + entidades.toString());
					
				}
			} else if (!rs.isBeforeFirst()) {
				entidades = new Entidades();
				entidades.setCodeTransaction("T00");
				entidades.setDescTransaction("ERROR NO EXISTE REGISTRO");
				
			}
			rs.close();
			preparedStatement.close();
			conexion.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		//logger.info(entidades.toString());
		System.out.println(entidades.toString());
		
		return entidades;
	}

	/* (non-Javadoc)
	 * @see com.app.service.IServiceEntidades#saveEntidad(com.app.modelo.Entidades)
	 */
	@Override
	public String saveEntidad(Entidades entidades) throws SQLException {
		Connection conexion = conn.getConnection();
		String sqlInsertQuery = "insert into SYSTEM.SM_ENTIDADES (NUMERO_IDENTIFICACION,NOMBRES_ENTIDAD, APELLIDOS_ENTIDAD, EMAIL_ENTIDAD, LOGIN, PASSWORD) values (?,?,?,?,?,?)";
		PreparedStatement preparedStatement = null;
		String generatedColumns[] = { "NUMERO_IDENTIFICACION" };
		String numident = null;
		try {
			preparedStatement = conexion.prepareStatement(sqlInsertQuery, generatedColumns);
			preparedStatement.setString(1, entidades.getNumeroIdentificacion());
			preparedStatement.setString(2, entidades.getNombresEntidad());
			preparedStatement.setString(3, entidades.getApellidosEntidad());
			preparedStatement.setString(4, entidades.getEmailEntidad());
			preparedStatement.setString(5, entidades.getLogin());
			preparedStatement.setString(6, entidades.getPassword());
			int val = preparedStatement.executeUpdate();
			if (val == 1) {
				ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
				if (null != generatedKeys) {
					while (generatedKeys.next()) {
						numident = generatedKeys.getString(1);
					}
				} else {
					numident = "Error en transaccion";
				}
			}

		} catch (SQLException ex) {
			//logger.error(ex.getMessage());
		}
		return numident;
		
	}

	/* (non-Javadoc)
	 * @see com.app.service.IServiceEntidades#getCredentinals(java.lang.String, java.lang.String)
	 */
	@Override
	public int getCredentinals(String login, String password) {

		Connection conexion = conn.getConnection();		
		String sqlQuery = "select * from SM_ENTIDADES where login = ? and password = ?";
		Entidades entidades = new Entidades();
		String nombres, apellidos, emailEnt, razonSocial, nombreComercial, telefonos, loginEnt, passwordEnt = null;
		int valReturn = 0;
		try {
			PreparedStatement preparedStatement = conexion.prepareStatement(sqlQuery);
			preparedStatement.setString(1, login);
			preparedStatement.setString(2, password);
			ResultSet rs = preparedStatement.executeQuery();
			
			if (rs.isBeforeFirst()) {
				while (rs.next()) {
					
					entidades.setNumeroIdentificacion(rs.getString("NUMERO_IDENTIFICACION").trim());
					nombres = rs.getString("NOMBRES_ENTIDAD")!=null?rs.getString("NOMBRES_ENTIDAD"):"N/A";
					entidades.setNombresEntidad(nombres.trim());
					apellidos = rs.getString("APELLIDOS_ENTIDAD")!=null?rs.getString("APELLIDOS_ENTIDAD"):"N/A";
					entidades.setApellidosEntidad(apellidos.trim());
					emailEnt = rs.getString("EMAIL_ENTIDAD")!=null?rs.getString("EMAIL_ENTIDAD"):"N/A";
					entidades.setEmailEntidad(emailEnt);
					razonSocial = rs.getString("RAZON_SOCIAL")!=null?rs.getString("RAZON_SOCIAL"):"N/A";
					entidades.setRazonSocial(razonSocial);
					nombreComercial = rs.getString("NOMBRE_COMERCIAL")!=null?rs.getString("NOMBRE_COMERCIAL"):"N/A";
					entidades.setNombreComercial(nombreComercial);
					telefonos = rs.getString("TELEFONOS_CONTACTO")!=null?rs.getString("TELEFONOS_CONTACTO"):"N/A";
					entidades.setTelefonosContacto(telefonos);
					loginEnt = rs.getString("LOGIN")!=null?rs.getString("LOGIN"):"N/A";
					entidades.setLogin(loginEnt);
					passwordEnt = rs.getString("PASSWORD")!=null?rs.getString("PASSWORD"):"N/A";
					entidades.setPassword(passwordEnt);
					entidades.setCodeTransaction("TO1");
					entidades.setDescTransaction("TRANSACCION OK");
					valReturn = 1;
					//logger.info("contacto by id :" + entidades.toString());
					
				}
			} else if (!rs.isBeforeFirst()) {
				entidades = new Entidades();
				entidades.setCodeTransaction("T00");
				entidades.setDescTransaction("ERROR NO EXISTE REGISTRO");
				valReturn = 0;
			}
			rs.close();
			preparedStatement.close();
			conexion.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		//logger.info(entidades.toString());
		System.out.println(entidades.toString());
		return valReturn;
	}

	/* (non-Javadoc)
	 * @see com.app.service.IServiceEntidades#getCredentinalsByObject(java.lang.String, java.lang.String)
	 */
	@Override
	public Entidades getCredentinalsByObject(String login, String password) {
		Connection conexion = conn.getConnection();		
		String sqlQuery = "select * from SM_ENTIDADES where login = ? and password = ?";
		Entidades entidades = new Entidades();
		String nombres, apellidos, emailEnt, razonSocial, nombreComercial, telefonos, loginEnt, passwordEnt = null;
		
		try {
			PreparedStatement preparedStatement = conexion.prepareStatement(sqlQuery);
			preparedStatement.setString(1, login);
			preparedStatement.setString(2, password);
			ResultSet rs = preparedStatement.executeQuery();
			
			if (rs.isBeforeFirst()) {
				while (rs.next()) {
					
					entidades.setNumeroIdentificacion(rs.getString("NUMERO_IDENTIFICACION").trim());
					nombres = rs.getString("NOMBRES_ENTIDAD")!=null?rs.getString("NOMBRES_ENTIDAD"):"N/A";
					entidades.setNombresEntidad(nombres.trim());
					apellidos = rs.getString("APELLIDOS_ENTIDAD")!=null?rs.getString("APELLIDOS_ENTIDAD"):"N/A";
					entidades.setApellidosEntidad(apellidos.trim());
					emailEnt = rs.getString("EMAIL_ENTIDAD")!=null?rs.getString("EMAIL_ENTIDAD"):"N/A";
					entidades.setEmailEntidad(emailEnt);
					razonSocial = rs.getString("RAZON_SOCIAL")!=null?rs.getString("RAZON_SOCIAL"):"N/A";
					entidades.setRazonSocial(razonSocial);
					nombreComercial = rs.getString("NOMBRE_COMERCIAL")!=null?rs.getString("NOMBRE_COMERCIAL"):"N/A";
					entidades.setNombreComercial(nombreComercial);
					telefonos = rs.getString("TELEFONOS_CONTACTO")!=null?rs.getString("TELEFONOS_CONTACTO"):"N/A";
					entidades.setTelefonosContacto(telefonos);
					loginEnt = rs.getString("LOGIN")!=null?rs.getString("LOGIN"):"N/A";
					entidades.setLogin(loginEnt);
					passwordEnt = rs.getString("PASSWORD")!=null?rs.getString("PASSWORD"):"N/A";
					entidades.setPassword(passwordEnt);
					entidades.setCodeTransaction("TO1");
					entidades.setDescTransaction("TRANSACCION OK");
					
					//logger.info("contacto by id :" + entidades.toString());
					
				}
			} else if (!rs.isBeforeFirst()) {
				entidades = new Entidades();
				entidades.setCodeTransaction("T00");
				entidades.setDescTransaction("ERROR NO EXISTE REGISTRO");
				
			}
			rs.close();
			preparedStatement.close();
			conexion.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		//logger.info(entidades.toString());
		System.out.println(entidades.toString());
		return entidades;
	}

}

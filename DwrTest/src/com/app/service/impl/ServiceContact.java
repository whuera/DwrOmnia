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
import com.app.modelo.Contacto;
import com.app.service.IServicePerson;


// TODO: Auto-generated Javadoc
/**
 * The Class ServiceContact.
 */
public class ServiceContact implements IServicePerson {

	/** The Constant logger. */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.app.service.IServicePerson#getInformationAllPersons()
	 */
	//private static final Logger logger = LoggerFactory.getLogger(ServiceContact.class);
	
	/** The conn. */
	public static conexionOracle conn = new conexionOracle();

	/* (non-Javadoc)
	 * @see com.app.service.IServicePerson#getInformationAllPersons()
	 */
	@Override
	public ArrayList<Contacto> getInformationAllPersons(String index) {
		Connection conexion = conn.getConnection();
		String estadoCivil;
		String statementsql = null;

		ResultSet rs = null;
		ArrayList<Contacto> listaContactos = new ArrayList<>();
		try {
			Statement st = conexion.createStatement();
			statementsql = "select * from SYSTEM.STG_CONTACT where email_primario is not null";
			
			System.out.println(statementsql);
			rs = st.executeQuery(statementsql);
			if (rs != null) {
				while (rs.next()) {
					Contacto contacto = new Contacto();
					contacto.setNumeroIdentificacion(rs.getString("NUMERO_IDENTIFICACION").trim());
					contacto.setPrimer_nombre(rs.getString("PRIMER_NOMBRE"));
					contacto.setSegundo_nombre(rs.getString("SEGUNDO_NOMBRE"));
					contacto.setPrimer_apellido(rs.getString("PRIMER_APELLIDO"));
					contacto.setSegundo_apellido(rs.getString("SEGUNDO_APELLIDO"));
					contacto.setFechaNacimiento(rs.getString("FECHA_NACIMIENTO"));
					estadoCivil = rs.getString("ESTADO_CIVIL").trim();
					if (estadoCivil.equalsIgnoreCase("C")) {
						estadoCivil = "CASADO";
					} else if (estadoCivil.equalsIgnoreCase("S")) {
						estadoCivil = "SOLTERO";
					} else if (estadoCivil.equalsIgnoreCase("D")) {
						estadoCivil = "DIVORSIADO";
					} else if (estadoCivil.equalsIgnoreCase("V")) {
						estadoCivil = "VIUDO";
					} else {
						estadoCivil = "N/A";
					}
					contacto.setEstadoCivil(estadoCivil);
					contacto.setEmail_primario(rs.getString("EMAIL_PRIMARIO").toLowerCase());
					contacto.setProfesion(rs.getString("NOMBRE_PROFESION"));

					//logger.info("contacto :" + contacto.toString());
					listaContactos.add(contacto);
				}
			} else if (rs == null) {
				Contacto contacto = new Contacto();
				contacto.setCodeTransaction("T00");
				contacto.setDescTransaction("ERROR NO EXISTEN REGISTROS");
				listaContactos.add(contacto);
			}
			rs.close();
			st.close();
			conexion.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		System.out.println("listaContactos: "+listaContactos.toString());
		return listaContactos;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.app.service.IServicePerson#getContact(java.lang.String)
	 */
	@Override
	public Contacto getContact(String id) {
		Contacto contacto = new Contacto();
		return contacto;
	}

	/* (non-Javadoc)
	 * @see com.app.service.IServicePerson#getContactById(java.lang.String)
	 */
	@Override
	public ArrayList<Contacto> getContactById(String id) {
		Connection conexion = conn.getConnection();
		String estadoCivil;
		String sqlQuery = "select * from STG_CONTACT where numero_identificacion = ?";
		String emailContact = null;
		ArrayList<Contacto> listaContactos = new ArrayList<>();
		try {
			PreparedStatement preparedStatement = conexion.prepareStatement(sqlQuery);
			preparedStatement.setString(1, id);
			ResultSet rs = preparedStatement.executeQuery();

			if (rs.isBeforeFirst()) {
				while (rs.next()) {
					Contacto contacto = new Contacto();
					contacto.setCodigoPer(rs.getInt("CODIGO_PERSONA"));
					contacto.setNumeroIdentificacion(rs.getString("NUMERO_IDENTIFICACION").trim());
					contacto.setPrimer_nombre(rs.getString("PRIMER_NOMBRE")!=null?rs.getString("PRIMER_NOMBRE"):"N/A");
					contacto.setSegundo_nombre(rs.getString("SEGUNDO_NOMBRE")!=null?rs.getString("SEGUNDO_NOMBRE"):"N/A");
					contacto.setPrimer_apellido(rs.getString("PRIMER_APELLIDO")!=null?rs.getString("PRIMER_APELLIDO"):"N/A");
					contacto.setSegundo_apellido(rs.getString("SEGUNDO_APELLIDO")!=null?rs.getString("SEGUNDO_APELLIDO"):"N/A");
					contacto.setFechaNacimiento(rs.getString("FECHA_NACIMIENTO")!=null?rs.getString("FECHA_NACIMIENTO"):"N/A");
					estadoCivil = (rs.getString("ESTADO_CIVIL").trim() != null ? rs.getString("ESTADO_CIVIL").trim()
							: "N/A");
					if (estadoCivil.equalsIgnoreCase("C")) {
						estadoCivil = "CASADO";
					} else if (estadoCivil.equalsIgnoreCase("S")) {
						estadoCivil = "SOLTERO";
					} else if (estadoCivil.equalsIgnoreCase("D")) {
						estadoCivil = "DIVORSIADO";
					} else if (estadoCivil.equalsIgnoreCase("V")) {
						estadoCivil = "VIUDO";
					} else {
						estadoCivil = "N/A";
					}
					contacto.setEstadoCivil(estadoCivil);
					emailContact = rs.getString("EMAIL_PRIMARIO")!=null?rs.getString("EMAIL_PRIMARIO"):"N/A";
					contacto.setEmail_primario(emailContact.toLowerCase());
					contacto.setProfesion(rs.getString("NOMBRE_PROFESION")!=null?rs.getString("NOMBRE_PROFESION"):"N/A");
					contacto.setCodeTransaction("TO1");
					contacto.setDescTransaction("TRANSACCION OK");
				//	logger.info("contacto by id :" + contacto.toString());
					listaContactos.add(contacto);
				}
			} else if (!rs.isBeforeFirst()) {
				Contacto contacto = new Contacto();
				contacto.setCodeTransaction("T00");
				contacto.setDescTransaction("ERROR NO EXISTE REGISTRO");
				listaContactos.add(contacto);
			}
			rs.close();
			preparedStatement.close();
			conexion.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	//	logger.info(listaContactos.toString());
		System.out.println(listaContactos.toString());
		return listaContactos;
	}

	/* (non-Javadoc)
	 * @see com.app.service.IServicePerson#saveContact(com.app.modelo.Contacto)
	 */
	@Override
	public String saveContact(Contacto contact) {
		Connection conexion = conn.getConnection();
		String sqlInsertQuery = "insert into SYSTEM.SM_ENTIDADES (NUMERO_IDENTIFICACION,NOMBRES_ENTIDAD, APELLIDOS_ENTIDAD, EMAIL_ENTIDAD, LOGIN, PASSWORD) values (?,?,?,?,?,?)";
		PreparedStatement preparedStatement = null;
		String generatedColumns[] = { "NUMERO_IDENTIFICACION" };
		String numident = null;
		try {
			preparedStatement = conexion.prepareStatement(sqlInsertQuery, generatedColumns);
			preparedStatement.setString(1, contact.getNumeroIdentificacion());
			preparedStatement.setString(2, contact.getPrimer_nombre());
			preparedStatement.setString(3, contact.getPrimer_apellido());
			preparedStatement.setString(4, contact.getEmail_primario());
			preparedStatement.setString(5, contact.getLoginContacto());
			preparedStatement.setString(6, contact.getPasswdContacto());
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

	@Override
	public ArrayList<Contacto> getInformationAllPersonsForOptions(String index) {
		Connection conexion = conn.getConnection();
		String statementsql = null;

		ResultSet rs = null;
		ArrayList<Contacto> listaContactos = new ArrayList<>();
		try {
			Statement st = conexion.createStatement();
			statementsql = "select * from SYSTEM.STG_CONTACT where email_primario is not null and rownum <="+index+"";
			
			System.out.println(statementsql);
			rs = st.executeQuery(statementsql);
			if (rs != null) {
				while (rs.next()) {
					Contacto contacto = new Contacto();
					//contacto.setNumeroIdentificacion(rs.getString("NUMERO_IDENTIFICACION").trim());
					contacto.setPrimer_nombre(rs.getString("PRIMER_NOMBRE"));
					//contacto.setSegundo_nombre(rs.getString("SEGUNDO_NOMBRE"));
					contacto.setPrimer_apellido(rs.getString("PRIMER_APELLIDO"));
					//contacto.setSegundo_apellido(rs.getString("SEGUNDO_APELLIDO"));
					//contacto.setFechaNacimiento(rs.getString("FECHA_NACIMIENTO"));
					//estadoCivil = rs.getString("ESTADO_CIVIL").trim();				
					//contacto.setEstadoCivil(estadoCivil);
					//contacto.setEmail_primario(rs.getString("EMAIL_PRIMARIO").toLowerCase());
					//contacto.setProfesion(rs.getString("NOMBRE_PROFESION"));

					//logger.info("contacto :" + contacto.toString());
					listaContactos.add(contacto);
				}
			} else if (rs == null) {
				Contacto contacto = new Contacto();
				contacto.setCodeTransaction("T00");
				contacto.setDescTransaction("ERROR NO EXISTEN REGISTROS");
				listaContactos.add(contacto);
			}
			rs.close();
			st.close();
			conexion.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		System.out.println("listaContactos: "+listaContactos.toString());
		return listaContactos;
	}

	/* (non-Javadoc)
	 * @see com.app.service.IServicePerson#getContactDataById(java.lang.String)
	 */
	
}

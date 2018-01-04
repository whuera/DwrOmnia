package com.app.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import com.app.conn.conexionOracle;
import com.app.modelo.InformacionFinanciera;
import com.app.service.IServiceProducts;

// TODO: Auto-generated Javadoc
/**
 * The Class ServiceProducts.
 */
public class ServiceProducts implements IServiceProducts {
	
	/** The Constant logger. */
	//private static final Logger logger = LoggerFactory.getLogger(ServiceProducts.class);
	
	/** The conn. */
	public static conexionOracle conn = new conexionOracle();

	/* (non-Javadoc)
	 * @see com.app.service.IServiceProducts#getProducts(java.lang.String)
	 */
	@Override
	public ArrayList<InformacionFinanciera> getProducts(String id) {
		Connection conexion = conn.getConnection();
		String sqlQuery = "select * from STG_VISA where CAMPO_VARC2 = ?";
		ArrayList<InformacionFinanciera> listaProductos = new ArrayList<>();
		String descProd = null;
		String codeIdent = null;
		try {
			PreparedStatement preparedStatement = conexion.prepareStatement(sqlQuery);
			preparedStatement.setString(1, id);
			ResultSet rs = preparedStatement.executeQuery();

			if (rs.isBeforeFirst()) {
				while (rs.next()) {
					InformacionFinanciera informacionFinanciera = new InformacionFinanciera();
					informacionFinanciera.setCodeTransaction("T01");
					informacionFinanciera.setDescTransaction("TRANSACCION OK");
					codeIdent = rs.getString("CAMPO_VARC2")!=null?rs.getString("CAMPO_VARC2"):"N/A";
					informacionFinanciera.setNumeroIdentificacion(codeIdent);
					descProd = rs.getString("DESCRIPCION")!= null?rs.getString("DESCRIPCION"):"N/A";
					informacionFinanciera.setDescripcionProducto(descProd);
					//logger.info("contacto by id :" + informacionFinanciera.toString());
					listaProductos.add(informacionFinanciera);
					
					if(descProd.trim().equalsIgnoreCase("DINERS")){
						InformacionFinanciera informacionFinancieraDiners = new InformacionFinanciera();
						informacionFinancieraDiners.setCodeTransaction("T01");
						informacionFinancieraDiners.setDescTransaction("TRANSACCION OK");
						informacionFinancieraDiners.setNumeroIdentificacion(rs.getString("CAMPO_VARC2"));
						informacionFinancieraDiners.setDescripcionProducto("CUENTA BANCO PICHINCHA");
						listaProductos.add(informacionFinancieraDiners);
					}
					
					
				}
			} else if (!rs.isBeforeFirst()) {
				InformacionFinanciera informacionFinanciera = new InformacionFinanciera();
				informacionFinanciera.setCodeTransaction("T00");
				informacionFinanciera.setDescTransaction("ERROR NO EXISTE REGISTRO");
				listaProductos.add(informacionFinanciera);
			}
			InformacionFinanciera informacionFinancieraVC = new InformacionFinanciera();
			informacionFinancieraVC.setCodeTransaction("T01");
			informacionFinancieraVC.setDescTransaction("TRANSACCION OK");
			informacionFinancieraVC.setNumeroIdentificacion(codeIdent);
			informacionFinancieraVC.setDescripcionProducto("CUENTA FIBECA / VITAL CARD");
			listaProductos.add(informacionFinancieraVC);
			rs.close();
			preparedStatement.close();
			conexion.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		//logger.info(listaProductos.toString());
		System.out.println(listaProductos.toString());
		return listaProductos;
	}

}

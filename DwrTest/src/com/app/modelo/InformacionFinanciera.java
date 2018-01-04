package com.app.modelo;


/**
 * The Class InformacionFinanciera.
 */
public class InformacionFinanciera extends Base	{
	
	/** The numero identificacion. */
	private String numeroIdentificacion;
	
	/** The descripcion producto. */
	private String descripcionProducto;
	
	/** The cod persona. */
	private String codPersona;
	
	/** The estatus. */
	private String estatus;
	
	/** The emisor. */
	private String emisor;
	
	/**
	 * Gets the numero identificacion.
	 *
	 * @return the numero identificacion
	 */
	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}
	
	/**
	 * Sets the numero identificacion.
	 *
	 * @param numeroIdentificacion the new numero identificacion
	 */
	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}
	
	/**
	 * Gets the descripcion producto.
	 *
	 * @return the descripcion producto
	 */
	public String getDescripcionProducto() {
		return descripcionProducto;
	}
	
	/**
	 * Sets the descripcion producto.
	 *
	 * @param descripcionProducto the new descripcion producto
	 */
	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}
	
	/**
	 * Gets the cod persona.
	 *
	 * @return the cod persona
	 */
	public String getCodPersona() {
		return codPersona;
	}
	
	/**
	 * Sets the cod persona.
	 *
	 * @param codPersona the new cod persona
	 */
	public void setCodPersona(String codPersona) {
		this.codPersona = codPersona;
	}
	
	/**
	 * Gets the estatus.
	 *
	 * @return the estatus
	 */
	public String getEstatus() {
		return estatus;
	}
	
	/**
	 * Sets the estatus.
	 *
	 * @param estatus the new estatus
	 */
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	
	/**
	 * Gets the emisor.
	 *
	 * @return the emisor
	 */
	public String getEmisor() {
		return emisor;
	}
	
	/**
	 * Sets the emisor.
	 *
	 * @param emisor the new emisor
	 */
	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InformacionFinanciera [numeroIdentificacion=" + numeroIdentificacion + ", descripcionProducto="
				+ descripcionProducto + ", codPersona=" + codPersona + ", estatus=" + estatus + ", emisor=" + emisor
				+ "]";
	}
	

}

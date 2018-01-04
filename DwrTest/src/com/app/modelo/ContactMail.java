package com.app.modelo;


/**
 * The Class ContactMail.
 */
public class ContactMail {
	
	/** The id. */
	private int id;
	
	/** The names. */
	private String names;
	
	/** The emailcontact. */
	private String emailcontact;
	
	/** The status. */
	private String status;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Gets the names.
	 *
	 * @return the names
	 */
	public String getNames() {
		return names;
	}
	
	/**
	 * Sets the names.
	 *
	 * @param names the new names
	 */
	public void setNames(String names) {
		this.names = names;
	}
	
	/**
	 * Gets the emailcontact.
	 *
	 * @return the emailcontact
	 */
	public String getEmailcontact() {
		return emailcontact;
	}
	
	/**
	 * Sets the emailcontact.
	 *
	 * @param emailcontact the new emailcontact
	 */
	public void setEmailcontact(String emailcontact) {
		this.emailcontact = emailcontact;
	}
	
	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	
	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ContactMail [id=" + id + ", names=" + names + ", emailcontact=" + emailcontact + ", status=" + status
				+ "]";
	}
	

}

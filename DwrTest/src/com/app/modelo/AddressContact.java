package com.app.modelo;


/**
 * The Class AddressContact.
 */
public class AddressContact extends Base{
	
	/** The codeperson. */
	private int codeperson;
	
	/** The address principal. */
	private String addressPrincipal;
	
	/** The number address. */
	private String numberAddress;
	
	/** The address inter. */
	private String addressInter;
	
	/** The address ref. */
	private String addressRef;
	
	/** The address type. */
	private String addressType;
	
	/** The address city. */
	private String addressCity;
	
	/**
	 * Gets the codeperson.
	 *
	 * @return the codeperson
	 */
	public int getCodeperson() {
		return codeperson;
	}
	
	/**
	 * Sets the codeperson.
	 *
	 * @param codeperson the new codeperson
	 */
	public void setCodeperson(int codeperson) {
		this.codeperson = codeperson;
	}
	
	/**
	 * Gets the address principal.
	 *
	 * @return the address principal
	 */
	public String getAddressPrincipal() {
		return addressPrincipal;
	}
	
	/**
	 * Sets the address principal.
	 *
	 * @param addressPrincipal the new address principal
	 */
	public void setAddressPrincipal(String addressPrincipal) {
		this.addressPrincipal = addressPrincipal;
	}
	
	/**
	 * Gets the number address.
	 *
	 * @return the number address
	 */
	public String getNumberAddress() {
		return numberAddress;
	}
	
	/**
	 * Sets the number address.
	 *
	 * @param numberAddress the new number address
	 */
	public void setNumberAddress(String numberAddress) {
		this.numberAddress = numberAddress;
	}
	
	/**
	 * Gets the address inter.
	 *
	 * @return the address inter
	 */
	public String getAddressInter() {
		return addressInter;
	}
	
	/**
	 * Sets the address inter.
	 *
	 * @param addressInter the new address inter
	 */
	public void setAddressInter(String addressInter) {
		this.addressInter = addressInter;
	}
	
	/**
	 * Gets the address ref.
	 *
	 * @return the address ref
	 */
	public String getAddressRef() {
		return addressRef;
	}
	
	/**
	 * Sets the address ref.
	 *
	 * @param addressRef the new address ref
	 */
	public void setAddressRef(String addressRef) {
		this.addressRef = addressRef;
	}
	
	/**
	 * Gets the address type.
	 *
	 * @return the address type
	 */
	public String getAddressType() {
		return addressType;
	}
	
	/**
	 * Sets the address type.
	 *
	 * @param addressType the new address type
	 */
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	
	/**
	 * Gets the address city.
	 *
	 * @return the address city
	 */
	public String getAddressCity() {
		return addressCity;
	}
	
	/**
	 * Sets the address city.
	 *
	 * @param addressCity the new address city
	 */
	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AddressContact [codeperson=" + codeperson + ", addressPrincipal=" + addressPrincipal
				+ ", numberAddress=" + numberAddress + ", addressInter=" + addressInter + ", addressRef=" + addressRef
				+ ", addressType=" + addressType + ", addressCity=" + addressCity + "]";
	}
	 

}

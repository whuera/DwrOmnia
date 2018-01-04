package ec.com.app.model;

/**
 * The Class Address.
 */
public class Address {

	/** The address. */
	private String address;

	/**
	 * Instantiates a new address.
	 *
	 * @param address
	 *            the address
	 */
	public Address(String address) {
		super();
		this.address = address;
	}

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address.
	 *
	 * @param address
	 *            the new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
}

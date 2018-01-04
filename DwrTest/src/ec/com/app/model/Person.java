package ec.com.app.model;


/**
 * The Class Person.
 */
public class Person {
	
	/**
	 * Instantiates a new person.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param address
	 *            the address
	 * @param age
	 *            the age
	 * @param superhero
	 *            the superhero
	 * @param addressoffice
	 *            the addressoffice
	 */
	public Person(String id, String name, String address, int age, boolean superhero, Address addressoffice) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
		this.superhero = superhero;
		this.addressoffice = addressoffice;
	}
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/** The id. */
	private String  id;
	
	/** The name. */
	private String name;
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @param address the new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * Gets the age.
	 *
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * Sets the age.
	 *
	 * @param age the new age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * Checks if is superhero.
	 *
	 * @return true, if is superhero
	 */
	public boolean isSuperhero() {
		return superhero;
	}
	
	/**
	 * Sets the superhero.
	 *
	 * @param superhero the new superhero
	 */
	public void setSuperhero(boolean superhero) {
		this.superhero = superhero;
	}
	
	/** The address. */
	private String address;
	
	/** The age. */
	private int age;
	
	/** The superhero. */
	private boolean superhero;
	
	/** The addressoffice. */
	private Address addressoffice;
	
	/**
	 * Gets the addressoffice.
	 *
	 * @return the addressoffice
	 */
	public Address getAddressoffice() {
		return addressoffice;
	}

	/**
	 * Sets the addressoffice.
	 *
	 * @param addressoffice
	 *            the new addressoffice
	 */
	public void setAddressoffice(Address addressoffice) {
		this.addressoffice = addressoffice;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + ", superhero="
				+ superhero + "]";
	}
	
}

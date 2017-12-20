
public class Info {

	
	private int id;
	private String name;
	
	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public void address_info() {
		// TODO Auto-generated method stub
		System.out.println(id);
		System.out.println(name);
		System.out.println(address);
	}
}

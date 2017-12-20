
public class Address {
private String street,city,address;

public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}
public String toString()
{
return street+""+city+""+address;
}
}





public class Depedent {
private String name,address;

Depedent(String n,String a)
{
	name=n;
	address=a;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}
public void depedent_info()
{
	System.out.println(name);
	System.out.println(address);
}


}

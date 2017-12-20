
public class FruitApp {

	private int price;
	
	private String name;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	void fruit_info()
	{
		System.out.println("the price:"+price);
		System.out.println("the name :"+name);
	}
	
	
}

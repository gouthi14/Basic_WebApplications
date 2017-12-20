
public class Employee {
	private String fruitType;
	private String name;
	public String getFruitType() {
		return fruitType;
	}
	public void setFruitType(String fruitType) {
		this.fruitType = fruitType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString()
	{
		return fruitType+""+name;
	}
}
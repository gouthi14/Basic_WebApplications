
public class Springemployee {

	
	private int id;
	private String name;
	
	Springemployee()
	{
		
	}
	Springemployee(int id,String name)
	{
		super();
		this.id=id;
		this.name=name;
		
	
	}
	Springemployee(String name,int id)
	{
		super();
		this.name=name;
		this.id=id;
	}
	Springemployee(int id)
	{
		super();
		this.id=id;
	}
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
	
	

}

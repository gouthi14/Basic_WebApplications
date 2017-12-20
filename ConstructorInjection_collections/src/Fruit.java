import java.util.Iterator;
import java.util.List;


public class Fruit {

	
	private int id;
	private String name;
	private List<String>prices;
	
	
	public Fruit()
	{
	}
	
	public Fruit(int id,String name,List<String>prices)
	{
		super();
		this.id=id;
		this.name=name;
		this.prices=prices;
	}
	
	
	public void fruit_Info()
	{
		System.out.println("id :"+id);
		System.out.println("name:"+name);
		
		System.out.println("Fruit Prices are");
	Iterator<String> it=prices.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
		
	}
	
}




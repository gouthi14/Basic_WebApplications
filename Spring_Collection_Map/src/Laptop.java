import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;




public class Laptop {

	private int id;

	private String company;
	private String os;
	private Map<String,String>varsions;
	
	Laptop()
	{
		
	}
		
	
	Laptop(int id,String company,String os,Map<String,String>varsions)
	{
		super();
		this.id=id;
		this.company=company;
		this.os=os;
		this.varsions=varsions;
		
	}

public void laptop_info()
{
	System.out.println(id);
	System.out.println(company);
	System.out.println(os);
	System.out.println("varsions of laptops");
	
	
	Set<Entry<String,String>> set=varsions.entrySet();
	
	Iterator<Entry<String,String>> itr=set.iterator();
	while(itr.hasNext())
	{
		Entry<String,String> entry=itr.next();
		System.out.println("varsions:  "+entry.getKey()+"   year of relese : "+entry.getValue());
	}
	

	
}
}


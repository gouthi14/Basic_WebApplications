import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class University {

	
	private int id;
	private String name;
	private Map<String,String>college;
	
	University()
	{
		
	}
	University(int id,String name,Map<String,String>college)
	{
		super();
		this.id=id;
		this.name=name;
		this.college=college;
	}
	
	public void university_info()
	{
		System.out.println("unversity id:"+id);
		System.out.println("unversity name:"+name);
		
		System.out.println("colleges of the university");
	
		Set<Entry<String,String>> set=college.entrySet();
		
		Iterator<Entry<String,String>> itr=set.iterator();
		while(itr.hasNext())
		{
			Entry<String,String> entry=itr.next();
			
			System.out.println("college:"+entry.getKey()+"year of Establish:"+entry.getValue());
		}
		
		
	}
}

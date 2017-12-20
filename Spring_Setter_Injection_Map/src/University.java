
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class University {
   
	private int id;
	private String name;
	private Map<String,String>college;
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
	
	
	
	public Map<String, String> getCollege() {
		return college;
	}
	public void setCollege(Map<String, String> college) {
		this.college = college;
	}
	public void university_info()
	{
		System.out.println("unversity id:"+id);
		System.out.println("name of university:"+name);
		
		Set<Entry<String,String>> set=college.entrySet();
		
		Iterator<Entry<String,String>> itr=set.iterator();
		while(itr.hasNext())
		{
			Entry<String,String> entry=itr.next();
			System.out.println("college:"+entry.getKey()+"year of estblish"+entry.getValue());
		}
		
	}
	
}

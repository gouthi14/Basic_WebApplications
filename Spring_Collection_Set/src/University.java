import java.util.Iterator;
import java.util.Set;




public class University {

	private int id;
	
	private String name;
	private Set<String>colleges;
	
	University()
	{
		
	}
	University(int id,String name,Set<String>colleges)
	{
		super();
		this.id=id;
		this.name=name;
		this.colleges=colleges;
	}
		
		
		public void university_info(){
		
			System.out.println(id);
			System.out.println(name);
			
		
		System.out.println("colleges");
		Iterator<String> lit=colleges.iterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		
	}
}

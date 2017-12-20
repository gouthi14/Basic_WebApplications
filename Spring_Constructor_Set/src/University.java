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
   
   
   public void university_info()
   {
	   System.out.println("university id:"+id);
	   System.out.println("name of the university:"+name);
	   
	   System.out.println("colleges of the university");
	   
	   Iterator<String> itr=colleges.iterator();
	   while(itr.hasNext())
	   {
		   System.out.println(itr.next());
	   }
   }

}




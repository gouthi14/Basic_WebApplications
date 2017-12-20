import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class College {
	
		private int id;
		private String name;
		private List<String>departments;
		
		public College()
		{
			
		}
		
		public College(int id,String name,List<String>departments)
		{
			super();
			this.id=id;
			this.name=name;
			this.departments=departments;
			
		}
		
	

	public void college_info() {
		// TODO Auto-generated method stub
		System.out.println("college id is:"+id);
		System.out.println("name of the college:"+name);
		System.out.println("Retriveing forwad departments of college");
		ListIterator<String> it=departments.listIterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("Retriveing elements in backward direction");
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
	}

}

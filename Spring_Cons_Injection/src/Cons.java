
public class Cons {
private String name,place;
  Cons()
  {
	  
  }

  Cons(String n,String p)
  {
	  name=n;
	  place=p;
  }
  
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPlace() {
	return place;
}

public void setPlace(String place) {
	this.place = place;
}
public void cons_info()
{
	System.out.println(name);
	System.out.println(place);
	
}



}

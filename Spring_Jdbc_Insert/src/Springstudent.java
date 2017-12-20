
public class Springstudent {

	
	private int id;
	private String name;
	private String department;
	private String school;
	
	
	Springstudent()
	{
		
	}
	Springstudent(int id,String name,String department,String school)
	{
		super();
		this.id=id;
		this.name=name;
		this.department=department;
		this.school=school;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	
}

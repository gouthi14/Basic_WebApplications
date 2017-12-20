
public class Office {

	
	private int id;
	Employee employee;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	public void employee_info()
	{
		System.out.println("Employee id:"+id);
		
         System.out.println("empolyee Details");
		
		
		System.out.println("Employee name:"+employee.getName());

		System.out.println("department:"+employee.getDepartment());
		System.out.println("Address:"+employee.getAddress());
	}
	
}

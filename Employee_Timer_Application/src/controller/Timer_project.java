package controller;

public class Timer_project {
 
	private String firstName;
	private String lastName;
	private String email;
	private String project;
	private int conformPassword;
	private int password;
	
	
	public Timer_project(){
		
	}
	
	public Timer_project(String firstName,String lastName,String email,String project,int password,int conformPassword){
		
		super();
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.project=project;
		this.password=password;
		this.conformPassword=conformPassword;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public int getConformPassword() {
		return conformPassword;
	}

	public void setConformPassword(int conformPassword) {
		this.conformPassword = conformPassword;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
}

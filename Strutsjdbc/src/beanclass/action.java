package beanclass;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class action extends ActionForm 
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String firstName;
private String lastName;
private String userName;
private String password;
private String email;
private String phoneNumber;

public ActionErrors Validate(ActionMapping mapping,HttpServletRequest request)
{
           ActionErrors errors=new ActionErrors();
           if(firstName==null || firstName.length()<1)
           {
        	   errors.add("firstName",new ActionMessage("errors.firstName.required"));
        	   
           }
           if(lastName==null || lastName.length()<1)
           {
        	   errors.add("lastName",new ActionMessage("errors.lastName.required"));
        	   
           }
           if(userName==null || userName.length()<1)
           {
        	   errors.add("userName",new ActionMessage("errors.uaerName.required"));
           }
           if(password==null || password.length()<1)
           {
        	   errors.add("password",new ActionMessage("errors.password.required"));
        	   
           }
           if(email==null || email.length()<1)
           {
        	   errors.add("email",new ActionMessage("errors.email.required"));
           }
           if(phoneNumber==null || phoneNumber.length()<1)
           {
        	   errors.add("phoneNumber",new ActionMessage("errors.phoneNumber.required"));
           }
        	   return errors;
           




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

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

}

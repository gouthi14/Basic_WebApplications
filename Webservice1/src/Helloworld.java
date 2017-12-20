import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName="Helloworld")
	
public class Helloworld {

	@WebMethod(operationName="hello")
	public String hello(@WebParam(name="name")String txt)
	{
		return "hello"+txt+"";
	}
	
}

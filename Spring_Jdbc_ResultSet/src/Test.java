

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	
	public static void main(String args[])
	{
		ApplicationContext acc=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	SpringstudentDao ss=(SpringstudentDao)acc.getBean("sdao");
	List<Springstudent> list=ss.getAllStudents();
	for(Springstudent s:list)
		System.out.println(s);
	
	
	}
}






public class Thread {
    public static void main(String[] args){
        ThreadB b = new ThreadB();
        b.start();
 
        synchronized(b){
            try{
                System.out.println("Waiting for b to complete...");
                b.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
 
            System.out.println("Total is: " + b.total);
        }
    }
}
 
class ThreadB extends Goutham{
    int total;
    @Override
    public void run(){
        synchronized(this){
            for(int i=0; i<100 ; i++){
                total += i;
            }
            notify();
        }
    }
}

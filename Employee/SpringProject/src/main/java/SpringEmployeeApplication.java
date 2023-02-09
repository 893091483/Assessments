


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SpringEmployeeApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring/Employee.xml");
		
		GetEmployee  e=  (GetEmployee) ctx.getBean("getEmployee");
		Employee employee= e.getEmployee();
		System.out.println("Employee detail:");
		System.out.println(employee.toString());
	}

}

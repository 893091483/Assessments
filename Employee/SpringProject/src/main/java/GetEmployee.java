

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;




public class GetEmployee {
	@Autowired 
		Employee employee;
	public Employee getEmployee () {
		return this.employee;
	}
	public void setEmployee (Employee employee) {
		this.employee = employee;
	}
}

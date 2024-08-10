package SpringBootApplication.bindings.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import SpringBootApplication.bindings.Customer;
@RestController
public class CustomerRestController {
@GetMapping( value="/customer" ,produces={"application/json","application/xml"})
	public Customer getCustomerData() {
		
		Customer c=new Customer()
;
		c.setCustomerId(560);
		c.setCustomerName("ghhhhh");
		c.setCustomerPhno(785855555l);
		
		
		return c;
		
	}
	
	
}

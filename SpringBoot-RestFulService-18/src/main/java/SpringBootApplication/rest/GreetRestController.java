package SpringBootApplication.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class GreetRestController {
@GetMapping("/greet")
	public String getGreetMsg() {
		
		String msg="good morning";
		return msg;
		
	}
@GetMapping("/wish")
public String getWishMsg() {
	
	String msg="good jjjjjj morning";
	return msg;
	
}

}

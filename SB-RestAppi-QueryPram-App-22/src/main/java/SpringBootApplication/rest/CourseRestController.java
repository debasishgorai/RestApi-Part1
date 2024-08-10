package SpringBootApplication.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CourseRestController {

	@GetMapping(value="/course")
	public String getPlayerDetails(@RequestParam(value="name" ,defaultValue="Dhoni")String name) {
		String msg="";
		if("Dhoni".equals(name)) {
			msg="ms Dhoni is best batsman";
		}
		else if("Bhuvi".equals(name)) {
			msg="bhuvi is best bowler in the world";
		}
		else if("abdevilliars".equals(name)) {
			msg="abdevilliars is best finisher in the world";
		}
		else {
			msg=" ALL are Fraud Players";
		}
		return msg;
		
	}
	@GetMapping(value="/fees")
	public String getPlayersFees(@RequestParam("pname")String pname,@RequestParam("tname")String tname) {
		String msg=pname+" sold by"+tname+"250000.000crores";
		return msg;
		
		
	}
	
	
	
	
}

package SpringBootApplication.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PlayerFees {
	@GetMapping("/fees/{pname}/coach/{tname}")
	public String getPlayersFees(@PathVariable String pname,@PathVariable String tname) {
		String msg=pname+" sold by  "+tname+"  250000.000crores";
		return msg;
		
		
	}
}

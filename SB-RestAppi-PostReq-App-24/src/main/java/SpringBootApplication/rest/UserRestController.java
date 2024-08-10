package SpringBootApplication.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import SpringBootApplication.bindings.User;
@RestController
public class UserRestController {

	@PostMapping(value="/user" ,consumes = {"application/json","application/xml"},produces = {"text/plains"})
	public String AddUser(@RequestBody User user) {
		
		String msg="User Succesfully Saved";
		return msg;
	}
}

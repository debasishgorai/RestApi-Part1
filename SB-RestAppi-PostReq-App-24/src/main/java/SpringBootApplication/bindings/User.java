package SpringBootApplication.bindings;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
 private Integer uId;
 private String fname;
 public User() {
	System.out.println("User::Constructors");
	// TODO Auto-generated constructor stub
}
private String lname;
 private String email;
@Override
public String toString() {
	return "User [uId=" + uId + ", fname=" + fname + ", lname=" + lname + ", email=" + email + "]";
}
public Integer getuId() {
	return uId;
}
public void setuId(Integer uId) {
	this.uId = uId;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}

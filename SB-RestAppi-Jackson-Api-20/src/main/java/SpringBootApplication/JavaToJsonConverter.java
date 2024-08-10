package SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConverter {
public static void main(String[] args) throws Exception {
	Book b=new Book();
	b.setBookId(101);
	b.setBookName("Ms Dhoni");
	b.setBookPrice(2000.00);
	//b.setBookId(101);
	
	
	ObjectMapper mapper =new ObjectMapper();
	String json= mapper.writerWithDefaultPrettyPrinter().writeValueAsString(b);
	System.out.println(json);
}
}

package SpringBootApplication;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JavaToXmlConverter {
public static void main(String[] args) throws Exception {
	Book b=new Book();
	b.setBookId(1012);
	b.setBookName("Msss Dhoni");
	b.setBookPrice(20085.00);
	
	JAXBContext context=JAXBContext.newInstance(Book.class);
	Marshaller marshaller= context.createMarshaller();
	marshaller.marshal(b, System.out);
	
}
}

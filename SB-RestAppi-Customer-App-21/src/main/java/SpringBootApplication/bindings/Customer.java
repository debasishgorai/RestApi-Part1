package SpringBootApplication.bindings;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
 private Integer customerId;
 private String customerName;
 private Long customerPhno;

@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPhno=" + customerPhno
			+ "]";
}
public Integer getCustomerId() {
	return customerId;
}
public void setCustomerId(Integer customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public Long getCustomerPhno() {
	return customerPhno;
}
public void setCustomerPhno(Long customerPhno) {
	this.customerPhno = customerPhno;
}
}

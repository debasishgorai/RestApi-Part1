package SpringBootApplication.response;




public class Book {
private Integer bookId;
private String bookName;
private Double bookPrice;

public Book(Integer bookId, String bookName, Double bookPrice) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
	this.bookPrice = bookPrice;
}
@Override
public String toString() {
	return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
}
public Integer getBookId() {
	return bookId;
}
public void setBookId(Integer bookId) {
	this.bookId = bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public Double getBookPrice() {
	return bookPrice;
}
public void setBookPrice(Double bookPrice) {
	this.bookPrice = bookPrice;
}
}

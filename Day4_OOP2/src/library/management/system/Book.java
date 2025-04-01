package library.management.system;

public class Book {
	 protected String title;
	 protected String author;
	 protected String isbn;
	 protected boolean isBorrowed = false;
	 
	 public Book() {
		 
	 }
	 
	 public Book(String title, String author, String isbn, boolean isBorrowed) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isBorrowed = isBorrowed;
	}

	public String getTitle() {
		 return title;
	 }
	 public String getAuthor() {
		 return author;
	 }
	 public String getISBN() {
		 return isbn;
	 }
	 public void borrowBook() {
		 isBorrowed=true;
	 }
	 public void returnBook() {
		 isBorrowed=false;
	 }
	 public boolean isAvailable() {
		 return !isBorrowed; //if book is borrowed, then it is not available
	 }
	 
	 
	 //main method
	 public static void main(String[] args) {
 
	}
}

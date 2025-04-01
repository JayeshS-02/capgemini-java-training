package library.management.system;

public class Member {
//	 - Fields: 
//		    - `name` (String) 
//		    - `memberID` (String) 
//		    - `borrowedBook1`, `borrowedBook2`, `borrowedBook3` (Book): Fields to store up to three borrowed books 
//		(you can add more if needed) 
//		  - Methods: 
//		    - `getName()`: Return the member's name. 
//		    - `getMemberID()`: Return the member's ID. 
//		    - `borrowBook(Book book)`: Check if any of the `borrowedBook` fields are `null`, then assign the book to that 
//		field and mark it as borrowed. 
//		    - `returnBook(Book book)`: Compare the book with each `borrowedBook` field, if found, set the field to `null` 
//		and mark the book as returned. 
//		    - `getBorrowedBooks()`: Display the titles of all books borrowed by the member. 
//	
	protected String name;
	protected String memberID;
	protected Book borrowedBook1;
	protected Book borrowedBook2;
	protected Book borrowedBook3;
	
	public Member() {
		
	}
	
	public Member(String name, String memberID, Book borrowedBook1, Book borrowedBook2, Book borrowedBook3) {
		super();
		this.name = name;
		this.memberID = memberID;
		this.borrowedBook1 = borrowedBook1;
		this.borrowedBook2 = borrowedBook2;
		this.borrowedBook3 = borrowedBook3;
	}

	public Book getBorrowedBook1() {
		return borrowedBook1;
	}

	public void setBorrowedBook1(Book borrowedBook1) {
		this.borrowedBook1 = borrowedBook1;
	}

	public Book getBorrowedBook2() {
		return borrowedBook2;
	}

	public void setBorrowedBook2(Book borrowedBook2) {
		this.borrowedBook2 = borrowedBook2;
	}

	public Book getBorrowedBook3() {
		return borrowedBook3;
	}

	public void setBorrowedBook3(Book borrowedBook3) {
		this.borrowedBook3 = borrowedBook3;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	public String getName()
	{
		return name;
	}
	public String getMemberID()
	{
		return memberID;
	}
	
	public static void main(String[] args) {
		
	}
}

package libarary.com.pack;

import java.util.ArrayList;

public class Library
{
	private ArrayList<Book> books =new ArrayList<>();
	 public void  addBook(Book book) {
		 books.add(book);
	 }
	 public void displayBooks()
	 {
		 for(Book book : books)
		 {
			 System.out.println(book);
		 }
	 }
	 public void issueBook(String title)
	 {
		 for(Book book : books)
		 {
			if (book.getTitle().equalsIgnoreCase(title) && book.isIssued()){
				 book.issueBook();
				 System.out.println("book returned succesfully");
				 return;
			 }
		 }
		 System.out.println("Book not availble ");
	 }
	 public void returnBook(String title)
	 {
		 for(Book book : books)
		 {
			 if(book.getTitle().equalsIgnoreCase(title) && book.isIssued())
			 {
				 book.returnBook();
				 System.out.println(" Book returned successfully");
				 return;
			 }
		 }
		 System.out.println("book not found or not issued.");
	 }

}S

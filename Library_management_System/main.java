package libarary.com.pack;

public class Main 
{
	public static void main(String[] args) 
	{
		Library library= new Library();
		library.addBook(new Book("Java basics","Narasimha"));
		library.addBook(new Book("Spring Boot","gowtham"));
		library.addBook(new Book("oops consepts","sai"));
		System.out.println("available books");
		library.displayBooks();
		System.out.println("sprin boot");
		System.out.println("\navailable books: ");
		library.displayBooks();
		System.out.println("\nreturning 'Spring boot' :");
		library.returnBook("spring Boot");
		System.out.println("\nAvailable Books");
		library.displayBooks();	
}

}

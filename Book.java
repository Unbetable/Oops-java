import java.util.ArrayList;
import java.util.Iterator;

public class Book 
{
	//attributes
    private String title;
    private String author;
    private String isbn;
    private ArrayList<Book> books;

  //constructor with arguments 
    public Book(String title, String author, String isbn, ArrayList<Book> books) {
		
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.books = books;
	}
    
    //getter methods to get the value which we stored in the collection
    public String getTitle() 
    {
		return title;
	}

	public String getAuthor() 
	{
		return author;
	}

	public String getIsbn()
	{
		return isbn;
	}

	public ArrayList<Book> getBooks() 
	{
		return books;
	}
	
	
     //adding removing methods
	
	 public void addBook(Book book)
	 {
	        books.add(book);
	 }

	 public void removeBook(Book book)
	 {
	        books.remove(book);
	 }

	   
     // to get useful information in output 
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + "]";
	}

	public static void main(String[] args)
	{
		
        ArrayList<Book> books = new ArrayList<Book>();

        // Add books to the collection
        books.add(new Book("The Alchemist", "Paulo Coelho", "978-0062315007", books));
        books.add(new Book("The Da Vinci Code", "Dan Brown", "978-0307474278",books));
        System.out.println("All books will be displayed");
        System.out.println("Books:"+ books);

        System.out.println("------------------------------------------------------");
        System.out.println("after removing books ,remaining books will be displayed");
        // Remove a book from the collection
        books.remove(0); //we should provide the index values to remove the particular book
        System.out.println("Books:"+ books);
        

    }
}

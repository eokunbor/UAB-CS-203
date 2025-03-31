import static org.junit.Assert.*; 
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class BookStoreTest {

	private BookStore store;
	private Book b1 = new Book(1, "Harper Lee", "To Kill a Mockingbird");
	private Book b2 = new Book(2, "Harper Lee", "To Kill a Mockingbird");
	private Book b3 = new Book(3, "Frances Hodgson", "The Secret Garden");
	private Book b4 = new Book(5, "J.K. Rowling", "Harry Potter and the Sorcerer's Stone");
	private Book b5 = new Book(4, "Douglas Adams", "The Hitchhiker's Guide to the Galaxy");


	@Before
	public void setUpBookStore() {
		store = new BookStore();
		store.addBook(b1);
		store.addBook(b2);
		store.addBook(b3);
		store.addBook(b4);
	}


	@Test
	public void testAddBook() {
		store.addBook(b5);
		assertTrue(store.getBooks().contains(b5));
	}


	@Test
	public void testDeleteBook() {
		store.deleteBook(b1);
		assertFalse(store.getBooks().contains(b1));
	}


	@Test
	public void testGetBooksSortedByAuthor() {
		store.addBook(b5);
		
		List<Book> sortedBooks = store.getBooksSortedByAuthor();
		
		assertEquals("Douglas Adams", sortedBooks.get(0).getAuthorName());
		assertEquals("Frances Hodgson", sortedBooks.get(1).getAuthorName());

		assertTrue(sortedBooks.get(2).getAuthorName().equals("Harper Lee"));
		assertTrue(sortedBooks.get(3).getAuthorName().equals("Harper Lee"));
		
		assertEquals("J.K. Rowling", sortedBooks.get(4).getAuthorName());
	}


	@Test
	public void testGetBooksSortedByTitle() {
		store.addBook(b5);
		
		List<Book> sortedBooks = store.getBooksSortedByTitle();
		
		assertEquals("Harry Potter and the Sorcerer's Stone", sortedBooks.get(0).getTitle());
		assertEquals("The Hitchhiker's Guide to the Galaxy", sortedBooks.get(1).getTitle());
		assertEquals("The Secret Garden", sortedBooks.get(2).getTitle());
		assertTrue(sortedBooks.get(3).getTitle().equals("To Kill a Mockingbird"));
		assertTrue(sortedBooks.get(4).getTitle().equals("To Kill a Mockingbird"));
	}


	@Test
	public void testCountBookWithTitle() {
		assertEquals(2, store.countBookWithTitle("To Kill a Mockingbird"));
		assertEquals(1, store.countBookWithTitle("The Secret Garden"));
		assertEquals(0, store.countBookWithTitle("Book that doesn't exist"));
	}
}
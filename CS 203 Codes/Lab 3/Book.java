/*
 * Try to keep each java file short. You should break up your program into small components.
 * The main class should be short. Each individual class file should be short.
 * Even each function should be short. 
 * 
 * Modularity is key to Object Oriented Programming.
 * 
 * Good Luck!
 */

public class Book {

	/*
	 * VARIABLES
	 * They also may be called:
	 * 		instance variables 
	 * 		member variables 
	 * 		attributes
	 * 		fields 
	 * These all mean variables that belong to an object.
	 */

	private String name;
	private int page;
	private boolean stock;

	/*
	 * CONSTRUCTOR
	 * assigns values to the variables above
	 * The constructor is always called right after the "new" keyword like:
	 * new Book("Some Book Name", 143, true)
	 */

	public Book(String name, int page, boolean stock) {
		this.name = name;
		this.page = page;
		this.stock = stock;
	}
	
	/*
	 * SETTERS and GETTERS
	 * Getters returns or "accesses" a value from the variables
	 * Setters change or "mutate" the variables
	 */

	public String getName() {

		return this.name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public int getPageNumber() {

		return this.page;
	}

	public void setPageNumber(int num) {

		this.page = num;
	}

	public boolean getStock() {

		return this.stock;
	}

	public void setStock(boolean stock) {

		this.stock = stock;
	}
	
	/*
	 * METHODS
	 * Methods are functions that belong to an object/class.
	 * They are just custom functions that you can create for your class!
	 * These methods can only be used by an object of this class.
	 */

	public String reverseName() {

		String name = this.getName();
		int index = name.length() - 1;
		String result = " ";

		for (int i = index; i > -1; i--) {
			result = result + name.charAt(i);
		}

		return result;
	}
	
	/*
	 * toString is a very important method in Java
	 * Instead of returning some "hexadecimal address" from memory,
	 * You can call this method to return a string representation of this object.
	 * Try printing an object without this method, then do it with this method implemented.
	 */

	public String toString() {
		
		// Notice how the string showcases all of the values inside the object's variables?

		String out = "Book name: " + this.getName() + 
					 ". Page number: " + this.getPageNumber() + 
					 ". In Stock: " + this.getStock();
		
		return out;
	}

}

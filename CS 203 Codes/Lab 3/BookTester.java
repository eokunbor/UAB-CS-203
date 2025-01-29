/*
 * BookTester is our main class. Notice how it contains the main method!
 * 
 * 		public static void main(String[] args) { ... }
 * 
 * This main method should always be put into a main class.
 * 
 * Your Java program should only contain one main method, which is stored in the main class.
 * The main class might have all sorts of naming conventions:
 * 		SomethingTester.java
 * 		SomethingDriver.java
 * 		SomethingLauncher.java
 * 		or even simply named Application.java
 * 
 * Your main class will be the entry point to your Java program since it has the main method.
 * 
 * WARNING: Do not submit more than one main method in any of your assignments!
 * You simply run one Java program, and not have to run multiple Java programs.
 * 
 * Some may be wondering this: Yes, your Java program can be made of many .java files!
 * As projects become more complex, each java file should have a single, clear responsibility.
 */


public class BookTester {
	public static void main(String[] args) {
	  Book book1 = new Book("Book One", 450, true);
	  Book book2 = new Book("Book Two", 50, true);
	  
	  // To call methods of Book, you need a Book object

	  System.out.println("Testing reverse method: " + book1.reverseName());
	  
	  // Notice how you don't have to call toString() 
	  // in order to print the String representation of the object?
	  
	  System.out.println("Testing toString method: " + book1);
	  System.out.println("Testing toString method: " + book2);
	}
}

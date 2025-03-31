package Lab10;

public class RestaurantDriver {
    public static void main(String[] args) {
        System.out.println("Creating restaurant objects...");
        
        ItalianRestaurant italianPlace = new ItalianRestaurant("Mama Mia", 10, true);
        AmericanRestaurant americanPlace = new AmericanRestaurant("Uncle Sam's Diner", 15, true);
        MexicanRestaurant mexicanPlace = new MexicanRestaurant("El Taco", 12, false, true);
        
        System.out.println("\n----- ITALIAN RESTAURANT -----");
        italianPlace.showInfo();
        italianPlace.cookSpecialtyDish();
        italianPlace.servePizza();
        italianPlace.playItalianMusic();
        italianPlace.deliverFood();
        
        System.out.println("\n----- AMERICAN RESTAURANT -----");
        americanPlace.showInfo();
        americanPlace.cookSpecialtyDish();
        americanPlace.serveBurger();
        americanPlace.celebrateJuly4th();
        
        System.out.println("\n----- MEXICAN RESTAURANT -----");
        mexicanPlace.showInfo();
        mexicanPlace.cookSpecialtyDish();
        mexicanPlace.serveTacos();
        mexicanPlace.serveSalsa();
        mexicanPlace.serveBurger();
        
        System.out.println("\nProgram completed successfully!");
    }
}

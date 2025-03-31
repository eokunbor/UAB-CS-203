package Lab10;

public class AmericanRestaurant extends Restaurant {
    private boolean servesBurgers;
    
    public AmericanRestaurant(String name, int tables, boolean servesBurgers) {
        super(name, tables);
        this.servesBurgers = servesBurgers;
    }
    
    @Override
    public void cookSpecialtyDish() {
        System.out.println(getName() + " is cooking hamburgers!");
    }
    
    public void serveBurger() {
        if (servesBurgers) {
            System.out.println(getName() + " is serving a juicy burger.");
        } else {
            System.out.println(getName() + " doesn't have burgers on the menu.");
        }
    }
    
    public void celebrateJuly4th() {
        System.out.println(getName() + " is having a special July 4th event!");
    }
}

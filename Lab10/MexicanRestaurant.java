package Lab10;

public class MexicanRestaurant extends AmericanRestaurant {
    private boolean servesTacos;
    
    public MexicanRestaurant(String name, int tables, boolean servesBurgers, boolean servesTacos) {
        super(name, tables, servesBurgers);
        this.servesTacos = servesTacos;
    }
    
    @Override
    public void cookSpecialtyDish() {
        System.out.println(getName() + " is cooking tacos!");
    }
    
    public void serveTacos() {
        if (servesTacos) {
            System.out.println(getName() + " is serving delicious tacos.");
        } else {
            System.out.println(getName() + " is out of tacos today.");
        }
    }
    
    public void serveSalsa() {
        System.out.println(getName() + " is serving homemade salsa.");
    }
}
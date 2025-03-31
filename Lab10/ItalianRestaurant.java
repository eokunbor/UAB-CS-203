package Lab10;

public class ItalianRestaurant extends Restaurant implements DeliveryService {
    private boolean hasPizzaOven;
    
    public ItalianRestaurant(String name, int tables, boolean hasPizzaOven) {
        super(name, tables);
        this.hasPizzaOven = hasPizzaOven;
    }
    
    @Override
    public void cookSpecialtyDish() {
        System.out.println(getName() + " is cooking pasta!");
    }
    
    public void servePizza() {
        if (hasPizzaOven) {
            System.out.println(getName() + " is serving fresh pizza from our oven.");
        } else {
            System.out.println(getName() + " cannot serve pizza - no oven available.");
        }
    }
    
    public void playItalianMusic() {
        System.out.println(getName() + " is playing Italian music for ambiance.");
    }
    
    @Override
    public void deliverFood() {
        System.out.println(getName() + " is delivering Italian food to your home!");
    }
}

package Lab10;

public abstract class Restaurant {
    private String name;
    private int tables;
    
    public Restaurant(String name, int tables) {
        this.name = name;
        this.tables = tables;
    }
    
    public void showInfo() {
        System.out.println("Restaurant name: " + name);
        System.out.println("Number of tables: " + tables);
    }
    
    public abstract void cookSpecialtyDish();
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getTables() {
        return tables;
    }
    
    public void setTables(int tables) {
        this.tables = tables;
    }
}
package Inheritance;

public class Firedwings implements Food{

    @Override
    public void price() {
        System.out.println("Price : 300");
    }
    @Override
    public void qunatity() {
        System.out.println("Quantity : 12 wings");
    }
    
}

package Inheritance;

public  class Kabab implements Food{

    @Override
    public void price() {
        System.out.println("Price : 450");
    }

    @Override
    public void qunatity() {
        System.out.println("Quantity : 6 kabab's");
    }
    
}

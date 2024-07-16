public class Burger implements Food {

    @Override

    public void price() {
        System.out.println("The Price of Burger is 200");  
}

    @Override   

    public void quantity() {
        System.out.println("Quantity of Burger is 1");
    }
}

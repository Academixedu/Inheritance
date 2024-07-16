public class Menu1 implements Food1{

    @Override
    public void Dosa() {
        System.out.println("Food is Dosa");
    }

    void idle(int price , int quantity){
        System.out.println("quantity is "+price +" and price is "+quantity);
    }

    
    
}

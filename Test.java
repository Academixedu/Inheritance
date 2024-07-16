public class Test {
    public static void main(String[] args) {
        Foods f1=new Foods();
        f1.price();
        f1.quantity();

        //child class
        Foods f2=new Burger();
        f2.price();
        f2.quantity();

        Foods f3=new Pizza();
        f3.price();
        f3.quantity();
    }
    
}

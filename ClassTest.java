

public class ClassTest {
    public static void main(String[] args) {
        
        Food f=new Food();
        f.price("100");
        Food f3=new FriedRice();
        f3.price("500 units");//parent reference can only access parent methods,it cant access all child methods
        Noodles f1=new Noodles();
        f1.quantity(5);
        f1.price("450 units");
        FriedRice f2=new FriedRice();
        f2.chickenOrNot(true);
        f2.price("120 units");
        

        
        
        
        
    }

}

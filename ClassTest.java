public class ClassTest
{
    public static void main(String[] args) 
    {

        Burger b=new Burger();
        b.eat();// I am eating a burger
        b.Price(); // The price of a burger is 100

        Pizza p=new Pizza();
        p.Taste();// The taste is delecious
        p.Quantity();// The quantity is too high

        Food f1=new Food();
        f1.Price(); // The price is Expensive
        f1.Quantity();// The quantity is high

        Food f=new Burger();
        f.Price(); // The price of a burger is 100
        f.Quantity();// The quantity is high
        
        Food f2=new Pizza();
        f2.Quantity(); // The quantity is too high
        f2.Price();// The price is Expensive

    }
}

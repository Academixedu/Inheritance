package Inheritance;
public class ClassTest
{
    public static void main(String[] args)
    {
        Foods f = new Foods();
        f.price();
        f.qunatity();
        Foods f1=new Biryani();
        f1.price();
        f1.qunatity();
        Foods f2=new Friedrich();
        f2.price();
        f2.qunatity();
    }
}

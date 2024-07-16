package Inheritance;
/**
 * InterFaceTest
 */
public class InterFaceTest {

    public static void main(String[] args) {
        Food f=new Firedwings();
        f.price();
        f.qunatity();
        Food f1=new Kabab();
        f1.price();
        f1.qunatity();
    }
}

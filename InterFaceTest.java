public class InterFaceTest {

    public static void main(String[] args) {
        Interface_food i=new Interface_dosa();
        i.chickenOrNot(false);
        i.quantity(4);
        i.price(80);
        
        Interface_food i1=new Interface_parotta();
        i1.chickenOrNot(true);
        i1.quantity(2);
        i1.price(160);

        Interface_dosa i2=new Interface_dosa();
        i2.chickenOrNot(false);
        i2.quantity(3);
        i2.price(90);
        i2.taste(false);

        
    }
}

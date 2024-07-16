public class ClassTest {
    
    public static void main(String[] args) {
        Tiffins t=new Tiffins();
        t.price();
        t.quantity();

        Tiffins d= new Dosa();
        d.price();
        d.quantity();

        Tiffins b= new Bonda();
        b.price();
        b.quantity();
    }
}


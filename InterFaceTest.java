public class InterFaceTest {
    public static void main(String[] args) {
        Tacos t1 = new CheesyGorditaCrunch();
        t1.introduced();
        t1.rating();
        t1.calories();
        t1.price();
    }
}

class CheesyGorditaCrunch implements Tacos {
    public void introduced() {
        System.out.println("Tacos introduced in 1905");
    }
    
    public void rating() {
        System.out.println("3.8 rating");
    }
    
    public void calories() {
        System.out.println("105 calories");
    }
    
    public void price() {
        System.out.println("Price: 400");
    }
}

interface Tacos {
    void introduced();
    void rating();
    void calories();
    void price();
}


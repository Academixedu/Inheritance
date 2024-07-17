public class ClassTest {
    public static void main(String[] args) {
        Pancake p = new Pancake();
        p.introduced();
        p.rating();
        
        Waffles w = new Waffles();
        w.introduced();
        w.rating();
        w.price();
        
        Dessert d = new Dessert();
        d.introduced();
        d.rating();
        d.calories();
        d.price();
    }
}

class Pancake {
    public void introduced() {
        System.out.println("Dessert introduced in 600 BC");
    }
    
    public void rating() {
        System.out.println("4.5 rating");
    }
}

class Waffles extends Pancake {
    public void price() {
        System.out.println("Price: 250");
    }
}

class Dessert extends Waffles {
    public void calories() {
        System.out.println("93 calories");
    }
}


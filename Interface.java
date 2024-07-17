public class Interface {
    public static void main(String[] args) {
        Device device1 = new Smartphone();
        device1.brand();
        device1.batteryLife();
        device1.price();

        Device device2 = new Laptop();
        device2.brand();
        device2.batteryLife();
        device2.price();
    }
}

class Smartphone implements Device {
    public void brand() {
        System.out.println("Brand: Samsung");
    }
    
    public void batteryLife() {
        System.out.println("Battery life: 24 hours");
    }
    
    public void price() {
        System.out.println("Price: $999");
    }
}

class Laptop implements Device {
    public void brand() {
        System.out.println("Brand: Dell");
    }
    
    public void batteryLife() {
        System.out.println("Battery life: 8 hours");
    }
    
    public void price() {
        System.out.println("Price: $1200");
    }
}

interface Device {
    void brand();
    void batteryLife();
    void price();
}

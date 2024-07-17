
public class ClassTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.type();
        car.speed();
        
        Truck truck = new Truck();
        truck.type();
        truck.speed();
        truck.loadCapacity();
        
        ElectricCar electricCar = new ElectricCar();
        electricCar.type();
        electricCar.speed();
        electricCar.batteryLife();
        electricCar.loadCapacity();
    }
}

class Vehicle {
    public void type() {
        System.out.println("General vehicle");
    }
    
    public void speed() {
        System.out.println("Average speed: 80 km/h");
    }
}

class Car extends Vehicle {
    @Override
    public void type() {
        System.out.println("Vehicle type: Car");
    }
}

class Truck extends Vehicle {
    @Override
    public void type() {
        System.out.println("Vehicle type: Truck");
    }

    public void loadCapacity() {
        System.out.println("Load capacity: 10 tons");
    }
}

class ElectricCar extends Truck {
    @Override
    public void type() {
        System.out.println("Vehicle type: Electric Car");
    }

    public void batteryLife() {
        System.out.println("Battery life: 300 km");
    }
}

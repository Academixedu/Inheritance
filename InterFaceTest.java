public class InterFaceTest implements Apple{

    @Override
    public void eat() {
        System.out.println("we can eat Apple");
    }

    @Override
    public void price() {
        System.out.println("price is 100");
    }

    @Override
    public void color() {
        System.out.println("color is red");
    }

    public static void main(String[] args) {
        InterFaceTest obj = new InterFaceTest();
        obj.eat();
        obj.price();
        obj.color();
    }
}

public class ClassTest extends food {
    public void pizza() {
        System.out.println("pizza is very delicious");

    }
    public static void main(String[] args) {
        ClassTest obj = new ClassTest();
        obj.pizza(); 
        obj.burger();
    }
}

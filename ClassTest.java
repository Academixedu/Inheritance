public class ClassTest extends Food{
    public void burger(){
        System.out.println("burger is a food it costs 120/-");
    }
    public static void main(String[] args) {
        ClassTest obj = new ClassTest();
        obj.burger();
        obj.pizza();
    }

 
    
}

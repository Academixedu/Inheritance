class Animal{
    void eat(){
        System.out.println("eatiing..");
    }}
class Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}
public class Inheritance{
    public static void main(String[] args){
        Dog d=new Dog();  
        d.bark();  
        d.eat();  
        }}  

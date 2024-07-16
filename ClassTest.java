
class atm {
    public void withdraw(){
        System.out.println("Withdraw amount is 1000");
    } 
    public void balance(){
        System.out.println("The balance amount is 10000");
    }
    
}
class person1 extends atm{

    @Override
    public void withdraw(){
        System.out.println("withdraw amount for person1 is 10000");   
}

}
 class person2 extends atm{

    @Override
    public void balance(){
        System.out.println("The balance amount for person2 is 20000");
    }

}


public class ClassTest
{
    public static void main(String[] args) {
        atm a=new atm();
        atm p1=new person1();
        atm p2=new person2();
        a.withdraw();
        a.balance();

        p1.withdraw();

        p2.balance();  

    }
}

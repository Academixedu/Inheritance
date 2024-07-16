public class customer1 implements Bank {
    @Override
    public void depositCash(){
        System.out.println("Deposit cash is 5000");
    }

    @Override
    public void withdrawCash(){
        System.out.println("Withdraw cash is 4000");
    }
}

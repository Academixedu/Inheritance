public class customer2 implements Bank {
    @Override
    public void depositCash(){
        System.out.println("Deposit cash is 7000");
    }

    @Override
    public void withdrawCash(){
        System.out.println("Withdraw cash is 600");
    }
}

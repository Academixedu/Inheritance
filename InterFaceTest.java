class InterfaceTest implements Laptop {

    @Override
    public void keyboard() {
        System.out.println("laptop has a KeyBoard");
    }

    @Override
    public void mouse() {
        System.out.println("We can Navigate Using Mouse");
    }

    public static void main(String[] args) {
        InterfaceTest obj = new InterfaceTest();
        obj.keyboard();
        obj.mouse();
    }

}

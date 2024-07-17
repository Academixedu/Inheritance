interface Foods {
    void order1();
    void order2();
}


class OrderRecevied implements Foods {
    public void order1() {
        System.out.println("You ordered Idly which costs 20rs per plate");
    }

    public void order2() {
        System.out.println("You ordered Vada which costs 25rs per plate");
    }
}
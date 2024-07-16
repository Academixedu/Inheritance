class ClassTest extends Phone {
    void games() {
        System.out.println("can play games in a phone");
    }

    public static void main(String[] args) {
        ClassTest obj = new ClassTest();
        obj.call();
        obj.games();
    }
}
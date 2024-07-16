class ClassTest extends Food{
    void quantity(){
        System.out.println("The no of apples  are 10");
    }
    public static void main(String[] args) {
        ClassTest obj = new ClassTest();
        obj.drink();
        obj.quantity();
    }
}

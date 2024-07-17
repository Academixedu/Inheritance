class Food{
    void choice1(){
        System.out.println("Idly");
    }
    void choice2(){
        System.out.println("Dosa");
    }
}

class IdlyQ extends Food{
    void iquantity1(){
        System.out.println("1 plate of Idly");
    }
    void iquantity2(){
        System.out.println("2 plate of Idly");
    }
}

class DosaQ extends Food{
    void dquantity1(){
        System.out.println("1 plate of Dosa");
    }
    void dquantity2(){
        System.out.println("2 plate of Dosa");
    }
}

class IdlyA extends Food{
    void iAmount1(){
        System.out.println("Amount: 20");
        //iquantity1();
    }
    void iAmount2(){
        System.out.println("Amount: 40");
        //iquantity2();
    }
}

class DosaA extends Food{
    void dAmount1(){
        System.out.println("Amount: 25");
        //dquantity1();
    }
    void dAmount2(){
        System.out.println("Amount: 50");
        //dquantity2();
    }
}


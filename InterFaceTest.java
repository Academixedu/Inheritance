




class InterFaceTest implements Dosa,Idly{
    
       public  void price(){
            System.out.println("The price of the Dosa:120");
            System.out.println("The price of the Idly:50");

        }
       public  void quantity(){

        System.out.println("No of Idly=2");
        System.out.println("No of Dosa=2");
        }
        public static void main(String[] args) {
            InterFaceTest obj2=new InterFaceTest();
            obj2.price();
            obj2.quantity();

            
        }
        
    
    
}
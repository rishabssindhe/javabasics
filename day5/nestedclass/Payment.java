package day5.nestedclass;

public interface Payment {
    void pay();
}
class PaymentDemo {
    public static void main(String[] args) {
        Payment p=new Payment() {
                @Override
                public void pay() {
                    System.out.println("Payment done using credit card");
            }
        };
        p.pay();
        //SCALA Java 8(Stream,Annotations,Lambdas,Reflection)
        Payment p1=(() -> System.out.println("Cash Payment"));
        p1.pay();
    }
}
/*
Points to remember
One time implementation
No need to create separate class
It is used in events and callback functions
 */
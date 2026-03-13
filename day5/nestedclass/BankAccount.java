package day5.nestedclass;

public class BankAccount {
    private double balance =2000;
    //Member inner class
    class Transaction{
        void withdraw(double amount){
            if(amount<balance){
                balance-=amount;
                System.out.println("Balance "+balance);
            }
            else{
                System.out.println("Insufficient funds");
            }
        }
    }

    public static void main(String[] args) {
        BankAccount b=new BankAccount();
        //outer.inner in=new inner();
        BankAccount.Transaction tx=b.new Transaction();
        tx.withdraw(1000);
        tx.withdraw(3000);
    }
}
/*
🎶Points to remember
Transaction belongs to specific amount
Direct access in private variable balance
Clean Encapsulation
 */

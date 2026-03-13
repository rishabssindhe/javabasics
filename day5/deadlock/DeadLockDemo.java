package day5.deadlock;

public class DeadLockDemo {
    static final Object accountA=new Object();
    static final Object accountB=new Object();

    public static void main(String[] args) {
        Thread t1=new Thread(() -> {
            synchronized (accountA) {
                System.out.println("Thread 1 locked account A");
                try{
                    Thread.sleep(2000);
                }catch(Exception e){}
                synchronized (accountB){
                    System.out.println("Thread 1 locked account B");
                }
            }
        });
        Thread t2=new Thread(() -> {
            synchronized (accountB) {
                System.out.println("Thread 2 locked account B");
                try{
                    Thread.sleep(2000);
                }catch(Exception e){}
                synchronized (accountA){
                    System.out.println("Thread 2 locked account A");
                }
            }
        });
        t1.start();
        t2.start();
    }

}
/*
Thread 1 acquires a lock on Account A and then sleeps giving
Thread 2 to acquires a lock on Account B .Now thread 1 waits for
Account A and Thread 2 waits for Account B . Since neither thread releases the lock
Both keep waiting and thus creating a DEADLOCK
DEADLOCK Explanation : DeadLock occurs when each Thread is holding a resource
and waiting for the other to release it.
*/
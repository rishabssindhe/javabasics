package day5.deadlock;

public class ThreadWithPriority extends Thread{
    public void run(){
        for (int i=1;i<=3;i++){
            System.out.println(Thread.currentThread().getName()+" priority "+Thread.currentThread().getPriority());

        }
    }

    public static void main(String[] args) {
        ThreadWithPriority t1=new ThreadWithPriority();
        ThreadWithPriority t2=new ThreadWithPriority();
        ThreadWithPriority t3=new ThreadWithPriority();
        t1.setName("Low Priority Thread");
        t2.setName("Medium Priority Thread");
        t3.setName("High Priority Thread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(9);
        t1.start();
        t2.start();
        t3.start();
    }
}
/*
Points to remember
Thread priority is only a suggestion to the JVM or the scheduler
Higher priority doesnt guarantee execution order
higher priority threads may get more CPU scheduler time
The actual behavior depends on the JVM and Operating system
 */
package day5.deadlock;

public class JoinProof {
    static class Task extends Thread{
        public void run() {
            try{
                Thread.sleep(2000);
            }catch(Exception e){

            }
            System.out.println("Task finished ");
        }
    }

    public static void main(String[] args)throws InterruptedException {
        Task t=new Task();
        t.start();//The main thread doesnt wait for this thread
        t.join();//Code will wait (guaranteed)
        System.out.println("Main thread resumes");
    }
    }


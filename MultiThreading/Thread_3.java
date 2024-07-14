package MultiThreading;

// thread scheduler working
class Thread_Scheduler_Working extends Thread
{
    @Override
    public void run()
    {
        String n = Thread.currentThread().getName();
        for(int i = 0; i<5; i++)
        {
            System.out.println(n);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Thread_3 {
    public static void main(String[] args) throws InterruptedException {
        Thread_Scheduler_Working t1 = new Thread_Scheduler_Working();
        Thread_Scheduler_Working t2 = new Thread_Scheduler_Working();
        Thread_Scheduler_Working t3 = new Thread_Scheduler_Working();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        t3.start();

        String n = Thread.currentThread().getName();
        for(int i = 0; i<5; i++)
        {
            System.out.println(n);
            Thread.sleep(1000);
        }
    }
}

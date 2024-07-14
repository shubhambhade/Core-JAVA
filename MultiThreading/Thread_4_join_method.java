package MultiThreading;

class _A extends Thread
{
    @Override
    public void run()
    {
        String name = Thread.currentThread().getName();
        int i ;
        for (i=0;i<5;i++)
        {
            System.out.println(name);

        }
    }
}
public class Thread_4_join_method {
    public static void main(String[] args)  {
        _A t1 = new _A();
        _A t2 = new _A();
        _A t3 = new _A();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t2.start();
        try {
            t2.join();
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
        t1.start();
        t3.start();
    }
}

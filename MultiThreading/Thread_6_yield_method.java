package MultiThreading;
class Thread1 extends Thread
{
    @Override
    public void run()
    {
        String name = Thread.currentThread().getName();
        int i ;
        for (i=0;i<10;i++)
        {
            System.out.println(name);
            Thread.yield();
        }
    }
}
class Thread2 extends Thread
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
public class Thread_6_yield_method {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}

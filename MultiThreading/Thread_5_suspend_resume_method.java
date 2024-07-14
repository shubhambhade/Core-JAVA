package MultiThreading;

class _B extends Thread
{
    @Override
    public void run()
    {
        String name = Thread.currentThread().getName();
        int i ;
        for (i=0;i<3;i++)
        {
            System.out.println(name);

        }
    }
}
public class Thread_5_suspend_resume_method {
    public static void main(String[] args) {
        _B t1 = new _B();
        _B t2 = new _B();
        _B t3 = new _B();

        t1.setName("sham");
        t2.setName("ram");
        t3.setName("raju");

        t1.start();
        t2.start();
//        t2.suspend(); // pause not supported .
        t3.start();
//        t2.resume(); //restart not supported .
    }
}

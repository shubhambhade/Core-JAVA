package MultiThreading;

class IsAlive_method extends Thread
{
    @Override
    public void run()
    {
        System.out.println("isAlive method Program....");
    }
}
public class Thread_7_isAlive_method {
    public static void main(String[] args) {
        IsAlive_method t1 = new IsAlive_method();
        IsAlive_method t2 = new IsAlive_method();

        System.out.println(t2.isAlive());
        t1.start();
        System.out.println(t1.isAlive());
        t2.start();
    }
}

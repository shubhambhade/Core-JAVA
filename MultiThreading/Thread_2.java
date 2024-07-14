package MultiThreading;

class Thread_Runnable_Interface implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 0; i<5; i++)
        {
            System.out.println("Hello");
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}
public class Thread_2 {
    public static void main(String[] args) {
        Thread_Runnable_Interface ref = new Thread_Runnable_Interface();
        Thread t = new Thread(ref);
        t.start();
        for (int i = 0; i<5; i++) {
            System.out.println("main thread");
        }
    }
}

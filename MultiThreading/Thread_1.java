package MultiThreading;

class MultiThreading extends Thread
{
    @Override
    public void run()
    {
        for( int i = 0; i <5; i++)
        {
            System.out.println("Sham");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }

    }
}
public class Thread_1 {
    public static void main(String[] args) throws InterruptedException {
        MultiThreading t = new MultiThreading();
        t.start();
        for( int i = 0; i <5; i++)
        {
            System.out.println("Ram");
            Thread.sleep(1000);
        }
    }
}

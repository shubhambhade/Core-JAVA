package Exception_Handling;

public class Throw_Keyword {
    public static void main(String[] args)   //throws InterruptedException
    {
//        System.out.println(10/0);
//        throw new ArithmeticException("/ by zero");
      // throws
   /*     for (int i =1; i<=10; i++)
        {
            System.out.println(i);
            Thread.sleep(2000);

    */

        //another way  using try catch block
        for (int i = 1; i<=10; i++)
        {
            try {
                System.out.println(i);
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
        System.out.println("end main method");
    }
}

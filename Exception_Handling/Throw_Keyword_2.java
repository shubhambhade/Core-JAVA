package Exception_Handling;

// throw and throws keywords
class Throw_Keyword_2 {
    public static void to() throws InterruptedException {
        for(int i=1; i<=10; i++)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
    public static void main(String[] args) //throws InterruptedException
    {
        try
        {
            to();
            System.out.println(10/0);
        }
        catch (Exception e)
        {
            System.out.println("Exception Handled........");
        }
        System.out.println("main method end");

    }
}

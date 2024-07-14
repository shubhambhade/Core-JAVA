package Exception_Handling;

public class Exception_4 {
    public static void main(String[] args) {
        try
        {
            System.out.println("learn coding");
            int a = 20, b = 0,  c;
            c = a/b;
            System.out.println(c);
            System.out.println("java programming");
        }
        catch (Exception e)
        {
            System.out.println("cannot divisible by zero");
        }
        finally{
            System.out.println("learn exception concepts");
        }
        System.out.println("main method ended");

    }
}

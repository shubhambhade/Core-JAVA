package Exception_Handling;
//nested finally block
public class Exception_9 {
    public static void main(String[] args) {
        try{
            String s ="ankit";
            System.out.println(s.toUpperCase());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            try {
                System.out.println(10/0);
            }
            catch (ArithmeticException a)
            {
                System.out.println(a);
            }
           finally {
                System.out.println("inner finally block");
            }
        }
        System.out.println("main method end ");
    }
}

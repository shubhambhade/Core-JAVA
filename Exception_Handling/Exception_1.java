// ArithmeticException
package Exception_Handling;

public class Exception_1 {
    public static void main(String[] args) {
        int a =10, b=0,c;
        try{
            c = a/b;
            System.out.println(c);
        }
        catch (Exception e)
        {
            System.out.println("Can,t divisible by zero");
            System.out.println(e.fillInStackTrace());
            System.out.println(e.getMessage());
        }
        System.out.println("main method ended");
    }
}

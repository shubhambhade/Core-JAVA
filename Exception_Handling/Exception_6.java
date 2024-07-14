package Exception_Handling;

import java.util.Locale;

// multiple catch block
public class Exception_6 {
    public static void main(String[] args) {
        try {
            int a = 10/2;
            System.out.println(a);

            int b[] ={10,20,30};
            System.out.println(b[5]);

            String s = null;
            System.out.println(s.toUpperCase());
        }
        catch (ArithmeticException x)
        {
            System.out.println("Arithmetic exception");
        }
        catch (ArrayIndexOutOfBoundsException y)
        {
            System.out.println("Array Exception");
        }
        catch (NumberFormatException z)
        {
            System.out.println("number exception");
        }
        catch (Exception w)
        {
            System.out.println("all type of exception");
        }
        System.out.println("main method ended");
    }
}

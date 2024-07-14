package Exception_Handling;

// multiple try-catch block
public class Exception_5 {
    public static void main(String[] args) {
        try {
            int a = 20, b = 0,  c;
            c = a/b;
            System.out.println(c);
        }
        catch (ArithmeticException a)
        {
            System.out.println("cannot divisible by zero");
        }
        try {
            int [] a = {10,20,30,40};
            System.out.println(a[5]);
        }
        catch (ArrayIndexOutOfBoundsException b)
        {
            System.out.println("out of array index range ");
        }
    }
}

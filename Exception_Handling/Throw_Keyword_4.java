package Exception_Handling;

public class Throw_Keyword_4 {
    public static void main(String[] args) {
        m1();
    }
    public static void m1()
    {
        try {
            m2();
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception handled");
        }

    }
    public static void m2()
    {
        int c = 10/0;
        System.out.println("Division : "+c);
    }
}

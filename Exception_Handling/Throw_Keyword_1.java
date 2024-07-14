package Exception_Handling;
class Test
{
    void div(int a, int b) //throws ArithmeticException
    {
        if(b == 0)
        {
            throw new ArithmeticException();
        }
        else
        {
            int c = a / b;
            System.out.println("Division : "+c);
        }
    }

    public static void main(String[] args) //throws ArithmeticException
    {
        Test obj = new Test();
//        obj.div(10,0);
        try {
            obj.div(10,0);
        }
        catch (Exception e)
        {
            System.out.println("The value of b is zero");
        }
    }
}
public class Throw_Keyword_1 {
}

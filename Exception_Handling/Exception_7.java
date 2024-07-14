package Exception_Handling;

// nested try block
public class Exception_7 {
    public static void main(String[] args) {
        try
        {
            try {
                int a[] ={10,20,30};
                System.out.println(a[5]);
            }
            catch (ArrayIndexOutOfBoundsException x){
                System.out.println("array exception");
            }
            int b = 10/0;
            System.out.println(b);
        }
        catch (ArithmeticException y)
        {
            System.out.println("Arithmetic exception");
        }
        System.out.println("main method end");
    }
}

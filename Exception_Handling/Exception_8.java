package Exception_Handling;

 //nested catch block
public class Exception_8 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch (Exception x){
            System.out.println(x);
            try {
                String s = null;
                System.out.println(s.toUpperCase());
            }
            catch (NullPointerException y)
            {
                System.out.println("null value cannot be converted");
            }
        }
        System.out.println("main method end");
    }
}

// NumberFormatException
package Exception_Handling;

public class Exception_3 {
    public static void main(String[] args) {
        String str = "sham";
        try {
            int a = Integer.parseInt(str);
            System.out.println(a);
        }
        catch (NumberFormatException e)
        {
            System.out.println("String "+str+" cannot be converted to integer.");
        }
        System.out.println("main method ended");
    }
}

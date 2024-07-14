//NullPointerException

package Exception_Handling;

public class Exception_2 {
    public static void main(String[] args) {
        String str = null;
        try{
            System.out.println(str.toUpperCase());
        }
        catch (NullPointerException e)
        {
            System.out.println("null cannot be casted");
        }
    }
}

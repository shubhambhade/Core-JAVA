package Interface;

interface  H
{
//    private void add(int x,int y)
//    {
//        System.out.println("Sum of 2 numbers : "+(x+y));
//    }
//    //1st way
//    default void call()
//    {
//        add(12,14);
//    }
   private static void add(int x,int y)
    {
        System.out.println("Sum of 2 numbers : "+(x+y));
    }
    // 2nd way
    public static void call()
    {
        add(13,23);
    }
}
class I implements H
{
    public void sub(int x,int y)
    {
        System.out.println("Sub of 2 numbers : "+(x-y));
    }
}
public class Interface_3 {
    public static void main(String[] args) {
        I ref = new I();
        ref.sub(12,34);
//        ref.add(12 34); --> it gives error because it is of private method of interface.
//        ref.call(); // --> we can access the private method of interface with the help of  default method of interface.
        H.call();
    }
}

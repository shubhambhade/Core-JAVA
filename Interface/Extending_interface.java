package Interface;
interface Gill
{
   void add();
}
interface  Raj extends Gill
{
    void sub();
}
class Ankit implements Raj
{
    @Override
    public void add()
    {
        int a =12;
        int b = 2;
        System.out.println("Addition : "+(a+b));
    }
    @Override
    public void sub()
    {
        int a =12;
        int b = 2;
        System.out.println("Subtraction : "+(a-b));
    }
}
public class Extending_interface {
    public static void main(String[] args) {
        Raj ref = new Ankit();
        ref.add();
        ref.sub();
    }
}

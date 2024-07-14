package oops.AbstractClass;

abstract class Programming
{
    public abstract void Developer();
    public abstract void rank();
}
abstract class HTML extends Programming
{
    @Override
    public void Developer()
    {
        System.out.println("Tim Berners Lee");
    }
}
class Java extends HTML
{
    @Override
    public void rank()
    {
        System.out.println("1st");
    }
}
public class Abstract_Method {
    public static void main(String[] args) {
//        HTML ob = new HTML();
//        ob.Developer();
//        Java obj = new Java();
//        obj.Developer();
        Programming ob = new Java();
        ob.Developer();
        ob.rank();
    }
}



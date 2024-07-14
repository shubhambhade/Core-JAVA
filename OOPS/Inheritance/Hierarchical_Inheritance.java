package oops.Inheritance;

class X
{
    void input()
    {
        System.out.println("java");
    }
}
class Y extends X
{
    void show()
    {
        System.out.println("Python");
    }
}
class Z extends X
{
   void  dis()
    {
        System.out.println("c++");
    }
}
public class Hierarchical_Inheritance extends X {
    public static void main(String[] args) {
        Y obj1 = new Y();
        obj1.input();
        obj1.show();
        Z obj2 = new Z();
        obj2.input();
        obj2.dis();
    }
}

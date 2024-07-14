
// sub class access the super class method
package oops.superkeyword;
class X
{
    void show()
    {
        System.out.println("super class");
    }
}
class Y extends X
{
    void show()
    {
        System.out.println("sub class");
        // access the method of super class with the help of super keyword.
        super.show();
    }
}
public class Super_Keyword_2 {
    public static void main(String[] args) {
        Y obj = new Y();
        obj.show();
    }
}


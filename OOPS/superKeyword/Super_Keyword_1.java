
// sub class access the variables of super class.
package oops.superkeyword;

class A
{
    int a = 10;
}
class B extends A
{
    int a = 20;
    void show()
    {
        System.out.println("a : "+a); // 20
        // we can access a = 10  variable value with the help of super keyword.
        System.out.println("a : "+super.a);
    }
}
public class Super_Keyword_1 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}

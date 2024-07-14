
// constructor
/*
output:
a : 12
sub class
 */
package oops.superkeyword;
class P
{
    P()
    {
        System.out.println("super class");
    }
//    P(int a)
//    {
//        System.out.println("a : "+a);
//    }
}
class Q extends P
{
    Q()
    {
//        super(12);
        System.out.println("sub class");
    }
}
public class Super_Keyword_3 {
    public static void main(String[] args) {
        Q obj = new Q();
    }
}


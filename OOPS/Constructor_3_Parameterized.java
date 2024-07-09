package oops;

class  C
{
    int x, y;
    C( int a, int b) // parameterized
    {
         x = a;
         y = b;
    }
    C(float a, String b)
    {
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
     public void dis()
    {
        System.out.println("x : "+x);
        System.out.println("y : "+y);
    }
}
public class Constructor_3_Parameterized {
    public static void main(String[] args) {
        C obj = new C(12 ,23);
        obj.dis();
        C obj1 = new C(12.34f ,"Sham");
    }
}

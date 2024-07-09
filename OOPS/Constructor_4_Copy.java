package oops;

class D
{
    int a;
    String b;
    D(int x , String y)
    {
//        a = 10;
//        b = "sham";
        a = x;
        b = y;
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
    D(D ref) // copy constructor
    {
        a = ref.a;
        b = ref.b;
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
}
public class Constructor_4_Copy {
    public static void main(String[] args) {
        D obj1 = new D(12 ,"sham");
        D obj2 = new D(obj1);
    }
}

package oops;

class F
{
    int a; double b; String c;
    F()
    {
        a = 100;
        b = 1234.345;
        c = "sham";
    }
    F(int x)
    {
        a = x;
    }
    F(double y , String name)
    {
        b = y;
        c = name;
    }
}
public class Constructor_6_Overloading {
    public static void main(String[] args) {
        F obj1 = new F();
        F obj2 = new F(12);
        F obj3 = new F(23.321, "sham");

        // display the values of constructor to another class with the help of object reference
        System.out.println(obj1.a +" "+obj1.b+" "+obj1.c);
        System.out.println(obj2.a);
        System.out.println(obj3.b +" "+obj3.c);
    }
}

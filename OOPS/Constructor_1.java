package oops;
 class A
{
    int a;
    String name;
    A()
    {
        a = 10;
        name = "Sham";
    }
    void show()
    {
        System.out.println("a : "+a);
        System.out.println("Name : "+name);
    }
}
public class Constructor_1 {
    public static void main(String[] args) {
        A obj = new A(); // A() --> constructor called self at object creation time.
        obj.show();
    }
}

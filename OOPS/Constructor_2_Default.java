package oops;
class B
{
    int a;
    String b;
    boolean c;
    B() //default
    {
        a = 12;
        b = "sham";
        c = false;
    }
    void display(){
    System.out.println("a : "+a);
    System.out.println("b : "+b);
    System.out.println("c : "+c);
}
}
public class Constructor_2_Default {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}

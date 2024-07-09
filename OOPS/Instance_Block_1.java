package oops;

class Instance
{
    int a,b;
    static void display()
    {
        System.out.println("java programming");
    }
    void show()
    {
        a = 50;
        b = 60;
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
    Instance()
    {
        a = 10;
        b = 20;
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
    // instance block
    {
        a = 30;
        b = 40;
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
}
public class Instance_Block_1 {
    public static void main(String[] args) {
        Instance.display();
        Instance obj = new Instance();
        obj.show();
    }
}

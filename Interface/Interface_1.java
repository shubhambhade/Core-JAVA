package Interface;
interface D
{
    void a1(); // public + abstract
    void a2(); // public + abstract

    default void a3()
    {
        System.out.println("may or may not override in subclasses");
    }
}
class  E implements D {
    @Override
    public  void a1()
    {
        System.out.println("class E method a1");
    }
    @Override
    public  void a2()
    {
        System.out.println("class E method a1");
    }
    @Override
    public void a3()
    {
        System.out.println("**************override***********");
    }
}
class  F implements D
{
    @Override
    public  void a1()
    {
        System.out.println("class F method a1");
    }
    @Override
    public  void a2()
    {
        System.out.println("class F method a1");
    }
}
class  G implements D
{
    @Override
    public  void a1()
    {
        System.out.println("class G method a1");
    }
    @Override
    public  void a2()
    {
        System.out.println("class G method a1");
    }
}
public class Interface_1 {
    public static void main(String[] args) {
        E ref = new E();
        ref.a1();
        ref.a1();
        ref.a3();
        F re = new F();
        re.a1();
        re.a2();
        re.a3();
        G r = new G();
        r.a1();
        r.a2();
        r.a3();
    }
}

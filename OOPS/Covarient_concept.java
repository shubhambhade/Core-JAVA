package oops;

class S
{
    S show()
    {
        System.out.println("class A");
        return new S();
    }
}
class T extends S
{

    @Override
    T show()
    {
        super.show();
        System.out.println("Class B");
        return this;
    }
}
public class Covarient_concept {
    public static void main(String[] args) {
        T obj = new T();
        obj.show();
    }
}

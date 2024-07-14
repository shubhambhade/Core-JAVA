package oops.AbstractClass;

abstract class _Animal
{
    // non-abstract method implement.
    _Animal()
    {
        System.out.println("All Animals________");
    }
    // abstract method cannot implement.
    public abstract void sound();
}
class _Dog extends _Animal
{
    _Dog()
    {
        super();
    }
    @Override
    public void sound()
    {
        System.out.println("Dog sound : Barking");
    }
}
class Lion extends _Animal
{
    Lion()
    {
        super();
    }
    @Override
    public void sound()
    {
        System.out.println("Lion sound : Roar");
    }
}
public class Abstract_Class_2 {
    public static void main(String[] args) {
        _Dog d = new _Dog();
        Lion l = new Lion();
        d.sound();
        l.sound();
    }
}

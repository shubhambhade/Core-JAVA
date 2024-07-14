package Interface;

interface P
{
    void show();
}
interface   Q
{
    void show();
}
interface R
{
    void display();
}
public class Multiple_Inheritance_1 implements P,Q , R {
    @Override
    public void show() {
        System.out.println("Interfaces P and Q ");
    }
    @Override
    public void display() {
        System.out.println("Interfaces R ");
    }

    public static void main(String[] args) {
        Multiple_Inheritance_1 ref = new Multiple_Inheritance_1();
        ref.show();
        ref.display();
    }
}

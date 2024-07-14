package oops.Polymorphism;

class Shape
{
    void draw()
    {
        System.out.println("Can,t say shape type");
    }
}
class Square extends Shape
{
//    @Override
    void draw()
    {
        super.draw();
        System.out.println("Square shape");
    }
}

public class Run_Time_Polymorphism_1 {
    public static void main(String[] args) {
        Shape obj = new Square();
        obj.draw();
    }
}

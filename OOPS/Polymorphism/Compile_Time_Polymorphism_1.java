
package oops.Polymorphism;

public class Compile_Time_Polymorphism_1 {
    int add ()
    {
        int a = 10;
        int b = 20;
        int c = a+b;
        return c;
    }
    void  add (int x , int y)
    {
        int c ;
        c = x+y;
        System.out.println("Addition : "+c);
    }
    void  add (double p , int q)
    {
        double c ;
        c = p +q;
        System.out.println("Addition : "+c);
    }

    public static void main(String[] args) {
        Compile_Time_Polymorphism_1 obj = new Compile_Time_Polymorphism_1();
         int add =obj.add();
        System.out.println("Addition : "+add);
        obj.add(12 ,34);
        obj.add(12.23 , 123);
    }
}

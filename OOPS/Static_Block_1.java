package oops;

class Static_Block
{
    {
        System.out.println("Python");
    }
    // static block
    static
    {
        System.out.println("java");
    }
    Static_Block()
    {
        System.out.println("c++");
    }
}
public class Static_Block_1 {
    public static void main(String[] args) {
        Static_Block obj = new Static_Block();
    }
}

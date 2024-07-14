package Interface;
interface U
{
    static void show()
    {
        System.out.println("Cannot override interface static method .");
    }
}
public class Interface_2 {
    public static void main(String[] args) {
        U.show();
    }
}

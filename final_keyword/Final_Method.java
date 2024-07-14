package final_keyword;
class Final
{
    void myNumber()
    {
        System.out.println("2334543675");
    }
   final void atmPin()
    {
        System.out.println("afsgr");
    }
}
class Raj extends Final
{
    @Override
    void myNumber()
    {
        System.out.println("2334543675");
    }
}
public class Final_Method {
    public static void main(String[] args) {
        Raj obj = new Raj();
        obj.myNumber();
        obj.atmPin();
    }
}

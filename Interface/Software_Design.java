package Interface;
interface Requirement
{
    void web_design();
    void web_developer();
}
abstract class Developer1 implements Requirement
{
    @Override
    public void web_design()
    {
        System.out.println("Green , top menu , three dot button");
    }
}
class Developer2 extends Developer1
{
    @Override
    public void web_developer()
    {
        System.out.println("HTML , CSS , Javascript");
    }
}
public class Software_Design {
    public static void main(String[] args) {
        Developer2 ref = new Developer2();
        ref.web_design();
        ref.web_developer();
    }
}

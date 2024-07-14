package Interface;
import java.util.Scanner;
public interface Client {
    // we cannot anything implement in interface.
    void input();
    void output();
}
class A implements Client
{
    Scanner sc = new Scanner(System.in);
    String name;
    double salary;
    @Override
    public void input()
    {
        System.out.println("Enter your name : ");
        name = sc.nextLine();
        System.out.println("Enter your salary : ");
        salary = sc.nextDouble();
    }
    @Override
    public void output() {
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
    }
}
class Test
{
    public static void main(String[] args) {
        Client ref = new A();
        ref.input();
        ref.output();
    }
}

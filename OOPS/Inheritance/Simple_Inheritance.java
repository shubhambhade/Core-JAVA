package oops.Inheritance;
import  java.util.Scanner;

class Student
{
    Scanner sc = new Scanner(System.in);
    int roll_no , marks;
    String name;
    void input()
    {
        System.out.println("Enter Name : ");
        name = sc.nextLine();
        System.out.println("Enter Roll No : ");
        roll_no = sc.nextInt();
        System.out.println("Enter Marks : ");
        marks = sc.nextInt();
    }
}
class Ankit extends Student
{
    void display()
    {
        System.out.println("Student Name : "+name);
        System.out.println("Student Roll No : "+roll_no);
        System.out.println("Student Marks : "+marks);
    }
    public static void main(String[] args) {
        Ankit obj = new Ankit();
        obj.input();
        obj.display();
    }
}
//public class Simple_Inheritance {
//    public static void main(String[] args) {
//        Ankit obj = new Ankit();
//        obj.input();
//        obj.display();
//    }
//}

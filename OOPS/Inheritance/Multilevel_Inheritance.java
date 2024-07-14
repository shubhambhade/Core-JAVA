package oops.Inheritance;

import java.util.Scanner;

class A
{
    Scanner sc = new Scanner(System.in);
    int num1, num2 ;
    void input()
    {
        System.out.println("Enter number 1st : ");
        num1 = sc.nextInt();
        System.out.println("Enter number 2nd : ");
        num2 = sc.nextInt();
    }
    void addition()
    {
        int sum = num1 + num2;
        System.out.println("Sum : "+sum);
    }
    void subtraction_of_2_numbers()
    {
        int subtraction = num1 - num2;
        System.out.println("Subtraction : "+subtraction);
    }
}
class B extends A
{
    void multiplication()
    {
       int  mul = num1 * num2;
        System.out.println("Multiplication : "+mul);
    }
    void division()
    {
        int div = num1 / num2;
        System.out.println("Division : "+div);
    }
}
class C extends B
{
    void remainder()
    {
        int remain = num1 % num2;
        System.out.println("Remainder : "+remain);
    }
}
public class Multilevel_Inheritance extends C {
    public static void main(String[] args) {
        C obj = new C();
        obj.input();
        obj.addition();
        obj.subtraction_of_2_numbers();
        obj.multiplication();
        obj.division();
        obj.remainder();
    }
}

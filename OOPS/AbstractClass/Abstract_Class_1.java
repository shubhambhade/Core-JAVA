package oops.AbstractClass;

abstract  class Animal
{

}
class Dog extends Animal
{

}
public class Abstract_Class_1 {
    public static void main(String[] args) {
        //    animal obj = new animal();
        //    -->we cannot create object of abstract class.
        Animal ref = new Dog(); // we can create reference for abstract class.
    }
}

package GenericsAndWrapperClasses;

public class Wrapper_Class {
    public static void main(String[] args) {

        //autoboxing

        Integer obj = new Integer(12);
        Integer obj1 = Integer.valueOf("13");
        Integer obj2 = 15;
        System.out.println(obj1);
        System.out.println(obj2);

        // unboxing

        int age = obj;
        System.out.println(age);
    }
}

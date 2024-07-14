package array;
import  java.util.Arrays;
public class ArraysCompare {
    void compare_2_array(){
        int a[] = {10,20,30};
        int b[] = {10,20,30};
        // == check the only reference variable .it cannot be check the values.
        // Ans -> Both are not equal.
        if(a==b)
        {
            System.out.println("Both are equal");
        }
        else {
            System.out.println("Both are not equal");
        }

        // equals(parameter1 , parameter2)
        // equals are static method of Arrays class .
        // it cannot check the reference variable. it only check the values or data.
        // Ans --> Both are equal
        if(Arrays.equals(a ,b))
        {
            System.out.println("Both are equal");
        }
        else {
            System.out.println("Both are not equal");
        }

    }
    public static void main(String[] args) {
        ArraysCompare obj = new ArraysCompare();
        obj.compare_2_array();
    }
}

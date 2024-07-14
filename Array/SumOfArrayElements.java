/*
calculate sum of array element.
 */
package array;
import java.util.Scanner;

public class SumOfArrayElements {
    Scanner sc = new Scanner(System.in);
    void sum_Of_Array_Element(){
        int size , i , sum=0;
        System.out.println("Enter size of array : ");
        size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter element in array : ");
        for( i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Array : ");
        for ( i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
            sum = sum + a[i];
        }
        System.out.println("\nSum of array : "+sum);
        System.out.println("Average of array elements : "+(sum/a.length));
    }
    public static void main(String[] args) {
        SumOfArrayElements obj = new SumOfArrayElements();
        obj.sum_Of_Array_Element();
    }
}

/*
print the array element in reversed order.
 */
package array;
import  java.util.Arrays;
import  java.util.Scanner;
public class ReversedArray {
    Scanner sc = new Scanner(System.in);
    void reversedArray()
    {
        int size , i;
        System.out.println("Enter size of array : ");
        size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter element in array : ");
        for( i=0; i<a.length; i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.print("user enter array : ");
        for ( i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("\nReversed order array : ");
        for ( i=a.length-1; i >=0; i--){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        ReversedArray obj = new ReversedArray();
        obj.reversedArray();
    }
}

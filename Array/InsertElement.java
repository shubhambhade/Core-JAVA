/*
insert element in array.
 */
package array;
import java.util.Scanner;
public class InsertElement {
    Scanner sc = new Scanner(System.in);
    void insertion_Of_Array(){
        int size, i , location, item;
        System.out.println("Enter size of array : ");
        size = sc.nextInt();
        int a[] = new  int[size +1];
        System.out.println("Enter element in array : ");
        for( i=0; i<size; i++){
            a[i]= sc.nextInt();
        }
        System.out.println("Array : ");
        for( i=0; i<size; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\nEnter Array Location : ");
        location = sc.nextInt();
        System.out.println("Enter new item : ");
        item = sc.nextInt();

        // make the place empty particular position.
        for( i= size; i>location; i--){
            a[i] = a[i - 1];
        }
        a[location] = item;
        size++;
        for ( i = 0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        InsertElement obj = new InsertElement();
        obj.insertion_Of_Array();
    }
}

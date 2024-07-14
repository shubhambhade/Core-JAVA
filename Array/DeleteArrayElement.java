/*
delete the array element .
a[3] = 1 2 3
loc = 1
a[3-1] = 1 3
 */
package array;
import java.util.Scanner;
public class DeleteArrayElement {
    Scanner sc = new Scanner(System.in);
    void delete_Array_Element(){
            int size, i , location , item;
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
            System.out.println("\nEnter which you want to delete Array element Location : ");
            location = sc.nextInt();
            System.out.println("Enter item  : ");
            item = sc.nextInt();
            for( i= location; i<size-1; i++){
                a[i] = a[i + 1];
             }
             size--;
        System.out.println("Array after the delete operation perform : ");
             for ( i = 0; i<size; i++)
             {
                System.out.print(a[i]+" ");
            }

        }
    public static void main(String[] args) {
        DeleteArrayElement obj = new DeleteArrayElement();
        obj.delete_Array_Element();
    }
}

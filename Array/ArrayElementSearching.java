/*
Searching element in array.
 */
package array;
import java.util.Scanner;

public class ArrayElementSearching {
    Scanner sc = new Scanner(System.in);
    void searchElement(){
        int size , i , n ,counter =0;
        System.out.println("Enter size of array : ");
        size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter element in array : ");
        for( i =0; i<size; i++){
            a[i] = sc.nextInt();
        }
        System.out.print(" Array Element : ");
        for( i =0; i<size; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("Search element in array : ");
        n = sc.nextInt();
        for( i =0; i<a.length; i++){
            if(a[i]== n)
            {
                counter++;
            }
        }
        if(counter>0)
            System.out.println("\nItem found "+i+" Position");
        else
            System.out.println("item not found");
    }
    public static void main(String[] args) {
        ArrayElementSearching obj = new ArrayElementSearching();
        obj.searchElement();
    }
}

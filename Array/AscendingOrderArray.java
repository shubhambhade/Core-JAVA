
/*
sorting array ascending or descending order.
 */
package array;
import java.util.Scanner;

public class AscendingOrderArray {
    Scanner sc = new Scanner(System.in);
    void array_sorting_ascending_order(){
        int size , i;
        System.out.println("Enter size of array : ");
        size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter element in array : ");
        for ( i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Array : ");
        for ( i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }

        //Print array in Ascending order
        for( i= 0 ; i<a.length; i++){
            for(int j =i+1; j<a.length; j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("\nAscending order sorted array : ");
        for ( i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }

        //Print array in descending order
        for( i= 0 ; i<a.length; i++){
            for(int j =i+1; j<a.length; j++){
                if(a[i]<a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("\nDescending order sorted array : ");
        for ( i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }

    }
    public static void main(String[] args) {
        AscendingOrderArray obj = new AscendingOrderArray();
        obj.array_sorting_ascending_order();
    }
}

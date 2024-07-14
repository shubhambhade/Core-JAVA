
/*
copy the 1 array to another array.
 */
package array;
import java.util.Scanner;

public class CopyArray {
    Scanner sc = new Scanner(System.in);
    void array_CopyTo_Another_Array(){
        int size;
        System.out.println("Enter size of array : ");
        size = sc.nextInt();
        String a[] = new String[size];
        String b[] = new  String[size];
        System.out.println("Enter element : ");
        for(int i=0; i<a.length; i++)
        {
            a[i]= sc.nextLine();
        }
        //print array
        System.out.print("Array 1st : ");
        for(int i=0; i<size; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.print("\nCopy array 1st to B array : ");
        for(int i=0; i<size; i++)
        {
            b[i] = a[i];
            System.out.print(b[i]+" ");
        }
    }
    public static void main(String[] args) {
        CopyArray obj = new CopyArray();
        obj.array_CopyTo_Another_Array();
    }
}

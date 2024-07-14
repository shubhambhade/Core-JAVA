package array;
import java.util.Scanner;
public class FindBigAndSmallElementI_In_Array {
    Scanner sc = new Scanner(System.in);
    void big_And_Small_Element(){
        int size , i ,max;
        System.out.print("Enter size of array : ");
        size =sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter element in array : ");
        for ( i =0; i<a.length; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("Array : ");
        for ( i =0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        max =a[0];
        for (i=1; i<a.length; i++){
            if(a[i]>max)
            {
                max =a[i];
            }
        }
        System.out.println("\nBiggest Element in array : "+max);
        int min =a[0];
        for (i=1; i<a.length; i++){
            if(a[i]<min)
            {
                min =a[i];
            }
        }
        System.out.println("\nSmallest Element in array : "+min);
    }
    public static void main(String[] args) {
        FindBigAndSmallElementI_In_Array obj = new FindBigAndSmallElementI_In_Array();
        obj.big_And_Small_Element();
    }
}

package array;
import java.util.Scanner;
public class Arrays_3 {
    public static void main(String[] args) {
        int size , i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter element :");
        for( i=0 ; i<size; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("printed array element ");
        for( i=0 ; i<size; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}

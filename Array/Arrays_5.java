package array;
import java.util.Scanner;
import java.util.Arrays;
public class Arrays_5 {
    Scanner sc = new Scanner(System.in);
    void array_sort_method(){
        int size , i ;
        System.out.println("Enter size of array : ");
        size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter element : ");
        for( i=0; i<size; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        // sort() method
        for( i=0; i<size; i++){
            System.out.print(a[i]+" ");
        }
    }
    void equals_method()
    {
        int size , i;
        System.out.println("Enter size of array1 : ");
        size = sc.nextInt();
        int a1[] = new int[size];
        System.out.println("Enter element : ");
        for( i=0; i<a1.length; i++){
            a1[i] = sc.nextByte();
        }
        System.out.println("\nEnter size of array2 : ");
       int size1 = sc.nextInt();
        int a2[] = new int[size1];
        System.out.println("Enter element : ");
        for( i=0; i<a2.length; i++){
            a2[i] = sc.nextInt();
        }
        // print array1
        for( i=0; i<a1.length; i++){
            System.out.print(a1[i]+" ");
        }
        System.out.println("\n");
        // print array2
        for( i=0; i<a2.length; i++){
            System.out.print(a2[i]+" ");
        }
        boolean b = Arrays.equals(a1,a2);
        System.out.println("\nArrays are equal : "+b);
    }
    void copyOf_method(){
        int size2 , i ;
        System.out.println("Enter size of array : ");
        size2 = sc.nextInt();
        int a3[] = new int[size2];
        System.out.println("Enter element : ");
        for( i=0; i<size2; i++){
            a3[i] = sc.nextInt();
        }
        for( i=0; i<size2; i++){
            System.out.print(a3[i]+" ");
        }
        int a4[] = Arrays.copyOf(a3,size2);
        System.out.println("\ncopy the array3 data into array4");
        for( i=0; i<size2; i++){
            System.out.print(a4[i]+" ");
        }
    }
    public static void main(String[] args) {
       Arrays_5 obj = new Arrays_5();
//        obj.array_sort_method();
//        obj.equals_method();
//        obj.copyOf_method();

    }
}

/*
created 2d array and taking input to user.
 */
package array;
import java.util.Scanner;
public class Arrays_2D {
    void  array_2d(){
        Scanner sc = new Scanner(System.in);
        int i , j , row_count , column_count;
        System.out.println("Enter row count : ");
        row_count = sc.nextInt();
        System.out.println("Enter column count : ");
        column_count = sc.nextInt();
        int a[][] = new int[row_count][column_count];
        System.out.println("Enter element in array : ");
        for ( i=0 ; i<row_count; i++)
        {
            for ( j = 0; j<column_count; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("Matrix : \n");
        for ( i=0 ; i<row_count; i++)
        {
            for ( j = 0; j<column_count; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }

    }
    public static void main(String[] args) {
        Arrays_2D obj =new Arrays_2D();
        obj.array_2d();
    }
}

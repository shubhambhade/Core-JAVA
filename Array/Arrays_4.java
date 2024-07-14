package array;
import java.util.Arrays;
public class Arrays_4 {
    void arrays_Methods() {
        String[] a = {"math", "biology", "physics", "english"};
        // toString method accept the array variable as parameter.
        System.out.println("toStrong() Method : " + Arrays.toString(a));
        //
        System.out.println("asList() Method : " + Arrays.asList(a));
        // deepToString method accept the multidimensional array variable as parameter.
        int[][] b = {{10, 20}, {30, 40}};
        System.out.println("deepToStrong() Method : " + Arrays.deepToString(b));
    }
    public static void main(String[] args) {
        Arrays_4 obj = new Arrays_4();
        obj.arrays_Methods();
    }
}

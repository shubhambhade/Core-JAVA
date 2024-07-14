package final_keyword;

public class Final_Variable {
    public static void main(String[] args) {
        final  int A = 10;
        System.out.println("A : "+A);
//        A = 20; --> it gives error.we cannot reassign value to A because A declare as final.
    }
}

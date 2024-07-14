
package oops.ThisKeyword;

public class This_Keyword_1 {
    void show()
    {
        System.out.println("This keyword ID : "+this);
    }
    public static void main(String[] args) {
        This_Keyword_1 r = new This_Keyword_1();
        System.out.println("Class Unique ID : "+r);
        r.show();
    }
}

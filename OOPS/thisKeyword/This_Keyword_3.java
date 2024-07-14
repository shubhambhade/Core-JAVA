
package oops.ThisKeyword;

public class This_Keyword_3 {
    This_Keyword_3()
    {
        System.out.println("java");
    }
    This_Keyword_3(int a)
    {
        this();
        System.out.println("a : "+a);
    }

    public static void main(String[] args) {
        This_Keyword_3 obj = new This_Keyword_3(100);
    }
}
/*
java
a : 100
 */
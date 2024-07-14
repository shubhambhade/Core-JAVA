
package oops.ThisKeyword;

public class This_Keyword_4 {
    This_Keyword_4()
    {
        this(100);
        System.out.println("java");
    }
    This_Keyword_4(int a)
    {
        System.out.println("a : "+a);
    }

    public static void main(String[] args) {
        This_Keyword_4 obj = new This_Keyword_4();
    }
}
/*
java
a : 100
 */
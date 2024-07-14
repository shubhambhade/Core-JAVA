package oops.ThisKeyword;

public class This_Keyword_2 {
    int a;  // instance variable
    This_Keyword_2(int a){
        this.a = a;
    }
    void show()
    {
        System.out.println("a : "+a);
    }

    public static void main(String[] args) {
        This_Keyword_2 r = new This_Keyword_2(100);
        r.show();
    }
}
/*
not use this a = 0 (default value of a)
use this a = 100
 */

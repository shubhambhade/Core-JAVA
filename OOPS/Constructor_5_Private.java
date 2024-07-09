package oops;

class E
{
    int a ;
    double b;
    String c;
    private E()
    {
        a = 10;
        b = 13.24;
        c ="sham";
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
    }

    public static void main(String[] args) {
        E obj = new E();
    }
}
class Constructor_5_Private {
}

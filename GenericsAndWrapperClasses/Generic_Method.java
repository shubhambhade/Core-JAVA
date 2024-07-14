package GenericsAndWrapperClasses;

public class Generic_Method {
    static <E> void printData(E data){
        System.out.println(data);
    }
    <E extends Number> void doubleData(E data)
    {
        System.out.println(data);
    }
    public static void main(String[] args) {
        printData("hello");
        printData(1234);
        printData(false);
        Generic_Method obj = new Generic_Method();
        obj.doubleData(1324.3563);
    }
}

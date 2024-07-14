
package oops.Encapsulation;
class  Encapsulation
{
    private int value; // data hiding
    public void setValue(int x)
    {
        value = x;
    }
    // data abstraction
    public int getValue()
    {
        return value;
//        return ++value; // update the value
    }
}
public class Encapsulation_1 {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setValue(100);
        System.out.println("value : "+obj.getValue());
    }
}

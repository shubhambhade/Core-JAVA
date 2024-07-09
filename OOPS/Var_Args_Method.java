package oops;

class Calculation
{
    int sum =0;
    void addition(int ... a)
    {
        for(int i : a)
        {
            sum = sum +i;
        }
        System.out.println("sum of numbers "+sum);
    }

}
public class Var_Args_Method {
    public static void main(String[] args) {
        Calculation obj = new Calculation();
//        obj.addition();
        obj.addition(10,20,30);
    }
}

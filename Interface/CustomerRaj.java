package Interface;

public interface CustomerRaj
{
    int amt = 5; // public + static + final
    void purchased(); // public + abstract
}
class SellerSham implements CustomerRaj
{
    @Override
    public  void purchased()
    {
        System.out.println("Raj needs "+ amt + "kg rice");
    }
}
class check
{
    public static void main(String[] args) {
        CustomerRaj ref = new SellerSham();
        ref.purchased();
        System.out.println("amt variable does not depend on any class object because it is static : "+CustomerRaj.amt);
    }
}

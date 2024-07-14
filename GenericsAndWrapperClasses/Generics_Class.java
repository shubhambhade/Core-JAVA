package GenericsAndWrapperClasses;

class  Dog<E , V>
{
    E id;
    V name;
    public Dog( E id , V name)
    {
        this.id = id;
        this.name = name;
        System.out.println(id +" "+name);
    }

}
public class Generics_Class {
    public static void main(String[] args) {
        Dog<String , String> d1 = new Dog("13245", "sham");
        Dog<Integer, String> d2 = new Dog(2314, "ram");
    }
}


package CollectionFrameworks.Set;
import java.util.*;

class  Student{
    int roll_no;
    String name;
    Student(int roll_no, String name)
    {
        this.roll_no=roll_no;
        this.name=name;
    }

    enum Color
    {
        red,green,orange
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll_no == student.roll_no;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(roll_no);
    }

    @Override
    public String toString(){
        return "Student{"+
                "roll_no = "+roll_no+
                "name = "+name+'\''+'}';
    }
}
public class Hash_set {
    public static void main(String[] args) {

//        EnumSet<Color> enumset = EnumSet.allOf(Color.class);

        Set<Student> s = new HashSet<>();

       Student s1 =new Student(1,"anuj");
       Student s2 =new Student(1,"anuj");

        System.out.println(s1.equals(s2));


        s.add(new Student(1,"anuj"));
        s.add(new Student(1,"anuj"));
        s.add(new Student(1,"anuj"));
        System.out.println(s);

//       Set<Integer> set = new HashSet<>(); // O(1)
//        Set<Integer> set = new LinkedHashSet<>(); //O(n)
        Set<Integer> set = new TreeSet<>(); //O(log n) -->BST
        set.add(90);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(20);
        set.add(10);
        System.out.println(set);
        set.remove(10);
        System.out.println(set);
    }
}

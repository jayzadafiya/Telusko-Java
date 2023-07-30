import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// set take only uniqe value

public class set1 {
    public static void main (String[] args) {

   // Set<Integer> value = new HashSet<Integer>();
    Set<Integer> value = new TreeSet<Integer>();// get output in sorting way

    System.out.println(value.add(10));
    System.out.println(value.add(4));
    System.out.println(value.add(4));
    System.out.println(value.add(5));
    System.out.println(value.add(9));

    for (Integer i : value)
    {
        System.out.println(i);
    }

    }
}

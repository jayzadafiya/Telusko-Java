import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator1 {
    public static void main(String[] args) {
        List<Integer> value = new ArrayList<Integer>(); // from right side it is not compulsory to write <Integer>

        value.add(400);
        value.add(901);
        value.add(502);
        value.add(603);

        value.add(1, 209);

        // here comparator is interface type THATS WHY WE HAVE TO MADE NEW CLASS OBJECT
        Comparator<Integer> c = new Comparator<Integer>() {  
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10)// sorting for last digit of number
                {
                    return 1;
                } else {
                    return -1;
                }
                // return i%10>j%10 ?1:-1;
            }

            // Comparator<Integer> c = (i,j) -> i%10>j%10 ?1:-1;

        };

        Collections.sort(value, c); // collections is class and sort is static method
        for (Integer o : value) {
            System.out.println(o);

        }

    }
}

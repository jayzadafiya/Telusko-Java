import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generics_list {
    public static void main(String[] args) {
        List <Integer>value = new ArrayList<Integer>(); // from right side it is not compulsory to write <Integer> 

        value.add(4); 
        value.add(9); 
        value.add(5);
        value.add(6);

        value.add(1, 2);

        Collections.sort(value); // collections is class and sort is static method 
        for (Integer o : value) {
            System.out.println(o);
            
        }
        Collections.reverse(value);
        Collections.shuffle(value);//  it give output in rendom formet
        for (Integer o : value) {
            System.out.println(o);
            
        }
    }
}

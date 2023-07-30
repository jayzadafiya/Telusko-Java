import java.util.ArrayList;
import java.util.List;

public class List1 {
    public static void main(String[] args) {
        List value = new ArrayList(); // list is subclass of collection thats whywe can use method of collection

        value.add(4);// here method add is teck input as objec
        value.add(5);// here Integer v = new Integer(5)
        value.add(6);
        value.add("sad");
        value.add(0, 2);

        System.out.println(value);

        for (int i = 0; i < value.size(); i++) {
            System.out.println(value.get(i));

        }

        for(Object o : value) {
        System.out.println(o);

        }

    }
}

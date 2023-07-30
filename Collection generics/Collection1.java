// if we have to add any data at any index in collectton then it is not possible thats why we are use list arry
// throw the list array we can add any data at any index  value
// throw the hashset we can display the data but data output is come in defferent sequence
// in tree set  give output in sorting formate
// in list dublicate value have different indext value
// in map every value have key

// boolean contain (object o) it is check given object value is in array list or not
// objecct[] toarray() it can conver collection into array
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection1
{
    public static void main(String[] args){
        Collection value = new ArrayList(); // here in inteface collection has arraylist class .with use of it we are made object

        value.add(4);
        value.add(5);
        value.add(6);
        value.add("sad");

        System.out.println(value);

        Iterator it = value.iterator(); // method iterator and interface is Iterator

        while (it.hasNext()) // has next is verify next element
        {
        System.out.println(it.next());// goto next element and return it

            
        }

        
    }
}


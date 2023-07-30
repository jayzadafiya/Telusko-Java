// we can not repeat key

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Map1 {
    public static void main(String[] args) {

        // Map<String, String> m = new HashMap<String, String>();
        Map<String, String> m = new Hashtable<String, String>();// it is synchronized
        

        m.put("name", "jay");
        m.put("bro","d");
        m.put("bro", "dhruv");


        System.out.println(m);
        System.out.println(m.get("name"));

        Set<String> set = m.keySet();

        for (String s : set)// it is give set of key
        {
            System.out.println(s+"  "+m.get(s));

        }
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comparable1 {
    public static void main(String[] args) {
        List<stud> s = new ArrayList<stud>();
        s.add(new stud(2, "dhruv")); // here add recive object that why we have to write new stud value
        s.add(new stud (1, "jay"));
        s.add(new stud (3, "div"));

        Collections.sort(s);

        for(stud sd:s)
        {
            System.out.println(sd);
        }

    }
}

class stud implements Comparable<stud> {
    int id;
    String name;
    public stud(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "stud [id=" + id + ", name=" + name + "]";
    }
    public int compareTo(stud s) {
        // return id>s.id?1:-1;
        return name.length()>s.name.length()?1:-1;
    }
}

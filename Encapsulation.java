// encapsulation is binding dat5a with method

// package encapsulation ;

public class Encapsulation {
    public static void main(String[] args) {

        Emp e = new Emp();
        e.setId(1);
        System.out.println(e.getId());

        e.setName("jay");
        System.out.println(e.getName());

    }

 public void Dowork(){
     System.out.println("it  gggg is in wapper file");
 }

}

class Emp {
    private int id;
   protected String name;
    public int getId() {


        System.out.println("User is change ID");
        return id;
    }

    public void setId(int id) {
        System.out.println("User add ID input");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
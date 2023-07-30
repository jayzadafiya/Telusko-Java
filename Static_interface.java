public class Static_interface {
    public static void main(String[] args) {

        demo.show1();

    }
}

interface demo {
    int n = 0;  // here n is constant because here final is defualt set

    void show();

    static void show1()
    {
         System.out.println("this is staric interface method");
    }
}

class demointer implements demo {
    public void show() {

    }
}
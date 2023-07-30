public class default1 {
    public static void main(String[] args) {
        Demo b = new demoinfo();
        b.show();
        b.abc();
    }
}

interface Demo {
    void abc();

    default void show() {
        System.out.println(" this is domp method");
    }
}

interface mydemo {
    default void show() {
        System.out.println("this is  mydemo method");
    }
 }
class demoinfo implements mydemo ,  Demo {

    public void abc() {  // here we have to define iterface method which we only declred in interface
        System.out.println("this is a method");

    }

    public void show() {
        System.out.println("this is show method");
        Demo.super.show();
        mydemo.super.show();
    }

}

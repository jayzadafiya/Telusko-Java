/*
member class
inner class
anonymus class
*/
class Outer {
    public void show() {

        // System.out.println("outer class");
    }

    class Inner1 {
        public void display() {
            System.out.println("innner class");
        }
    }

    static class Inner2 {
        public void display() {
            System.out.println("member class");
        }
    }
}

class a {
    void show() {
        System.out.println("Anonyomus class");
    }
}

public class Inner {
    public static void main(String[] args) {
        Outer o1 = new Outer();
        o1.show();

        Outer.Inner1 i1 = o1.new Inner1();
        i1.display();
        // Outer.Inner2 i2 = o1.new Inner2();
        Outer.Inner2 i2 = new Outer.Inner2(); // here inter class is static that's why we can write outer.inner

        i2.display();

        a obj = new a() {
            void show() {
                System.out.println("here we are creat anonymus class");
            }
        };
        obj.show();
    }

}

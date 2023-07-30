public class Super {

    public static void main(String[] args) {
        // B b1= new B(); // it is called both default suber class and sub class
        // B b1 = new B(5); // without super// it is called int sub class and default
        // super class
        // B b1 = new B(5);  // it is called both int suber class and sub class
        B b1= new B(5);
    }

}

class A {
    public A() {
        System.out.println("a in");
    }

    public A(int i) {
        System.out.println("a in int");
    }
    void show() {
        System.out.println("a in show");
    }
}

class B extends A {
    public B() {
        super();  // if im write here super(5) then itcan give int super class
        System.out.println("b in");
    }

    public B(int i) {
        super(i);
        super.show(); // here super is work like this . super is use to called superclass method
       
        System.out.println("b in int");
    }
}
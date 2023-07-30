public class Overriding {

    public static void main(String[] args) {

        A b1 = new B(); // run time polimorphism
        b1.show(); // here you only write only those method which are in class A because here b1 is
                   // object of class A

    }

}

class A {
    void show() {
        System.out.println("a in show");
    }

}

class B extends A {
    @Override // it can help to read a method name is correct or not is it is incorrect it can
              // shoe error before compiler
    // @FunctionalInterface // it use to mange singe initerface
    void show() {

        super.show(); // here super is work like this . super is use to called superclass method

        System.out.println("b in");
    }

}
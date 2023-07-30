public class Abstrecut1 {
    public static void main(String[] args) {

        kit k = new kit();
        writer p = new pen();
        writer pc = new pencil(); // here we a use writer as reffence and creat object use class

        k.write(p);
        k.write(pc);

    }
}

class pen extends writer {

    public void write() {
        System.out.println("i is pen");
    }
}

class pencil extends writer {

    public void write() {
        System.out.println("i is pencil");
    }
}

class kit {

    void write(writer p) {
        p.write();
    }
}

abstract class writer { // here method is abstract thats whay we have to creal abstract class

    public abstract void write(); // here we only declare method
}

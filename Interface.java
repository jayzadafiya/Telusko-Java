// we can not extends 2 class to any sub class that why we have to apply inrfaces
/*
marker interface = interface with 0 methods or interfaces without methods
single abstract method/ functionl interfaces  = interfaces which have only one method 
normar = interfaces which have more than one interfaces
*/

public class Interface {
    public static void main(String[] args) {

        kit k = new kit();
        writer p = new pen();
        writer pc = new pencil(); // here we a=use write as reffence and creat object use class

        k.write(p);
        k.write(pc);

        abc a = new abc()   {
            void show() {
                System.out.println("here we are creat anonymus class");
            }
        };
        a.show();; 
    

    }
}

class pen extends abc implements writer {

    public void write() {
        System.out.println("i is pen");
    }
}

class pencil implements writer {

    public void write() {
        System.out.println("i is pencil");
    }
}

class kit {

    void write(writer p) {
        p.write();
    }
}

interface writer {

    void write();

    // in interface you can not define methods .
    // you only can declare methods in interface
    // and you have not neet to write public abstract because its already implement
    // there
}

class abc {
    void show(){

    }
}

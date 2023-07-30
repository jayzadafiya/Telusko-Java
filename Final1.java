public class Final1 {

    final int i = 0; // it is costent

    public static void main(String[] args) {

        bb b = new bb();
        b.show();
        b.show1();

        // aa a = new aa();
        // a.show();
    }
}

class aa { // if class is final class then it can not become aa super class
    public final void show() { // u can not write same name of method in chail class
        System.out.println("it is in  A");
    }

}

class bb extends aa {
    public void show1() {
        System.out.println("it is in B");
    }
}

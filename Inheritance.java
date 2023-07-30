public class Inheritance {

    public static void main(String[] args) {

        calc c2 = new calc(15, 15);
        c2.sub(5, 5);
        AdvCalc c1 = new AdvCalc(5, 5);
        c1.sub(10, 5);
        c1.div(6, 2);
    }
}

class calc { // super ,parent, base class
    public calc(int x, int y) {
        int a = x + y;
        System.out.println("Sum =" + a);
    }

    public void sub(int x, int y) {
        int a = x - y;
        System.out.println("Sub =" + a);
    }
}

class AdvCalc extends calc { // sub , chaid , derived
    public AdvCalc(int x, int y) {
        super(x, y); // it is to be called super class
    }

    void div(int x, int y) {
        int a = x / y;
        System.out.println("Div =" + a);

    }
}

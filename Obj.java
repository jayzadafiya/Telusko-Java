class Calc {
    int num1;
    int num2;
    String operations;
    int result;

    public Calc() {   //constructors
        num1 = 0;
        num2 = 0;
        operations = "nothing";

    }

    public Calc(int num1) {
        this.num1 = num1;
        this.num2 = 0;
        operations = "nothing";
    }

    public Calc(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        operations = "nothing";
    }


    public void add(int num1, int num2) { //method|function
        result=num1 + num2;

    }


}

public class Obj {
    public static void main(String [] args) {

       Calc ob = new Calc();
       // Calc ob = new Calc(5);
        //Calc ob = new Calc(5,8);

        System.out.println(ob.num1);
        System.out.println(ob.num2);
        System.out.println(ob.operations);

        ob.add(4,5);
        System.out.println(ob.result);



    }
}

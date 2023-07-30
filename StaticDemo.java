class Emp {
    int id;
    static String ceo;


    static
    {
        ceo="static block";
    }

    public Emp()
    {
            id=0;
    }

    public void show()
    {
    System.out.println(id+":"+ceo);

    }

}

public class StaticDemo {

    public static void main(String[] args) {
        Emp jay = new Emp();
        jay.id = 1;
        //jay.ceo = "jay";
        Emp.ceo = "jay1";

        Emp dhruv = new Emp();
        dhruv.id = 2;
       // dhruv.ceo = "dhruv";
       // Emp.ceo = "jay"; // as result we get ceo name as jay because here we are mention class emp ceo as jay and ceo is static variable

        Emp jj=new Emp(); // here is show default value of id from public Emp and ceo name from static block

        jay.show();
        dhruv.show();
        jj.show();

    }

}

// if jayceo,dhruvceo,empceo any of this one is on then we get output of any one ceo name not as stacit block name 
//if all are off then we get defult ceo name form static block
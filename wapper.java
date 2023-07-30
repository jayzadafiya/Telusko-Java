
public class wapper {
    public static void main(String[] args) {
        Encapsulation b = new Encapsulation();
        b.Dowork();

        int i =5;  // primitive data type
        Integer ii = new Integer(5); // boxing - wrapping

        int j =ii.intValue();  // un boxing

        Integer value= i;  // auto boxing
        int k = value ;  // auto unboxing type
        String s = "123";

        int n =Integer.parseInt(s);

        System.out.println(n);


        System.out.println(i);
        System.out.println(ii);
        System.out.println(j);
        System.out.println(value);
        System.out.println(k);
    

        



    }
}

public class if_else {
    public static void main(String[] args) {
        Integer x1=200, x2=200;
        //int x2==200 or x1 we get output as same because at that time we aredoing boxing and unboxing
        //here both are refference object of integer and borth are different object
        if(x1==x2) {
            System.out.println("same");

        }
        else {
            System.out.println("not same");
        }
    }
}

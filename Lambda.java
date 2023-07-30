//-> it is sing of lambda expresion 

public class Lambda {
    public static void main(String[] args) {
        a obj = () -> System.out.println("lambda expresion ");
        obj.show();
    }
}

interface a {
    void show();
}
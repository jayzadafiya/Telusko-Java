import java.util.Scanner;

public class Operator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value of A  ");
        int a = sc.nextInt();
        System.out.println("Enter a value of B  ");
        int b = sc.nextInt();

        int sum = a + b;
        double div = (double) a / b;
        System.out.println("Sum = " + sum);
        System.out.println("Div = " + div);

    }
}
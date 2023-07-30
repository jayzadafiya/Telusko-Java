import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a length of array");
        int n = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a value of array " + i + " = ");
            a[i] = sc.nextInt();
        }

        /*
         * int a[] = new int[4];
         * a[0] = 1;
         * a[1] = 2;
         * a[2] = 3;
         * a[3] = 4;
         */

        // int a[]= {1,2,3,4};

        /*
         * for(int i=0;i<a.length;i++)
         * {
         * System.out.println(a[i] + " " );
         * }
         */

        for (int k : a) { // inhansh for loop
            System.out.print(k + " ");

        }

    }

}

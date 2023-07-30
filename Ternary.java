// ?: = condition ?ex1:ex2
// codition is true =ex1\
//conditionn is fulse = ex2

import java.util.Scanner;

public class Ternary {

    public static void main(String[] args) {
        int a ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value of Abetween 0 to 9  ");
        a = sc.nextInt();

       /* if (a <= 9) {
            System.out.println("true");

        } else
            System.out.println("false");*/

        boolean c=a<=9?true:false;

System.out.print(c);
    }
}
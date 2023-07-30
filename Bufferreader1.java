import java.io.BufferedReader; // in io class all functionn is resoures
import java.io.InputStreamReader; // so when we use io class function then we have to close those function using close  function

public class Bufferreader1 {
    public static void main(String[] args) throws Exception {

        System.out.println("Enter a number ");

        InputStreamReader rd = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(rd); // br is alway asking for object input stream reader

        int n = Integer.parseInt(br.readLine()); // here readline is method to use tack input and it gives string to int
                                                 
        // here parseInt is convert string into interger like "10" become 10
        System.out.println(n);

    }
}

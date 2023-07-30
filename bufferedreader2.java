import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bufferedreader2 {
    public static void main(String[] args) throws Exception {
        int  n=0;
        BufferedReader br=null;
        System.out.println("Enter a number ");
       /* try{
        InputStreamReader rd = new InputStreamReader(System.in);
         br = new BufferedReader(rd); 
        n = Integer.parseInt(br.readLine()); 

        }
        catch (Exception e){
        System.out.println(e);
        }
        finally{
  
            br.close();
            System.out.println("closed");
        }
        System.out.println(n);*/


// here we are make try block without using catch and finally block because
//if we are give wrong input thant it is go-out from try block and give output as n = 0 

        try(  BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));){
            n = Integer.parseInt(b1.readLine()); 
            b1.close();

        }
        System.out.println(n);

    }
}

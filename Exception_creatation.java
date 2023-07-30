public class Exception_creatation {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        i=10;
        j=11;

        try{
            int k = i/j;
            if(k==0)
            throw new JayException("chala ja bsdk ");

            System.out.println(k);
        }
        catch(Exception e)
        {
            System.out.println("Error \n"+e.getMessage());
        }
    }
}

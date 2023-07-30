public class Exception_try_catch_final {
    public static void main(String[] args) {
        try {
            int a[] = new int[2];
            int x = 5;
            int y = 0;
            int z = x / y;
            System.out.println(z);

        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Exception"); // err is use to get output in red color
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("invalid array index");
        } catch (Exception e) {
            System.err.println("Error");
        } finally {
            System.out.println("done");

        }
    }
}

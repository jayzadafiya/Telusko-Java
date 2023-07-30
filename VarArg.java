class Calc {
    public int add(int... n) // {1,2,3,4,5,,6,7,8,9,10} here it is consider as array
    {
        int sum = 0;
        for (int i : n) {
            sum = sum + i;
        }
        return sum;
    }

}

public class VarArg {
    public static void main(String[] args) {
        Calc obj = new Calc();

        System.out.println(obj.add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    }

}

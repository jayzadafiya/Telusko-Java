public class Array2 {
    public static void main(String[] args) {
        int d[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 8, 9, 10, 11 }
        };

        /*
         * for (int i = 0; i < d.length; i++) {
         * for (int j = 0; j < d[i].length; j++) {
         * System.out.print(" " + d[i][j]);
         * }
         * System.out.println();
         * 
         * }
         */

        for (int k[] : d) {

            for (int x : k) {
                System.out.print(" " + x);
            }
            System.out.println();

        }
    }
}

package lesson12;

public class Factorial {

    public static void main(String[] args) {

        System.out.println(recursionFactorial(4));

       // System.out.println(loopFactorial(4));


    }

    /**
     * get factorial using recursion
     * @param n
     * @return
     */
    public static Integer recursionFactorial(Integer n) {

        Integer result;

        if (n == 1 || n == 0)
            return 1;

        result = recursionFactorial(n - 1) * n;

        return result;
    }

    // Factorial using for loop
    public static Integer loopFactorial(Integer n) {
        Integer result = 1;

        if (n == 1 || n == 0)
            return 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
            System.out.println(result);
        }

        return result;
    }





    /*public static void multiplicationMatrix(){
        int[][] first =
                        {{33,34,12},
                        {33,19,10},
                        {12,14,17},
                        {84,24,51},};

        int[][] second =
                         {{10,11,34,55},
                        {33,45,17,81},
                        {45,63,12,16}};

        int[][] result = new int[first.length][second[0].length];
                                //4
        for (int i = 0; i < first.length; i++) {
                                    //4
            for (int j = 0; j < second[0].length; j++) {
                                        //3
                for (int k = 0; k < second.length; k++) {
                    // 33 * 10;
                    //
                    //
                    result[i][j] += first[i][k] * second[k][j];
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.format("%6d ", result[i][j]);
            }
            System.out.println();
        }
    }*/
}

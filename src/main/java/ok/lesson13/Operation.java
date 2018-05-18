package ok.lesson13;


public enum Operation {

    PLUS   {
        @Override
        double eval(double x, double y) {
            return x + y;
        }

        @Override
        int eval(int x, int y) {
            return x + y;
        }
    },
    MINUS  {
        @Override
        double eval(double x, double y) {
            return x - y;
        }

        @Override
        int eval(int x, int y) {
            return x - y;
        }
    },
    MULTI  {
        @Override
        double eval(double x, double y) {
            return x * y;
        }

        @Override
        int eval(int x, int y) {
            return x * y;
        }
    },
    DIVIDE {
        @Override
        double eval(double x, double y) {
            return x / y;
        }

        @Override
        int eval(int x, int y) {
            return x / y;
        }
    };

    /**
     * Do arithmetic op represented by this constant
     * @param x
     * @param y
     * @return
     */
    abstract double eval(double x, double y);
    abstract int eval(int x, int y);

}

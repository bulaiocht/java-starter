import java.util.Arrays;

public class NoName {

    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        final Integer[] resultOne = Work.calculate(a, b);
        final Integer[] resultTwo = sameWork(a, b);

        System.out.println(Arrays.toString(resultOne));
        System.out.println(Arrays.toString(resultTwo));

    }

    private static Integer [] sameWork(int a, int b){
        a -= 1;
        b -= 1;
        a *= 1;
        b *= 1;
        a *= 2;
        b *= 2;
        a *= 3;
        b *= 3;
        return new Integer[]{a, b};
    }
}

class Work {

    private Integer a;
    private Integer b;

    private Work(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    private Work minusOne(){
        this.a -= 1;
        this.b -= 1;
        return this;
    }

    private Work multOne(){
        this.a *= 1;
        this.b *= 1;
        return this;
    }

    private Work multTwo(){
        this.a *= 2;
        this.b *= 2;
        return this;
    }

    private Work multThree(){
        this.a *= 3;
        this.b *= 3;
        return this;
    }

    private Integer[] run(){
        this.minusOne()
            .multOne()
            .multTwo()
            .multThree();
        return new Integer[]{this.a, this.b};
    }

    static Integer [] calculate(int a, int b){
        return new Work(a, b).run();
    }

}
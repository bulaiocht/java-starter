package ok.lesson1;


public class HelloWorld {

   int x;

    public HelloWorld(int x) {
        this.x = x;
    }


    public static void main(String[] args) {

        for(String s : args){

            System.out.println(s);
        }

    }

    public static void main(Integer[] args) {
        System.out.println(args);
    }
}

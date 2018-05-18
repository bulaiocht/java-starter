package lesson5.loops;

/**
 * Created by Hillel Teacher on 21.04.2018.
 */
public class LoopRunner {

    public static void main(String[] args) {

//        System.out.println(brewCoffee(100, "Mocha"));

//        int counter = 0;
//
//        int outercounter = 0;
//
//        outer:
//        for (int i = 0; i < 10; i++) {
//
//            outercounter++;
//
//            for (int j = 0; j < 10; j++) {
//
//                if (counter == 50){
//                    continue outer;
//                }
//
//                counter++;
//            }
//        }
//        System.out.println("Outer: " + outercounter);
//        System.out.println("Counter: " + counter);

//        boolean flag = true;
//
//        do {
//            System.out.println("Hello from do-while");
//        }
//        while (flag);
//
//        while (flag){
//            System.out.println("Hello from while");
//        }

    }

    static int getResult(int counter){

        boolean out = true;

        int res = 0;

        for (; out ;){
            ++counter;
            System.out.print(counter + " ");
            res += counter;
            out = res%2 == 0;
            if (res == 2){
                return res;
            }
        }
        return res;
    }







    static String brewCoffee(int money, String type){
        return "your coffee: " + type+ " is ready. Thank you for your " + money + "$";
    }







    public static int getMax (int a, int b, int c){
        return 0;
    }

    public static void getMax (){
        return;
    }

}

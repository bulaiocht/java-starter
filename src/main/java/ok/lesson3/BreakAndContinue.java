package ok.lesson3;

public class BreakAndContinue {

    public static void main(String[] args) {

        //Break statement
        int x[] = {2, 43, 5, 6, 7, 89};

        int result = 0;

        for (int i = 0; i < x.length ; i++) {
            if (x[i] == 5){
                result = x[i];
                break;
            }
        }
        System.out.println(result);

            //Continue statement
           for (int i = 0; i <x.length ; i++) {
                if (x[i] == 43){
                    continue;
            }

            System.out.print(x[i] + " ");
        }

        System.out.println();

        for (int i = 0; i <x.length ; i++) {
            if (x[i] % 2 == 0){
                continue;
            }
            System.out.print(x[i] + " ");
        }
    }
}

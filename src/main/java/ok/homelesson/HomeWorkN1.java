package homelesson;

/**
 * Created by admin on 09.10.2016.
 */
public class HomeWorkN1 {
    public static void main(String[] args) {

        // Task 1

        int x = 10;
        int y = 12;
        int z = 23;
        int q = 45;
        int r = 7;

        float mid = (float)(x + y + z + q + r) / 5;
        System.out.println("Среднее арифметическое 5 чисел: " + mid);


      //Task 2

       int sum = 0;
        int discountNumber = 0;

        if (sum != 0){
            if (sum >=1 && sum <= 100){
                discountNumber = 1;
            }else if (sum > 100 && sum <= 200){
                discountNumber = 2;
            }else if (sum > 200 && sum <= 300){
                discountNumber = 3;
            }else if (sum > 300 && sum <= 400){
                discountNumber = 4;
            }else{
                discountNumber = 5;
            }
        }

        switch (discountNumber){
            case 1:
                System.out.println("Вы получили скидку 10%!");
                break;
            case 2:
                System.out.println("Вы получили скидку 20%!");
                break;
            case 3:
                System.out.println("Вы получили скидку 30%!");
                break;
            case 4:
                System.out.println("Вы получили скидку 40%!");
                break;
            case 5:
                System.out.println("Вы получили скидку 50%!");
        }




        //Task
       /* System.out.println("Результат цикла WhileAndFor:");
        int secondTask = 10;
        while (secondTask <= 100){
            System.out.println(secondTask);
            secondTask += 10;
        }

        System.out.println("Результат цикла For:");
        for (int i = 100; i > 0 ; i-= 10) {
            System.out.println(i);
        }*/

    }
}

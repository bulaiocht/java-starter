package homelesson;

public class Zadacha {
    public static void main(String[] args) {

        // Задача 1
        int a = 3;
        int b = 3;
        int c = 2;
        int d = 1;
        int e = 1;
        int test = (a + b + c + d + e)/5;
        System.out.println("Среднее арефметическое = " + test);

        // Задача 2
        int i = 10;
        while (i <= 100) {
            if (i % 10 == 0)
            System.out.println(i);
            i++;
        }

        for (int j = 100; j >= 10; j--) {
            if (j % 10 == 0)
                System.out.println(j);

        }

        // Задача 3
        int suma = 489;
        int skidka = 1;
        int skidka2 = 2;
        int skidka3 = 3;
        int skidka4 = 4;
        int skidka5 = 5;


        if (suma >= 10 && suma <= 100 && skidka == 1){
            System.out.println("Вы получили скидку 5%!");
        }else if (suma > 100 && suma <= 200 && skidka2 == 2){
            System.out.println("Вы получили скидку 10%!");
        }else if (suma > 200 && suma <= 300 && skidka3 == 3){
            System.out.println("Вы получили скидку 30%!");
        }else if (suma > 300 && suma <= 400 && skidka4 == 4){
            System.out.println("Вы получили скидку 40%!");
        }else if (suma > 400 && suma <= 500 && skidka5 == 5){
            System.out.println("Вы получили скидку 50%!");
        }






    }

}
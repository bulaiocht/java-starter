package homelesson;

/**
 * Created by admin on 17.10.2016.
 */
public class HomeWorkN2 {
    public static void main(String[] args) {
        //Task1
        /*У нас есть два одномерных массива, в первом 10 элементов, а во втором 5. С первого получить результат умножения всех непарных элементов массива, а
        со второго сумму всех парных элементов. И в итоге вывести на экран число которое равно превого числа в степени второго числа.
         */

        int x [] = {5, 4, 23, 66, 32, 11, 20, 16, 1, 9};
        int y [] = {4, 6, 1, 9, 2};

        int multi = 1;
        int sum = 0;
        int result;

        for (int i = 0; i <x.length ; i++) {
            if (x[i] % 2 != 0){
                    multi *= x[i];
            }
        }
        System.out.println(multi);

        for (int i = 0; i <y.length ; i++) {
            if (y[i] % 2 == 0){
                sum += y[i];
            }
        }
        System.out.println(sum);

        result = (int)Math.pow(multi, sum);
        System.out.println(result);

        System.out.println("------------------------------------------------");

        //Task2
        /*Создаем массив фиксированой длины. Но оставляем его без элементов. Просто создаем и указываем длину.
        Полсе этого записуем в него элементы с помощью Math.random() от 6 до 32 и цикла for. Идея задачи в том, что бы записатьв массив рандомные числа.
        После того как заполнили наш массив, следует отсортировать его по возврастания с помощью алгоритма сортировки Пузирьком.*/

        int mass [] = new int[7];
        int min = 6;
        int max = 32;

        for (int i = 0; i <mass.length ; i++) {
            mass[i] = (int)(Math.random() * (max - min)+1)+min;
        }

        for (int i = 0; i <mass.length ; i++) {
            System.out.print(" [ " + mass[i] + " ] ");
        }

        System.out.println();

        for (int i = 0; i < mass.length; i++) {
            for (int j = i + 1; j < mass.length ; j++) {
                if (mass[i] > mass[j]) {
                    int tmp = mass[i];
                    mass[i] = mass[j];
                    mass[j] = tmp;
                }
            }
        }

        System.out.println();
        for (int i = 0; i <mass.length ; i++) {
            System.out.print(" [ " + mass[i] + " ] ");
        }

        System.out.println();

        //Task 3
        /*Задача перебрать двумерный массив в обратном порядке и умножить все парные элементы, результат вывести на экран
        */

        int anotherMultiArray [][] = {{3,5, 22 ,3},{32, 90, 9, 11, 8}, {3, 12, 39, 76}};
        System.out.println("Задача перебрать двумерный массив в обратном порядке и умножить все парные элементы, результат вывести на экран :");
        int totalSum = 0;
        for (int i = anotherMultiArray.length - 1; i >= 0 ; i--) {
            int mult = 1;
            for (int j = anotherMultiArray[i].length - 1; j >= 0  ; j--) {
                if (anotherMultiArray[i][j] % 2 == 0){
                    mult *= anotherMultiArray[i][j];
                }
            }
            totalSum += mult;
        }
        System.out.println(totalSum);
    }
}

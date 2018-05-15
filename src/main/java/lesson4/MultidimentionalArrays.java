package lesson4;

/**
 * Created by admin on 12.10.2016.
 */
public class MultidimentionalArrays {

    public static void main(String[] args) {

        // 2 раза по 3 !!!
        int multiArray [][] = new int[2][3];
        multiArray[0][0] = 12;
        multiArray [0][1] = 43;
        multiArray [0][2] = 23;

        multiArray [1][0] = 11;
        multiArray [1][1] = 7;
        multiArray [1][2] = 9;

    /*    multiArray [2][0] = 12;
        multiArray [2][1] = 34;
        multiArray [2][2] = 978;

        multiArray [3][0] = 12;
        multiArray [3][1] = 98;
        multiArray [3][2] = 43;*/


        //Выводим размер двумерного массива
        System.out.println("multiArray length = " + multiArray.length);

        //Выводим количество одмомерных массивов в двумерном массиве
        for (int i = 0; i < multiArray.length; i++) {
            System.out.println("miltiArray[i] length = " + multiArray[i].length);
        }

        //Перебираем двумерный массив
        System.out.print("Перебираем двумерный массив : ");
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(" [ " + multiArray[i][j] + " ] ");
            }
        }

        System.out.println();

        //Альтернативный способ создать двумерный массив
        int anotherMultiArray [][]= {{1,2,3}, {5, 6, 7, 4}, {9, 4, 10}, {1,2}};

        //Выводим размер двумерного массива
        System.out.println("anotherMultiArray length = " + anotherMultiArray.length);

        //Выводим размер одмомерных массивов в двумерном массиве
        for (int i = 0; i <anotherMultiArray.length; i++) {
            System.out.println("anotherMultiArray " + i  + " length : " + anotherMultiArray[i].length);
        }

        System.out.println();

       //Сумма всех элементов
        int sum = 0;
        System.out.print("Выводим сумму всех элементов двумерного массива: ");
        for(int i = 0; i < anotherMultiArray.length; i++) {
            for (int j = 0; j < anotherMultiArray[i].length; j++) {
                sum += anotherMultiArray[i][j];
            }
        }
        System.out.println(sum);

        // Сумма элементов в каждом одномерном массиве отдельно
        System.out.print("Выводим сумму элементов каждого одномерного массива в двумерном массиве: ");
        for (int i = 0; i < anotherMultiArray.length; i++) {
            int sum2 = 0;
            for (int j = 0; j < anotherMultiArray[i].length; j++) {
                sum2 += anotherMultiArray[i][j];
            }
            System.out.print(" [ " + sum2 + " ] ");
        }

        System.out.println();

        // Выводим четные числа из двумернного массива
        System.out.print("Выводим все четные элементы двумернного массива : ");
        for (int i = 0; i <anotherMultiArray.length ; i++) {
            for (int j = 0; j <anotherMultiArray[i].length ; j++) {
                if(anotherMultiArray[i][j] % 2 == 0){
                    System.out.print(" [ " + anotherMultiArray[i][j] + " ] ");
                }
            }
        }

        System.out.println();

        int anotherMultiArray2 [][]= {{12,26,38}, {5, 6, 7, 4}, {9, 4, 10}, {31,22}};

        System.out.print("Выводим все элементы массива в оббратном порядке: ");
        for (int i = anotherMultiArray2.length - 1; i >= 0 ; i--) {
            for (int j = anotherMultiArray2[i].length - 1; j >= 0 ; j--) {
                System.out.print(" [ " + anotherMultiArray2[i][j] + " ] ");
            }
        }

        System.out.println();

/*








        // дз
        System.out.println("Задача перебрать двумерный массив в обратном порядке и умножить все парные элементы, результат вывести на экран :");
            int totalSum = 0;
        for (int i = anotherMultiArray.length - 1; i >= 0 ; i--) {
            int multi = 1;
            for (int j = anotherMultiArray[i].length - 1; j >= 0  ; j--) {
                if (anotherMultiArray[i][j] % 2 == 0){
                    multi *= anotherMultiArray[i][j];
                }
            }
            totalSum += multi;
        }
        System.out.println(totalSum);



*/





















          /*  System.out.println("------------------------------------------------------");
        for (int i = 0; i <anotherMultiArray.length / 2 ; i++) {
            for (int j = 0; j <anotherMultiArray.length - 1 - i ; j++) {
                int tmp = anotherMultiArray[i][j];
                anotherMultiArray[i][j] = anotherMultiArray[j][anotherMultiArray.length-1-i];
                anotherMultiArray[j][anotherMultiArray.length-1-i] = anotherMultiArray[anotherMultiArray.length-1-i][anotherMultiArray.length-1-j];
                anotherMultiArray[anotherMultiArray.length-1-i][anotherMultiArray.length-1-j] = anotherMultiArray[anotherMultiArray.length-1-j][i];
                anotherMultiArray[anotherMultiArray.length-1-j][i]     = tmp;
            }
            }
        for (int i = 0; i <anotherMultiArray.length ; i++) {
            for (int j = 0; j <anotherMultiArray[i].length; j++) {
                System.out.println(anotherMultiArray[i][j]);
            }
        }
*/
    }
}

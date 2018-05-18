package lesson5;


public class Methods {


    /**
     *
     * @param array
     */
    public void sortArray(int [] array){

        //алгоритм сортировки
        for (int i = 0; i <array.length ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if (array[i] > array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }

        //выводим на экран отсортированный массив
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }


    static Integer sum(int x, int y){
        int result;

        result = x + y;

        return result;
    }

    //Вернуть false если 0 занимает последний элемент массива
    public static Boolean checkZero(int []x) {

        Boolean bool = true;

        for (int i = 0; i < x.length; i++) {

            if (x[i] == 0 &&  i == x.length - 1) {
                bool = false;
            } else {
                bool = true;
            }
        }
        return bool;
    }
}

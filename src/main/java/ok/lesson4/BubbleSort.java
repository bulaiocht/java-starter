package lesson4;

public class BubbleSort {

    public static void main(String[] args) {

        int arr [] = {5, 9, 6, 7, 1, 8, 3, 0};

        int arr1 [] = new int [8];
            arr1[0] = 5;
            arr1[1] = 9;

         /*Внешний цикл каждый раз сокращает фрагмент массива,
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/
        for(int i = arr.length-1; i > 0 ; i--) {

            for (int j = 0; j < i; j++) {

            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

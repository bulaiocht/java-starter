package lesson4;


public class SortArray {

    public static void main(String[] args) {
        int [] mass = new int[10];

        //запись рандомных чисел от 0 до 10 в массив
        System.out.println("Массив рандомных чисел: ");
        for (int i = 0; i <mass.length ; i++) {
            mass[i] = (int)(Math.random() * (10 - 0)+1)+0;
            System.out.print(mass[i] + " , ");
        }

        System.out.println();


    }
}

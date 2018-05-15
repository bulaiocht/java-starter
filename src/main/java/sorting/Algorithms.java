package sorting;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.Scanner;

public class Algorithms {

    public static void main(String[] args) {

        int arrSize = 100000;

        int [] arrayOne = new int[arrSize];
        int [] arrayTwo = new int[arrSize];

        int bound = 250000;

        randomFill(arrayOne, bound);

        System.arraycopy(arrayOne, 0, arrayTwo, 0, arrayOne.length);

        int number = 30;

        final LocalDateTime start1 = LocalDateTime.now();
        mergeSort(arrayOne, 0, arrayOne.length - 1);
        //final int search1 = binarySearch(arrayOne, number);
        final LocalDateTime end1 = LocalDateTime.now();

        final LocalDateTime start2 = LocalDateTime.now();
        bubbleSort(arrayTwo);
        //final int search2 = linearSearch(arrayTwo, number);
        final LocalDateTime end2 = LocalDateTime.now();

        long algOneTime = start1.until(end1, ChronoUnit.MILLIS);
        long algTwoTime = start2.until(end2, ChronoUnit.MILLIS);

        System.out.printf("Algorithm one spent %d milliseconds \n", algOneTime);
        System.out.printf("Algorithm two spent %d milliseconds \n", algTwoTime);

    }

    private static int linearSearch (int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number){
                return i;
            }
        }
        return -1;
    }

    private static void randomFill(int [] array, int bound){

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(bound);
        }

    }

    private static int binarySearch(int [] array, int number) {
        int start = 0;
        int end = array.length -1;

        while (start <= end){
            int mid = (start + end)/2;

            if (number == array[mid]){
                return mid;

            } else if (number > array[mid]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    private static void bubbleSort(int [] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j+1]){
                    swap(array, j, j+1);
                }
            }
        }
    }

    private static void insertSort(int [] array){
        for (int i = 0; i < array.length; i++) {
            int counter = i;
            while (counter > 0){
                if (array[counter] < array[counter-1]){
                    swap(array, counter, counter-1);
                } else break;
                counter--;
            }
        }
    }

    private static void selectSort(int [] array){
        int n = array.length - 1;
        for (int i = 0; i <= n; i++) {
            int minIndex = minValue(array, i, n);
            swap(array, i, minIndex);
        }
    }

    private static void mergeSort(int [] array, int leftStart, int rightEnd){
        int mid = (leftStart + rightEnd)/2;
        if (leftStart >= rightEnd) return;
        mergeSort(array, leftStart, mid);
        mergeSort(array, mid + 1, rightEnd);
        merge(array, leftStart, rightEnd);
    }

    private static void merge(int[] array, int leftStart, int rightEnd) {

        int middle = (leftStart + rightEnd)/2;

        int leftSize = middle + 1 - leftStart;
        int rightSize = rightEnd - middle;

        int [] leftArr = new int[leftSize];
        int [] rightArr = new int[rightSize];

        System.arraycopy(array, leftStart, leftArr, 0, leftArr.length);
        System.arraycopy(array, middle + 1, rightArr, 0, rightArr.length);

        int left = 0;
        int right = 0;
        int index = leftStart;

        while (left < leftSize && right < rightSize){
            if (leftArr[left] <= rightArr[right]){
                array[index] = leftArr[left];
                left++;
            } else {
                array[index] = rightArr[right];
                right++;
            }
            index++;
        }
        while (left < leftSize){
            array[index] = leftArr[left];
            left++;
            index++;
        }

        while (right < rightSize){
            array[index] = rightArr[right];
            right++;
            index++;
        }

    }

    private static int minValue(int [] array, int start, int end){
        int min = array[start];
        int index = start;
        for (int i = start; i <= end; i++) {
            if (min > array[i]){
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    private static void swap(int [] array, int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    private static void hw1(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < (n-i)/2; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("0");
            }
            System.out.println();
        }
    }

    private static void hw2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print number from 2 to 4");
        int a = scanner.nextInt();

        while (a>=0){
            for (int i = 0; i <= a; i++){
                System.out.print("0");
            }
            System.out.println();
            a--;
        }

    }
}

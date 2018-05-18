package ok.lesson10;

import javax.sql.rowset.serial.SQLInputImpl;
import java.io.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;


public class ExceptionTest {

   /* try {
        // блок кода, где отслеживаются ошибки
    }
    catch (тип_исключения_1 exceptionObject) {
        // обрабатываем ошибку
    }
    catch (тип_исключения_2 exceptionObject) {
        // обрабатываем ошибку
    }
    finally {
        // код, который нужно выполнить после завершения блока try
    }
    */

    public static void main(String[] args) throws OwnException {

        //RuntimeExceptions

        //ArithmeticException  - арифметическая ошибка
//
//        int x = 5 / 0;
//        int y = 5 % 0;
//        System.out.println(y);

        //ArrayIndexOutOfBoundsException - выход индекса за границу массива
//
//        Integer[] arr3 = {3, 4, 5};
//        System.out.println(arr3[arr3.length]);

//         Integer[] arr3 = {3, 4, 5};
//
//            System.out.println(arr[arr.length]);
//
        // ArrayStoreException  - присваивание элементу массива объекта несовместимого типа
//
//            Object arr1 [] = new Integer[4];
//            arr1[0] = 4.4;

        //ClassCastException - неверное приведение
//        Object x = new Integer(1);
//        System.out.println((String) x);

        //NegativeArraySizeException - создан массив отрицательного размера

//       int [] mass = new int[-10];

        //NullPointerException - неверное использование пустой ссылки

//       int[] nullArray = null;
//
//        for (int i = 0; i < nullArray.length; i++)
//            System.out.println(nullArray[i]);



        //ArrayStoreException
//        Character chr = new Character('*');
//        Object szStr[] = new String[10];
//
//        try {
//            szStr[0] = chr;
//        } catch(Exception ex) {
//            //System.out.println(ex.toString());
//           //System.out.println(ex.getMessage());
//           ex.printStackTrace();
//        }

        System.out.println(getAreaValue(-1, 100));


//       int result = 0;
//
//        try {
//            result = getAreaValue(-1, 100);
//        }catch (IllegalArgumentException ex){
//            //1
//            System.out.println(ex.toString());
//            //2
//            System.out.println(ex.getMessage());
//            //3
//            ex.printStackTrace();
//            //4
//            Logger.getLogger(ExceptionTest.class.getName()).log(new LogRecord(Level.WARNING, "You inserted" +
//                    " negative value as an argument!"));
//            throw  ex;
//        }
//
//        System.out.println("Result is: " + result);


//        int result = 0;
//
//        try {
//            result = getAreaValue(-1, 100);
//        }catch (IllegalArgumentException ex){
////
////            Logger.getLogger(ExceptionTest.class.getName()).log(new LogRecord(Level.WARNING, "You inserted" +
////                    " negative value as an argument!"));
//            throw  new OwnException(ex);
//        }
//
//        System.out.println("Result is: " + result);


//        File file = new File("C:\\Users\\admin\\Desktop\\Hillel\\Ex.png");
//        FileInputStream fis = null;
//
//        try {
//            fis = new FileInputStream(file);
//            //Если файл не найден
//        }catch (FileNotFoundException ex){
//            System.out.println("Sorry, There is no such file!");
//            ex.printStackTrace();
//        }

       // System.out.println("stringSize(\"string\"): "+stringSize("vasia"));
       // System.out.println("stringSize(null): "+stringSize(null));

    }


    /** area value
     * @param x
     * @param y
     * @return
     */
    public static  int getAreaValue(int x, int y){
        if ( x < 0 || y < 0) throw  new IllegalArgumentException("value of 'x' or 'y'" +
                " is negative: x = " + x + ", y = " + y);

        return  x*y;
    }

    /**1 version
     * @param path
     * @return
     * @throws IOException
     */
    static String readFirstLineFromFile1V(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        try {
            return bufferedReader.readLine();
        }finally {
            if (bufferedReader != null)  bufferedReader.close();
        }
    }

    //2 version
    static String readFirstLineFromFile2V(String path) throws IOException{
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            return bufferedReader.readLine();
        }
    }


    /**about finally
     * @param s
     * @return
     */
    public static int stringSize(Object s) {
        try {
            return s.toString().length();
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            return 0;
        }
    }
}

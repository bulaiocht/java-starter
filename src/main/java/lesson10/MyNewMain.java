package lesson10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


public class MyNewMain {

    public static void main(String[] args) throws MyException {
        try {
            processFile("file.txt");
        } catch (MyException e) {
            processErrorCodes(e);
        }
    }


    /**метод для обработки ошибок
     * @param e
     * @throws MyException
     */
    private static void processErrorCodes(MyException e) throws MyException {
            // здесь мы ищем указанный при выбросе исключения код ошибки и сообщаем пользователю что произошло
            switch(e.getErrorCode()){

                case "FILE_NOT_FOUND_EXCEPTION":
                    System.out.println("Файл не найден");
                    throw e;
                   // break;
                case "FILE_CLOSE_EXCEPTION":
                    System.out.println("Ошибка при закрытии файла");
                    break;
                default:
                    System.out.println("Произошла неизвестная ошибка " + e.getMessage());
                    e.printStackTrace();
            }
        }

    /** метод для работы с файлом, который пробрасывает наш тип исключений
     * @param file
     * @throws MyException
     */
    private static void processFile(String file) throws MyException {
        InputStream fis = null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            // здесь мы бросаем исключение с указанием кода ошибки
            throw new MyException(e.getMessage(),"FILE_NOT_FOUND_EXCEPTION");
        }finally{
            try {
                if(fis != null)fis.close();
            } catch (IOException e) {
                // здесь мы бросаем исключение с указанием кода ошибки
                throw new MyException(e.getMessage(),"FILE_CLOSE_EXCEPTION");
            }
        }
    }
}
/*finally {


            PultTV tv = new PultTV();
            tv.switchON();
            tv.switchOFF();

            PultCondition condition = new PultCondition();
            condition.switchON();
            condition.switchOFF();
        }*/
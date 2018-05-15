package lesson8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main implements OverloadMethodsExample{

    @Override
    public void sum(Integer x, Integer y) {

    }

    @Override
    public void sum(String x, String y) {

    }

    @Override
    public void sum() {

    }


    public static void main(String[] args) throws ParseException {

//        Scanner scanner = new Scanner(System.in);
//        BookUtils books = new BookUtils();
//        books.language(scanner.next());
//
//        System.out.println(books.getLanguage());
//        books.setCountryByLanguage();
//
//        System.out.println(books.getCountry());
//        books.setAuthorsByCountry();
//
//        System.out.println(books.getAuthor());
//
//        books.bookGenre();
//        System.out.println(books.getGenre());




       //HashCode example
        // hashCode() для объекта возвращает номер ячейки памяти, где объект сохраняется.
        Object x = new Object();
        int result = x.hashCode();
        System.out.println(result);

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee1.setId(10);
        employee2.setId(10);

        System.out.println(employee1.equals(employee2));

        Set <Employee> employees = new HashSet<>();
        employees.add(employee1);
        employees.add(employee2);

        System.out.println(employees.hashCode());
        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());

        Date todayDate = new Date();
        System.out.println(todayDate);

//-------------------------------------------------------------------------------------------

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String dateFromServer = "2017-03-25";

        Date date = sdf.parse(dateFromServer);

        Date curDate = new Date();

        boolean check = curDate.before(date);

        String cur = sdf.format(curDate);

        Date date1 = sdf.parse(cur);


        if(check == true || date.equals(date1))
            System.out.println("OK");
         else
            System.out.println(" out-of-date!");

    }
}

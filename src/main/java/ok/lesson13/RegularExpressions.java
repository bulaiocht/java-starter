package ok.lesson13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegularExpressions {

    /*
                 Конструкция Regex	Что считается совпадением
                 .	Любой символ
                 ?	Ноль (0) или одно (1)повторение предшествующего
                 *	Ноль (0) или более повторений предшествующего
                 +	Одно (1) или более повторений предшествующего
                []	Диапазон символов или цифр
                ^	Отрицание последующего (то есть, "не что-то")
                \d	Любая цифра (иначе, [0-9])
                \D	Любой нецифровой символ (иначе, [^0-9])
                \n   Символ разделитель - с новой строки
                \t   Символ разделитель - табуляция
                \s	Любой символ-разделитель (иначе, [\n\t])
                \S	Любой символ, отличный от разделителей (иначе, [^\n\t])
                \w	Любая буква или цифра (иначе, [A-Za-z_0-9])
                \W	Любой знак, отличный от буквы или цифры (иначе, [^\w])*/

    public static final String EXAMPLE_TEST =
            "This is my small example "
            + "string which I'm going to "
            + "use for pattern matching.";

    public static void main(String[] args) {

        System.out.println(EXAMPLE_TEST.matches("\\w.*"));

        String[] splitString = (EXAMPLE_TEST.split("\\s+"));

        System.out.println(splitString.length);

        for (String string : splitString) {
            System.out.println(string);
        }

        // replace all whitespace with tabs
        System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t"));


        Pattern pattern = Pattern.compile("\\w+");

        Matcher matcher = pattern.matcher(EXAMPLE_TEST);

        // check all occurance
        while (matcher.find()) {
            System.out.print("Start index: " + matcher.start());
            System.out.print(" End index: " + matcher.end() + " ");
            System.out.println(matcher.group());
        }

        // now create a new pattern and matcher to replace whitespace with tabs
        Pattern replace = Pattern.compile("\\s+");
        Matcher matcher2 = replace.matcher(EXAMPLE_TEST);
        System.out.println(matcher2.replaceAll("\t"));


        String date = "29-01/2017";
        Pattern pattern1 = Pattern.compile("(\\d+)[-/](\\d\\d)[-/](\\d\\d\\d\\d)");
        Matcher matcher1 = pattern1.matcher(date);

        if (matcher1.find()){
            String day = matcher1.group(1);
            String month = matcher1.group(2);
            String year = matcher1.group(3);
            System.out.printf("\nFound %s-%s-%s", year, month, day);
        }
    }
    }


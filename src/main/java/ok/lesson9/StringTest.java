package ok.lesson9;

import java.util.Arrays;
import java.util.Random;

public class StringTest {

    String x = "object";
    String y = "object";


    public static void main(String[] args) {

        String str = "Hello World";

        //First variant
        char[] chr = str.toCharArray();

        for (int i = 0; i < chr.length; i++) {
            System.out.print(" [ " + chr[i] + " ] ");
        }

        System.out.println();

//        //Second variant
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                System.out.print(" ");
            } else {
                System.out.print(" [ " + str.charAt(i) + " ] ");
            }
        }
        System.out.println();

//        //Создать строку через массив чаров в конструкторе
        char[] c = {'H', 'e', 'l', 'l', 'o'};
        String constructorString = new String(c);
        System.out.println(constructorString);

//        //Создать массив чаров из строки
        char[] ch = constructorString.toCharArray();

        //Переберем массив чаров
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }

        //Перевернем массив чаров
        for (int i = 0; i < ch.length / 2; i++) {
            char tmp = ch[i];
            ch[i] = ch[ch.length - i - 1];
            ch[ch.length - i - 1] = tmp;
        }

        System.out.println();

        //Результат
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }

        System.out.println();

//        //Переворот строки с помощью StringBuffer
        StringBuffer buf = new StringBuffer("Hello Ok");
        System.out.println(buf);


        String reverseString = new StringBuffer("Alexey").reverse().toString();
        System.out.println(reverseString);

        String first = "Milan";
        String second = "Berlin";

        System.out.println(first + second);

         System.out.println(first += second);

//        //Обьединение строк
        String third;
        third = first.concat(second);
        System.out.println(third + " !!! ");
        System.out.println(first.concat(second));
        System.out.println(first);

        //String ua = "Kiev";

        //Заканчивается ли строка на "in"
        System.out.println(second.endsWith("in"));
//
        //Содержит ли строка "il"
        System.out.println(first.contains("il"));

        //Все символы с малой переводим в большие
        System.out.println(second.toUpperCase());

        //Все символы с большой переводим в малые
        System.out.println(first.toLowerCase());

        System.out.println(first.replace('M', 'B') + second.replace('B', 'M'));

        Employee employee = new Employee();

        employee.setName("Ivan");
        employee.setAge(25);
        employee.setSalary(1234);

        System.out.println(employee.toString());

        //Разбить строку на массивы строк
        String splitString = "We love New Year";

        String splitStringArray[] = splitString.split(" ");
        //Вывели массив целиком
        System.out.println(Arrays.toString(splitStringArray));


        String x = "USA".replace("S", "");
        System.out.println(x);
        //Перебрали массив и поменяли  символ на последний каждого слова
        for (int i = 0; i < splitStringArray.length; i++) {

                splitStringArray[i] = splitStringArray[i]
                        .replace(splitStringArray[i]
                                        .charAt(0),
                                splitStringArray[i]
                                        .charAt(splitStringArray[i].length() - 1));
        }

        System.out.println(Arrays.toString(splitStringArray));

        StringBuffer strbf = new StringBuffer("New Word");
        System.out.println(strbf);
        System.out.println(strbf.capacity());

        String str1 = "Товар стоит ";
        String str2 = " баксов";
        int sum = 10;

        StringBuffer sb = new StringBuffer(20);
        sb.append(str1).append(sum).append(str2);
        System.out.println(sb);
        System.out.println(sb.indexOf(str2));

        System.out.println(sb);

        //Запись массива строк в StringBuffer
        String[] stringArray = {"My name is Petia", "I'm president of Ukraine", "I have factory"};

        StringBuffer buffer  = new StringBuffer();

        for (int i = 0; i < stringArray.length; i++) {
                buffer.append(" [ " + stringArray[i] + " ] ");
        }
        System.out.println(buffer);

        //Меняем местами строки в массиве строк
        String[] changeWords = {"Ivan Petrov", "Stas Ivanov", "Petr Stasovich"};

        System.out.println(Arrays.toString(changeWords));

            String tmp = changeWords[0];
            changeWords[0] = changeWords[changeWords.length - 1];
            changeWords[changeWords.length - 1] = tmp;

       System.out.println(Arrays.toString(changeWords));

      //  StringTest stringTest = new StringTest();
        System.out.println(StringTest.createRandomString());


        homeWork();
    }


    //Генерируем пароль

    private static final String mCHAR = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private static final int STR_LENGTH = 13; // длина генерируемой строки



    public static String createRandomString() {
        Random random = new Random();
        StringBuilder builder = new StringBuilder();

        System.out.println(mCHAR.length());
        for (int i = 0; i < STR_LENGTH; i++) {
            int number = random.nextInt(mCHAR.length());
            System.out.println(number);
            char ch = mCHAR.charAt(number);
            builder.append(ch);
        }
        return builder.toString();
    }



/*Создайте 4 разные строки подлинее. Во всех 4 строках должен быть 1 общий символ.
Переберите первые две посимвольно и запишите в новую строку результат конкатинации всех символов которые стоят на парныъ индексах.
 А с другими двумя тоже самое только с символами на непарных индексах.

Теперь когда мы получили две новые строки обьедените их в StringBuffer.

Сгенерировали один большой пароль, скажем примерно 40 символов. Создаем новую строку и записываем в нее символы с предыдущей строки
в рандомном порядке, но после каждого 10-го элемента записываем символ @.

Далее Разбиваем строку на 4 строки новые по общему символу с помощью сплита. Создаем клас Клиенты с полем ПАРОЛЬ и методами гет и сет. И в мейне сетим
новым 4 клиентам их новые пароли. И в SOUT выводим на экран.*/

    public static void homeWork() {
        String x = "BigBangTheory";
        String y = "HowIMetYourMother";
        String q = "BrakingBad";
        String z = "TheGameOfThrones";

        String pairedX = "";
        String pairedY = "";

        String unpairedQ = "";
        String unpairedZ = "";

        String concatPaired = "";
        String concatUnpaired = "";

        for (int i = 0; i < x.length() ; i++) {
            if (i % 2 == 0)
                pairedX += x.charAt(i);
        }


        for (int i = 0; i <y.length() ; i++) {
            if (i % 2 == 0)
              pairedY += y.charAt(i);
        }

        concatPaired = pairedX.concat(pairedY);

        for (int i = 0; i <q.length() ; i++) {
            if (i % 2 != 0)
                unpairedQ += q.charAt(i);
        }

        for (int i = 0; i <z.length() ; i++) {
            if (i % 2 != 0)
                unpairedZ += z.charAt(i);
        }

        concatUnpaired = unpairedQ.concat(unpairedZ);

        StringBuffer buffer = new StringBuffer(concatPaired.concat(concatUnpaired));

        System.out.println("!" + " " + buffer);

        Random random = new Random();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i <= 40; i++) {
            if ( i == 10 || i == 20 || i == 30)
                builder.append('@');

            if (i == 40)
                continue;

            int number = random.nextInt(buffer.length());
            char ch = buffer.charAt(number);
            builder.append(ch);
        }

        System.out.println(builder);

            String str = builder.toString();

            String [] strArr = str.split("@");

            String firstPass = "";
            String secondPass = "";
            String thirdPass = "";
            String forthPass = "";

            for (int i = 0; i < strArr.length; i++) {
                if (i == 0) {
                    firstPass = strArr[i];
                }
                if (i == 1){
                    secondPass = strArr[i];
                }
                if (i == 2) {
                    thirdPass = strArr[i];
                }
                if (i == 3){
                    forthPass = strArr[i];
                }
            }

        System.out.println(firstPass);
        System.out.println(secondPass);
        System.out.println(thirdPass);
        System.out.println(forthPass);
    }

}
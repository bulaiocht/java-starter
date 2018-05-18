package ok.lesson5;


public class ClassA {

    public static void main(String[] args) {
        int x = 34;
        int y = 76;
        int result;

        //Создаем обьект класса ClassB
       ClassB classB = new ClassB();

        //Вызовим метод умножения двух чисел
        result = classB.multi(x,y);
        System.out.println(result);





    }
}

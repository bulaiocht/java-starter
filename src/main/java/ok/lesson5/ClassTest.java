package ok.lesson5;

public class ClassTest {

    public static void main(String[] args) {

//        int ageField = 10;
//        double salaryField = 1000.50;
//        //Создаем обьект класса СlassC
//        ClassC employer = new ClassC();
//
//        //Делаем все инициализации
//        employer.age = ageField;
//        employer.firstName = "Ivan";
//        employer.secondName = "Ivanovich";
//        System.out.println(employer.age + employer.firstName + employer.secondName);
//        employer.setSalary(salaryField);
//        System.out.println(employer.getSalary());


        //////////////////////////////////////////////////////////////////////////////////

        //Создаем обьект класса Terier

        Terier terier = new Terier();

       // System.out.println(Terier.legs);
        System.out.println(Terier.whatItUseToBreeze);
        System.out.println(terier.whatDoesDogSay);
        System.out.println(terier.whatDoesDogEat);
        terier.setAge(12);
        terier.setName("Rex");
        System.out.println(terier.getName());
        System.out.println(terier.getAge());

        System.out.println(terier.animalLegs());

        ////////////////////////////////////////////////////////////////////////////////
        int first = 5;
        int second = 10;

        int q =  Methods.sum(first, second);
        System.out.println(q);

        int arrayTest [] = {4, 62 , 9, 90, 12};

        //Создаем обьект класса Methods
        Methods methodsObject = new Methods();

        //Вызываем метод сортировки массива
        methodsObject.sortArray(arrayTest);



        int arrayTest2 [] = {3 ,43, 6, 12};
        methodsObject.sortArray(arrayTest2);

        System.out.println();

        int arrayWithZero [] = {5, 4, 0};

        //Проверяем есть ли ноль в конце массива
        if (Methods.checkZero(arrayWithZero) != true){

            //если есть то перезаписываем элемент
            arrayWithZero[arrayWithZero.length - 1] = 10;
        }

        for (int i = 0; i <arrayWithZero.length ; i++) {
            System.out.println(arrayWithZero[i]);
        }

    }

}

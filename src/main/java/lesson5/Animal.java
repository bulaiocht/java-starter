package lesson5;

//Родительский класс
public class Animal {

    private static int legs = 4;

    public static final String whatItUseToBreeze = "Air";


    //Метод который выводит количество лап у птиц
    protected Integer animalLegs(){

        return this.legs;
    }

}

package birds;

public class BirdsTest{

    public static void main(String[] args) {

        System.out.println(Pigeon.whatItUseToBreeze);

        //Создаем обьект класса Pigeon
        Pigeon pigeon = new Pigeon();

        System.out.println(pigeon.birdsSay);

        //Вызываем метод определения количества лап у птиц
        System.out.println(pigeon.animalLegs());

    }
}

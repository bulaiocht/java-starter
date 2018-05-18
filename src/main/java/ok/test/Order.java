package ok.test;


import java.util.Date;
import java.util.Scanner;


import java.math.*;

public class Order {

    static {
        System.out.println("Welcome to Car's World!!!");
        System.out.println("Please enter order");
    }

    public static void main(String[] args) {

        BMW orderBMW = new BMW();
        TESLA orderTESLA = new TESLA();
        Nissan orderNissan = new Nissan();

        OrderProcessing(orderBMW, orderTESLA, orderNissan);
    }


    public static void OrderProcessing(Cars... mahsini) {

        String brand = "";
        Double sumCost;
        String prefValuta;
        String country = "";
        String adress = "";
        String confirmation;
        BigDecimal platejEveryMounth = new BigDecimal(0.0);

        CarType carType = new CarType();
        CarEngine carEngine = new CarEngine();
        EngineCap engineCap = new EngineCap();
//        ColorOfCar colorOfCar = new ColorOfCar();

        Date date = new Date();
        String str = String.format("%1$s %2$td %2$tm %2$tY", "Order's date : ", date);

        for (Cars car : mahsini) {

            System.out.println("What brand do U prefer: BMW, Tesla or Nissan");

            Scanner scanner = new Scanner(System.in);
            brand = scanner.nextLine();

            if (brand.contentEquals("BMW")) {
                carCharact(carType, carEngine, engineCap, car);
            }

            if (brand.contentEquals("Tesla")) {
               carCharact(carType, carEngine, engineCap, car);
            }

            if (brand.contentEquals("Nissan")) {
                carCharact(carType, carEngine, engineCap, car);
            }

            System.out.println("Please enter full car's cost: ");

            Scanner scCost = new Scanner(System.in);
            sumCost = scCost.nextDouble();
            BigDecimal fullPayment = new BigDecimal(sumCost);
            sumCost = fullPayment.setScale(2, BigDecimal.ROUND_UP).doubleValue();


            System.out.println("Please enter currency: USD or EUR or UAH");

            Scanner valut = new Scanner(System.in);
            prefValuta = valut.nextLine();
            country = ValutaAndCountries.addressDelivery(prefValuta); // тут метод с класа валюта и страны

            System.out.println("Please enter your city: ");
            Scanner scanner2 = new Scanner(System.in);
            adress = scanner2.nextLine();

            System.out.println("Enter OK  if payment is complete or Part if we draw up a loan: ");

            Scanner confirm = new Scanner(System.in);
            confirmation = confirm.nextLine();
            if (confirmation.contentEquals("Part")) {
                Credit.showMenu();
                Credit.typeOfCredit(sumCost);
                platejEveryMounth = Credit.monthCreditPayment;
                System.out.println();
            }

            Client client = new Client(sumCost, adress, confirmation.contentEquals("OK"), country);

            if (client.getConfirmPayment() == true) {
                System.out.println("This's your order: ");

                if (car instanceof BMW) {
                    completeInvoice(brand, carType, carEngine, engineCap, car, prefValuta,
                            country, sumCost, str, adress);
                    Warranty.readWarrentyBMW();
                    break;
                } else if (car instanceof TESLA) {
                    completeInvoice(brand, carType, carEngine, engineCap, car, prefValuta,
                            country, sumCost, str, adress);
                    Warranty.readWarrentyTesla();
                    break;
                } else if (car instanceof Nissan) {
                    completeInvoice(brand, carType, carEngine, engineCap, car, prefValuta,
                            country, sumCost, str, adress);
                    Warranty.readWarrentyNissan();
                    break;
                }
            }
            if (client.getConfirmPayment() != true) {

                if (car instanceof BMW) {
                    partInvoice(brand, carType, carEngine, engineCap,car, prefValuta, country,
                            platejEveryMounth, str, adress);
                    Warranty.readWarrentyBMW();
                    break;
                } else if (car instanceof TESLA) {
                    partInvoice(brand, carType, carEngine, engineCap,car, prefValuta, country,
                            platejEveryMounth, str, adress);
                    Warranty.readWarrentyTesla();
                    break;
                } else if (car instanceof Nissan) {
                    partInvoice(brand, carType, carEngine, engineCap,car, prefValuta, country,
                            platejEveryMounth, str, adress);
                    Warranty.readWarrentyNissan();
                    break;
                }
            }
        }
    }

    public static void carCharact(CarType carType, CarEngine carEngine, EngineCap engineCap, Cars car) {

        String colorType;

        carType.showMenu();
        carType.cType();
        carType.cType2();

        System.out.println("Please enter color: ");
        Scanner scanner2 = new Scanner(System.in);
        colorType = scanner2.nextLine();
        car.setColor(colorType);
//                colorOfCar.showMenu();
//                colorOfCar.carColor1();
//                colorOfCar.carColor2();

        carEngine.showMenuFuel();
        carEngine.eTypeFuel();
        carEngine.eTypeFuelReturn();

        engineCap.showMenu();
        engineCap.eCap();
        engineCap.eCapReturn();
    }

    public static void completeInvoice(String brand, CarType carType, CarEngine carEngine, EngineCap engineCap,
                                       Cars car, String prefValuta, String country, Double sumCost, String str,
                                       String adress){
       System.out.println(brand + "\t" + carType.carT + "\t" + carEngine.engType + "\t" + engineCap.engCap + "\t"
               + car.getColor() + " color " + " \nValue: " + sumCost + " - " + prefValuta + "\nDelivery address: "
               + country + ",\t" + adress +  "\n" + str);
    }

    public static void partInvoice(String brand, CarType carType, CarEngine carEngine, EngineCap engineCap,
                                   Cars car, String prefValuta, String country,
                                   BigDecimal platejEveryMounth, String str, String adress){
        System.out.println(brand + "\t" + carType.carT + "\t" + carEngine.engType + "\t" + engineCap.engCap + "\t"
                + car.getColor() + " color " + "\nMonthly payment: " + platejEveryMounth + "-" + prefValuta +
                "\nDelivery address: " + country + ",\t" + adress + "\n" + str);
    }

}



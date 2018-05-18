package ok.lesson6;


import java.util.Scanner;

public class Order {

    static {

        String welcome = "Welcome to PhoneSoft!";
        String enter = "Please enter client order!";

        System.out.println(welcome);
        System.out.println(enter);
    }

    public static void main(String[] args) {

        Samsung order = new Samsung();
        IPhone order2 = new IPhone();

        ingressOrder(order, order2);

        if (order instanceof Samsung)
            System.out.println("You won 50%");
    }

    public static void ingressOrder(Phone...phones) {

        String markName = "";
        String modelName;
        Integer memory;
        Integer paymentSum;
        String confirmation;
        String address;
        Boolean confirmPayment;


        for (Phone phone: phones) {

            if (phone instanceof Samsung) {

                System.out.println("Please insert Mark Name: ");
                Scanner markNaming = new Scanner(System.in);
                markName = markNaming.nextLine();

                System.out.println("Please insert Samsung Model Name: ");

                Scanner enterModelName = new Scanner(System.in);
                modelName = enterModelName.nextLine();

                phone.setModel(modelName);

                System.out.println("Please insert Samsung Memory: ");

                Scanner enterMemory = new Scanner(System.in);
                memory = enterMemory.nextInt();
                phone.setMemory(memory);

            }

            if (phone instanceof IPhone) {

                System.out.println("Please insert Mark Name: ");
                Scanner markNaming = new Scanner(System.in);
                markName = markNaming.nextLine();

                System.out.println("Please insert IPhone Model Name: ");

                Scanner enterModelName = new Scanner(System.in);
                modelName = enterModelName.nextLine();

                phone.setModel(modelName);

                System.out.println("Please insert IPhone Memory: ");

                Scanner enterMemory = new Scanner(System.in);
                memory = enterMemory.nextInt();
                phone.setMemory(memory);

            }


            System.out.println("Please insert Payment Sum: ");

            Scanner enterPaymentSum = new Scanner(System.in);
            paymentSum = enterPaymentSum.nextInt();

            /*
             * insert "OK" string for confirmation of our order
             */
            System.out.println("Please confirm payment: ");
            Scanner confirm = new Scanner(System.in);
            confirmation = confirm.nextLine();
            //confirmPayment = confirmation.contentEquals("OK");

            System.out.println("Please enter Client Address: ");
            Scanner enterClientAddress = new Scanner(System.in);
            address = enterClientAddress.nextLine();


            Client client = new Client(paymentSum, address, confirmation.contentEquals("OK"));

            if (client.getConfirmPayment() == true) {

                System.out.println("Send Client Invoice: ");

                if (phone instanceof Samsung)
                System.out.println(markName + " " + phone.getModel() + " " + phone.getOsType1()
                        + " " + phone.getMemory() + "GB "
                        + phone.getMadeIn() + " " + client.getPaymentSum() + " " + client.getAddress());

                if (phone instanceof IPhone)
                    System.out.println(markName + " " + phone.getModel() + " " + phone.getOsType2()
                            + " " + phone.getMemory() + "GB "
                            + phone.getMadeIn() + " " + client.getPaymentSum() + " " + client.getAddress());
            } else
                System.out.println("Error! Please pay for you Order!");
        }
    }
}

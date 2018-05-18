package ok.hw3;


/**
 * Created by admin on 24.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.dollar.setSum(6500);

        System.out.println(client.dollar.getSum());

        if (client.dollar instanceof Dollar){
            System.out.println("USA");
        }else {
            System.out.println("UA");
        }
    }
}

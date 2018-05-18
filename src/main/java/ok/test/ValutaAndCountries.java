package ok.test;


public class ValutaAndCountries {

    public static String addressDelivery(String s){
        String address = "";
        if (s.contentEquals("UAH"))
            address = "Ukraine";
        if(s.contentEquals("EUR"))
            address = "EU Countries";
        if(s.contentEquals("USD"))
            address = "USA";
        return address;
    }
}

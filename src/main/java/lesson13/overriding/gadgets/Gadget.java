package lesson13.overriding.gadgets;

public class Gadget {

    private double price;

    public Gadget(double price) {
        this.price = price;
    }

    public String nameYourCharacteristics(){
        return "Gadget{price='$"  + price + '\'' + "}";
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void greet(){
        System.out.println("Hello from Gadget");
    }

}

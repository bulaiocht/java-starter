package test;


public class Nissan extends Cars {

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    protected void warranty() {
        System.out.println("The period for the New Vehicle Warranty is the following designated period of \n" +
                "time or specified mileage, starting from the date that the vehicle is first registered or \n" +
                "put into service whichever comes first.\n" +
                "PERIOD: 3 years\n" +
                "MILEAGE: 100,000 km");
    }
}

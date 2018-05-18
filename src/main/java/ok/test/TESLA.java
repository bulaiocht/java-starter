package test;

public class TESLA extends Cars {

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    protected void warranty() {
        System.out.println("Basic Vehicle Limited Warranty\n" +
                "Subject to separate coverage for certain parts and the exclusions and limitations described in this\n" +
                "New Vehicle Limited Warranty, the Basic Vehicle Limited Warranty covers the repair or\n" +
                "replacement necessary to correct defects in the materials or workmanship of any parts\n" +
                "manufactured or supplied by Tesla that occur under normal use for a period of 4 years or 50,000\n" +
                "miles (80,000 km), whichever comes first. " +
                "\nThere is no warranty for Tesla cars in Commonwealth of Independent States (CIS)");
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }
}

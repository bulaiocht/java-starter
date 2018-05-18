package ok.test;


public class BMW extends Cars {

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
        System.out.println("For vehicles registered for the first time since January 1st, 2004, " +
                "your BMW Service Partner has \nextended the warranty for the bodywork to twelve years, " +
                "and for the paintwork to three years. \n" +
                "The entire car (except for wearing parts), " +
                "all Original BMW Parts and Original BMW Accessories come with a two-year \nwarranty with no " +
                "distance limit, running from the date of handover.");
    }
}

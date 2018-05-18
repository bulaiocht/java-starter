package test;


public class Client {

    private Double sumCost;
    private String address;
    private Boolean confirmPayment;
    private String country;

    public Client(Double sumCost, String address, Boolean confirmPayment, String country) {
        this.sumCost = sumCost;
        this.address = address;
        this.confirmPayment = confirmPayment;
        this.country = country;
    }

    public Client(){

    }

    public Double getSumCost() {
        return sumCost;
    }

    public void setSumCost(Double sumCost) {
        this.sumCost = sumCost;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getConfirmPayment() {
        return confirmPayment;
    }

    public void setConfirmPayment(Boolean confirmPayment) {
        this.confirmPayment = confirmPayment;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

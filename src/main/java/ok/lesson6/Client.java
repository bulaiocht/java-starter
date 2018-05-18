package lesson6;


public class Client {

    private Integer paymentSum;
    private String address;
    private Boolean confirmPayment;

//    public Client(Integer paymentSum, String address, Boolean confirmPayment) {
//        this.paymentSum = paymentSum;
//        this.confirmPayment = confirmPayment;
//        this.address = address;
//    }

    public Client(Integer paymentSum, String address, Boolean confirmPayment) {
        this.paymentSum = paymentSum;
        this.address = address;
        this.confirmPayment = confirmPayment;
    }

    public Client(Integer paymentSum, String address){
        Integer x = new Integer(0);
        x = 10;
    }

    public Client() {
    }

    public Integer getPaymentSum() {
        return paymentSum;
    }

    public Boolean getConfirmPayment() {
        return confirmPayment;
    }

    public String getAddress() {
        return address;
    }

    public void setPaymentSum(Integer paymentSum) {
        this.paymentSum = paymentSum;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setConfirmPayment(Boolean confirmPayment) {
        this.confirmPayment = confirmPayment;
    }
}

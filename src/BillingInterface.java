public interface BillingInterface {
    void verifyPayment();
    void discount();

}

class Billing implements BillingInterface {

    public void verifyPayment() {
        System.out.println("You have successfully paid! ");

    }


    public void discount() {
        System.out.println("You have 30% off your payment!");

    }
}




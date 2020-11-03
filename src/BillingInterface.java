import java.util.*;

public interface BillingInterface {
    public void payWithCash();
    public void payWithCard();
    public void verifyPayment();
    public void receipt();
    public void discount();

}

class Billing implements BillingInterface {

    @Override
    public void payWithCash() {

    }

    @Override
    public void payWithCard() {

    }

    public void verifyPayment() {
        System.out.println("You have successfully paid! ");

    }

    @Override
    public void receipt() {

    }

    @Override
    public void discount() {
        System.out.println("You have 30% off your payment!");

    }
}




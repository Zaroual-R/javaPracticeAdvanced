package design_pattern.strategy;

public class PaypalPayement implements PaymentStrategy {


    private String email;

    public PaypalPayement(String email) {
        this.email = email;
    }
    @Override
    public void pay(int a) {
        System.out.println("Paypal payment with email " + email+" and amount is: "+a);
    }
}

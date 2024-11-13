package design_pattern.strategy;

public class CreditCardPayement implements PaymentStrategy {

    private String cardNumber;

    public CreditCardPayement(String cardNumber) {
        this.cardNumber = cardNumber;
    }


    @Override
    public void pay(int a) {
        System.out.println("tha amaount:"+a+" of credit card number: "+cardNumber   );
    }
}

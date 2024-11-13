package design_pattern.strategy;

public class StrategyPaiementExample {
    public static void main(String[] args) {
        ShopingCard cart = new ShopingCard();

        // Set payment strategy to Credit Card
        cart.setPaymentStrategy(new CreditCardPayement("1234-5678-9012-3456"));
        cart.checkOut(100);

        // Change payment strategy to PayPal
        cart.setPaymentStrategy(new PaypalPayement("user@example.com"));
        cart.checkOut(200);
    }
}

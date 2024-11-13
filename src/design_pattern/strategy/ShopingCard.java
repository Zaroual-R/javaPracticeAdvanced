package design_pattern.strategy;

public class ShopingCard {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkOut(int amount){
        if(paymentStrategy==null){
            throw new IllegalStateException("payment strategy not set");
        }
        paymentStrategy.pay(amount);
    }
}

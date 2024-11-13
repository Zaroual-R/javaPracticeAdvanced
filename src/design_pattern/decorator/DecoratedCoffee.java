package design_pattern.decorator;

public abstract class DecoratedCoffee {
    protected Coffee decoratedCoffee;

    public DecoratedCoffee(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    public double cost() {
        return decoratedCoffee.cost();
    }
}

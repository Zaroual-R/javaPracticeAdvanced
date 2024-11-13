package design_pattern.decorator;

public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "its a simple coffee";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}

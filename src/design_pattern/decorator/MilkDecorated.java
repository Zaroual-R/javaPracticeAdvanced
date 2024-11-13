package design_pattern.decorator;

public class MilkDecorated extends DecoratedCoffee{

    public MilkDecorated(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public String getDescription() {
        return decoratedCoffee.getDescription()+" with milk ";
    }

    public double cost(){
        return decoratedCoffee.cost() + 1.0;
    }



}

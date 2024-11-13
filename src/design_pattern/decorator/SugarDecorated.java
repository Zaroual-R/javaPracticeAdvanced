package design_pattern.decorator;

public class SugarDecorated extends DecoratedCoffee{


    public SugarDecorated(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public String getDescription() {
        return decoratedCoffee.getDescription()+" with sugar ";
    }

    public double cost(){
        return decoratedCoffee.cost() + 2.0;
    }
}

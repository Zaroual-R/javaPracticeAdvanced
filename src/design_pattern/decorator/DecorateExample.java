package design_pattern.decorator;

public class DecorateExample {
    public static void main(String[] args) {
        Coffee coffee=new SimpleCoffee();
        System.out.println(coffee.getDescription()+"price: "+coffee.cost());

        MilkDecorated milkcoffee=new MilkDecorated(coffee);
        System.out.println(milkcoffee.getDescription()+"price: "+milkcoffee.cost());

        SugarDecorated sugarcoffee=new SugarDecorated(coffee);
        System.out.println(sugarcoffee.getDescription()+"price: "+sugarcoffee.cost());
    }
}

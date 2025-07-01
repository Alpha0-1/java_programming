/**
 * @file 3-decorator_pattern.java
 * @brief Decorator Pattern Implementation
 *
 * Adds behavior to objects dynamically without affecting the behavior of other objects of the same class.
 */

interface Coffee {
    double cost();
    String description();
}

class SimpleCoffee implements Coffee {
    @Override
    public double cost() {
        return 2.0;
    }

    @Override
    public String description() {
        return "Simple Coffee";
    }
}

class MilkDecorator implements Coffee {
    private Coffee decoratedCoffee;

    public MilkDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 0.5;
    }

    @Override
    public String description() {
        return decoratedCoffee.description() + ", Milk";
    }
}

class SugarDecorator implements Coffee {
    private Coffee decoratedCoffee;

    public SugarDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 0.2;
    }

    @Override
    public String description() {
        return decoratedCoffee.description() + ", Sugar";
    }
}

public class MainDecorator {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.description() + " costs $" + coffee.cost());

        Coffee milkCoffee = new MilkDecorator(new SimpleCoffee());
        System.out.println(milkCoffee.description() + " costs $" + milkCoffee.cost());

        Coffee sugarMilkCoffee = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
        System.out.println(sugarMilkCoffee.description() + " costs $" + sugarMilkCoffee.cost());
    }
}

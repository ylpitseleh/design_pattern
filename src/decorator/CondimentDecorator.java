package decorator;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    abstract String getDescription();

}

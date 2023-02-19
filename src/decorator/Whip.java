package decorator;

public class Whip extends CondimentDecorator {

    Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    double cost() {
        return beverage.cost() + 0.25;
    }

    @Override
    String getDescription() {
        return beverage.getDescription() + ", 휘핑크림";
    }

}

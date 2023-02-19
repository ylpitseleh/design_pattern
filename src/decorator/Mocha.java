package decorator;

public class Mocha extends CondimentDecorator {

    Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL) {
            cost += 0.10;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += 0.15;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += 0.20;
        }
        return cost;
    }

    @Override
    String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

}

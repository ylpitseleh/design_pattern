package decorator;

public class Decaf extends Beverage {

    Decaf() {
        description = "디카페인 커피";
    }

    @Override
    double cost() {
        return 0.89;
    }

}


package decorator;

public class Main {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage.setSize(Beverage.Size.VENTI);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage espressoWithMocha = new Mocha(beverage);
        espressoWithMocha.setSize(Beverage.Size.GRANDE);
        espressoWithMocha = new Mocha(espressoWithMocha); // 모카샷 추가
        System.out.println(espressoWithMocha.getDescription() + " $" + espressoWithMocha.cost());
    }
}

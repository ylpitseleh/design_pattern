package factory.factory_method;

class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String item) { // 팩토리 메소드
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}

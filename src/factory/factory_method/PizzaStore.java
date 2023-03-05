package factory.factory_method;

abstract class PizzaStore {
    abstract Pizza createPizza(String item);

    Pizza orderPizza(String type) { // 팩토리 메소드 패턴이 특화된 템플릿 메소드 패턴이라고 불리는 이유
        Pizza pizza = createPizza(type); // 생성을 캡슐화

        System.out.println("--- Making a " + pizza.getName() + " ---");
        // 템플릿 메소드처럼 알고리즘을 캡슐화
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}

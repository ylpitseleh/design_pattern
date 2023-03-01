package factory.abstract_factory;

// 제품군을 생산하는 추상 인터페이스를 제공한다.
// 추상 팩토리로 구현되어 있다. 제품군(원재료들)을 만들어야 하기 때문이다. 각 서브클래스는 지역별 공급업체로부터 재료를 구현한다.
interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

}

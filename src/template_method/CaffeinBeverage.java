package template_method;

public abstract class CaffeinBeverage {
    final void prepareRecipe() { // 템플릿 메소드. final로 오버라이드 금지
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) { // 후크
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("물 끓이는 중");
    }

    void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    boolean customerWantsCondiments() { // 서브클래스에서 오버라이드 할 수 있다.
        return true;
    }
}
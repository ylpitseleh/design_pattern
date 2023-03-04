package template_method;

public class Coffee extends CaffeinBeverage {
    @Override
    public void brew() {
        System.out.println("커피를 우려낸다.");
    }

    @Override
    public void addCondiments() {
        System.out.println("설탕과 우유를 추가한다.");
    }
}

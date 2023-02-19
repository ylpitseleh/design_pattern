package strategy;

public class Main {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        // 실행 중에 오리의 행동을 바꾸고 싶으면 원하는 행동에 해당하는 Duck의 setter 메소드를 호출한다.
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.setQuackBehavior(new Squeak());
        mallard.performFly();
        mallard.performQuack();
    }
}
